/*
 * Copyright 2018-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.rules.modern.builders.grpc;

import com.facebook.buck.rules.modern.builders.IsolatedExecution;
import com.facebook.buck.rules.modern.builders.LocalContentAddressedStorage;
import com.facebook.buck.util.NamedTemporaryDirectory;
import com.facebook.buck.util.concurrent.MostExecutors;
import com.google.common.io.Closer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/** Factory for creating grpc-based strategies. */
public class GrpcExecutionFactory {

  /**
   * The in-process strategy starts up a grpc remote execution service in process and connects to it
   * directly.
   */
  public static IsolatedExecution createInProcess() throws IOException {
    NamedTemporaryDirectory workDir = new NamedTemporaryDirectory("__remote__");
    GrpcRemoteExecutionServiceImpl remoteExecution =
        new GrpcRemoteExecutionServiceImpl(
            new LocalContentAddressedStorage(
                workDir.getPath().resolve("__cache__"), GrpcRemoteExecution.PROTOCOL),
            workDir.getPath().resolve("__work__"));
    ExecutorService serverExecutor = MostExecutors.newMultiThreadExecutor("remote-execution", 8);
    InProcessServerBuilder builder =
        InProcessServerBuilder.forName("unique").executor(serverExecutor);
    remoteExecution.getServices().forEach(builder::addService);
    Server server = builder.build().start();
    ManagedChannel channel =
        InProcessChannelBuilder.forName("unique").executor(serverExecutor).build();

    return new GrpcRemoteExecution("in-process", channel) {
      @Override
      public void close() throws IOException {
        try (Closer closer = Closer.create()) {
          closer.register(server::shutdown);
          closer.register(channel::shutdown);
          closer.register(workDir);
          closer.register(super::close);
        }
        try {
          channel.awaitTermination(3, TimeUnit.SECONDS);
          server.awaitTermination();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };
  }

  /** The remote strategy connects to a remote grpc remote execution service. */
  public static IsolatedExecution createRemote(String host, int port) throws IOException {
    Executor executor = MostExecutors.newMultiThreadExecutor("remote-exec-client", 4);
    ManagedChannel channel =
        ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).executor(executor).build();

    return new GrpcRemoteExecution("buck", channel) {
      @Override
      public void close() throws IOException {
        channel.shutdown();
        try {
          channel.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };
  }
}
