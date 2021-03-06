/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-05-08")
public class BuildSlaveRequest implements org.apache.thrift.TBase<BuildSlaveRequest, BuildSlaveRequest._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GET_ALL_AVAILABLE_CAPACITY_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("getAllAvailableCapacityRequest", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OBTAIN_CAPACITY_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("obtainCapacityRequest", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("obtainAllAvailableCapacityRequest", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField RETURN_CAPACITY_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("returnCapacityRequest", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildSlaveRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildSlaveRequestTupleSchemeFactory();

  /**
   * 
   * @see BuildSlaveRequestType
   */
  public BuildSlaveRequestType type; // optional
  public GetAllAvailableCapacityRequest getAllAvailableCapacityRequest; // optional
  public ObtainCapacityRequest obtainCapacityRequest; // optional
  public ObtainAllAvailableCapacityRequest obtainAllAvailableCapacityRequest; // optional
  public ReturnCapacityRequest returnCapacityRequest; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuildSlaveRequestType
     */
    TYPE((short)1, "type"),
    GET_ALL_AVAILABLE_CAPACITY_REQUEST((short)2, "getAllAvailableCapacityRequest"),
    OBTAIN_CAPACITY_REQUEST((short)3, "obtainCapacityRequest"),
    OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST((short)4, "obtainAllAvailableCapacityRequest"),
    RETURN_CAPACITY_REQUEST((short)5, "returnCapacityRequest");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // GET_ALL_AVAILABLE_CAPACITY_REQUEST
          return GET_ALL_AVAILABLE_CAPACITY_REQUEST;
        case 3: // OBTAIN_CAPACITY_REQUEST
          return OBTAIN_CAPACITY_REQUEST;
        case 4: // OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST
          return OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST;
        case 5: // RETURN_CAPACITY_REQUEST
          return RETURN_CAPACITY_REQUEST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.GET_ALL_AVAILABLE_CAPACITY_REQUEST,_Fields.OBTAIN_CAPACITY_REQUEST,_Fields.OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST,_Fields.RETURN_CAPACITY_REQUEST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildSlaveRequestType.class)));
    tmpMap.put(_Fields.GET_ALL_AVAILABLE_CAPACITY_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("getAllAvailableCapacityRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GetAllAvailableCapacityRequest.class)));
    tmpMap.put(_Fields.OBTAIN_CAPACITY_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("obtainCapacityRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ObtainCapacityRequest.class)));
    tmpMap.put(_Fields.OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("obtainAllAvailableCapacityRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ObtainAllAvailableCapacityRequest.class)));
    tmpMap.put(_Fields.RETURN_CAPACITY_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("returnCapacityRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReturnCapacityRequest.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveRequest.class, metaDataMap);
  }

  public BuildSlaveRequest() {
    this.type = com.facebook.buck.distributed.thrift.BuildSlaveRequestType.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveRequest(BuildSlaveRequest other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetGetAllAvailableCapacityRequest()) {
      this.getAllAvailableCapacityRequest = new GetAllAvailableCapacityRequest(other.getAllAvailableCapacityRequest);
    }
    if (other.isSetObtainCapacityRequest()) {
      this.obtainCapacityRequest = new ObtainCapacityRequest(other.obtainCapacityRequest);
    }
    if (other.isSetObtainAllAvailableCapacityRequest()) {
      this.obtainAllAvailableCapacityRequest = new ObtainAllAvailableCapacityRequest(other.obtainAllAvailableCapacityRequest);
    }
    if (other.isSetReturnCapacityRequest()) {
      this.returnCapacityRequest = new ReturnCapacityRequest(other.returnCapacityRequest);
    }
  }

  public BuildSlaveRequest deepCopy() {
    return new BuildSlaveRequest(this);
  }

  @Override
  public void clear() {
    this.type = com.facebook.buck.distributed.thrift.BuildSlaveRequestType.UNKNOWN;

    this.getAllAvailableCapacityRequest = null;
    this.obtainCapacityRequest = null;
    this.obtainAllAvailableCapacityRequest = null;
    this.returnCapacityRequest = null;
  }

  /**
   * 
   * @see BuildSlaveRequestType
   */
  public BuildSlaveRequestType getType() {
    return this.type;
  }

  /**
   * 
   * @see BuildSlaveRequestType
   */
  public BuildSlaveRequest setType(BuildSlaveRequestType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public GetAllAvailableCapacityRequest getGetAllAvailableCapacityRequest() {
    return this.getAllAvailableCapacityRequest;
  }

  public BuildSlaveRequest setGetAllAvailableCapacityRequest(GetAllAvailableCapacityRequest getAllAvailableCapacityRequest) {
    this.getAllAvailableCapacityRequest = getAllAvailableCapacityRequest;
    return this;
  }

  public void unsetGetAllAvailableCapacityRequest() {
    this.getAllAvailableCapacityRequest = null;
  }

  /** Returns true if field getAllAvailableCapacityRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetGetAllAvailableCapacityRequest() {
    return this.getAllAvailableCapacityRequest != null;
  }

  public void setGetAllAvailableCapacityRequestIsSet(boolean value) {
    if (!value) {
      this.getAllAvailableCapacityRequest = null;
    }
  }

  public ObtainCapacityRequest getObtainCapacityRequest() {
    return this.obtainCapacityRequest;
  }

  public BuildSlaveRequest setObtainCapacityRequest(ObtainCapacityRequest obtainCapacityRequest) {
    this.obtainCapacityRequest = obtainCapacityRequest;
    return this;
  }

  public void unsetObtainCapacityRequest() {
    this.obtainCapacityRequest = null;
  }

  /** Returns true if field obtainCapacityRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetObtainCapacityRequest() {
    return this.obtainCapacityRequest != null;
  }

  public void setObtainCapacityRequestIsSet(boolean value) {
    if (!value) {
      this.obtainCapacityRequest = null;
    }
  }

  public ObtainAllAvailableCapacityRequest getObtainAllAvailableCapacityRequest() {
    return this.obtainAllAvailableCapacityRequest;
  }

  public BuildSlaveRequest setObtainAllAvailableCapacityRequest(ObtainAllAvailableCapacityRequest obtainAllAvailableCapacityRequest) {
    this.obtainAllAvailableCapacityRequest = obtainAllAvailableCapacityRequest;
    return this;
  }

  public void unsetObtainAllAvailableCapacityRequest() {
    this.obtainAllAvailableCapacityRequest = null;
  }

  /** Returns true if field obtainAllAvailableCapacityRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetObtainAllAvailableCapacityRequest() {
    return this.obtainAllAvailableCapacityRequest != null;
  }

  public void setObtainAllAvailableCapacityRequestIsSet(boolean value) {
    if (!value) {
      this.obtainAllAvailableCapacityRequest = null;
    }
  }

  public ReturnCapacityRequest getReturnCapacityRequest() {
    return this.returnCapacityRequest;
  }

  public BuildSlaveRequest setReturnCapacityRequest(ReturnCapacityRequest returnCapacityRequest) {
    this.returnCapacityRequest = returnCapacityRequest;
    return this;
  }

  public void unsetReturnCapacityRequest() {
    this.returnCapacityRequest = null;
  }

  /** Returns true if field returnCapacityRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnCapacityRequest() {
    return this.returnCapacityRequest != null;
  }

  public void setReturnCapacityRequestIsSet(boolean value) {
    if (!value) {
      this.returnCapacityRequest = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((BuildSlaveRequestType)value);
      }
      break;

    case GET_ALL_AVAILABLE_CAPACITY_REQUEST:
      if (value == null) {
        unsetGetAllAvailableCapacityRequest();
      } else {
        setGetAllAvailableCapacityRequest((GetAllAvailableCapacityRequest)value);
      }
      break;

    case OBTAIN_CAPACITY_REQUEST:
      if (value == null) {
        unsetObtainCapacityRequest();
      } else {
        setObtainCapacityRequest((ObtainCapacityRequest)value);
      }
      break;

    case OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST:
      if (value == null) {
        unsetObtainAllAvailableCapacityRequest();
      } else {
        setObtainAllAvailableCapacityRequest((ObtainAllAvailableCapacityRequest)value);
      }
      break;

    case RETURN_CAPACITY_REQUEST:
      if (value == null) {
        unsetReturnCapacityRequest();
      } else {
        setReturnCapacityRequest((ReturnCapacityRequest)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case GET_ALL_AVAILABLE_CAPACITY_REQUEST:
      return getGetAllAvailableCapacityRequest();

    case OBTAIN_CAPACITY_REQUEST:
      return getObtainCapacityRequest();

    case OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST:
      return getObtainAllAvailableCapacityRequest();

    case RETURN_CAPACITY_REQUEST:
      return getReturnCapacityRequest();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case GET_ALL_AVAILABLE_CAPACITY_REQUEST:
      return isSetGetAllAvailableCapacityRequest();
    case OBTAIN_CAPACITY_REQUEST:
      return isSetObtainCapacityRequest();
    case OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST:
      return isSetObtainAllAvailableCapacityRequest();
    case RETURN_CAPACITY_REQUEST:
      return isSetReturnCapacityRequest();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveRequest)
      return this.equals((BuildSlaveRequest)that);
    return false;
  }

  public boolean equals(BuildSlaveRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_getAllAvailableCapacityRequest = true && this.isSetGetAllAvailableCapacityRequest();
    boolean that_present_getAllAvailableCapacityRequest = true && that.isSetGetAllAvailableCapacityRequest();
    if (this_present_getAllAvailableCapacityRequest || that_present_getAllAvailableCapacityRequest) {
      if (!(this_present_getAllAvailableCapacityRequest && that_present_getAllAvailableCapacityRequest))
        return false;
      if (!this.getAllAvailableCapacityRequest.equals(that.getAllAvailableCapacityRequest))
        return false;
    }

    boolean this_present_obtainCapacityRequest = true && this.isSetObtainCapacityRequest();
    boolean that_present_obtainCapacityRequest = true && that.isSetObtainCapacityRequest();
    if (this_present_obtainCapacityRequest || that_present_obtainCapacityRequest) {
      if (!(this_present_obtainCapacityRequest && that_present_obtainCapacityRequest))
        return false;
      if (!this.obtainCapacityRequest.equals(that.obtainCapacityRequest))
        return false;
    }

    boolean this_present_obtainAllAvailableCapacityRequest = true && this.isSetObtainAllAvailableCapacityRequest();
    boolean that_present_obtainAllAvailableCapacityRequest = true && that.isSetObtainAllAvailableCapacityRequest();
    if (this_present_obtainAllAvailableCapacityRequest || that_present_obtainAllAvailableCapacityRequest) {
      if (!(this_present_obtainAllAvailableCapacityRequest && that_present_obtainAllAvailableCapacityRequest))
        return false;
      if (!this.obtainAllAvailableCapacityRequest.equals(that.obtainAllAvailableCapacityRequest))
        return false;
    }

    boolean this_present_returnCapacityRequest = true && this.isSetReturnCapacityRequest();
    boolean that_present_returnCapacityRequest = true && that.isSetReturnCapacityRequest();
    if (this_present_returnCapacityRequest || that_present_returnCapacityRequest) {
      if (!(this_present_returnCapacityRequest && that_present_returnCapacityRequest))
        return false;
      if (!this.returnCapacityRequest.equals(that.returnCapacityRequest))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetGetAllAvailableCapacityRequest()) ? 131071 : 524287);
    if (isSetGetAllAvailableCapacityRequest())
      hashCode = hashCode * 8191 + getAllAvailableCapacityRequest.hashCode();

    hashCode = hashCode * 8191 + ((isSetObtainCapacityRequest()) ? 131071 : 524287);
    if (isSetObtainCapacityRequest())
      hashCode = hashCode * 8191 + obtainCapacityRequest.hashCode();

    hashCode = hashCode * 8191 + ((isSetObtainAllAvailableCapacityRequest()) ? 131071 : 524287);
    if (isSetObtainAllAvailableCapacityRequest())
      hashCode = hashCode * 8191 + obtainAllAvailableCapacityRequest.hashCode();

    hashCode = hashCode * 8191 + ((isSetReturnCapacityRequest()) ? 131071 : 524287);
    if (isSetReturnCapacityRequest())
      hashCode = hashCode * 8191 + returnCapacityRequest.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildSlaveRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGetAllAvailableCapacityRequest()).compareTo(other.isSetGetAllAvailableCapacityRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetAllAvailableCapacityRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.getAllAvailableCapacityRequest, other.getAllAvailableCapacityRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetObtainCapacityRequest()).compareTo(other.isSetObtainCapacityRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObtainCapacityRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.obtainCapacityRequest, other.obtainCapacityRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetObtainAllAvailableCapacityRequest()).compareTo(other.isSetObtainAllAvailableCapacityRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObtainAllAvailableCapacityRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.obtainAllAvailableCapacityRequest, other.obtainAllAvailableCapacityRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReturnCapacityRequest()).compareTo(other.isSetReturnCapacityRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnCapacityRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnCapacityRequest, other.returnCapacityRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildSlaveRequest(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetGetAllAvailableCapacityRequest()) {
      if (!first) sb.append(", ");
      sb.append("getAllAvailableCapacityRequest:");
      if (this.getAllAvailableCapacityRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.getAllAvailableCapacityRequest);
      }
      first = false;
    }
    if (isSetObtainCapacityRequest()) {
      if (!first) sb.append(", ");
      sb.append("obtainCapacityRequest:");
      if (this.obtainCapacityRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.obtainCapacityRequest);
      }
      first = false;
    }
    if (isSetObtainAllAvailableCapacityRequest()) {
      if (!first) sb.append(", ");
      sb.append("obtainAllAvailableCapacityRequest:");
      if (this.obtainAllAvailableCapacityRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.obtainAllAvailableCapacityRequest);
      }
      first = false;
    }
    if (isSetReturnCapacityRequest()) {
      if (!first) sb.append(", ");
      sb.append("returnCapacityRequest:");
      if (this.returnCapacityRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.returnCapacityRequest);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (getAllAvailableCapacityRequest != null) {
      getAllAvailableCapacityRequest.validate();
    }
    if (obtainCapacityRequest != null) {
      obtainCapacityRequest.validate();
    }
    if (obtainAllAvailableCapacityRequest != null) {
      obtainAllAvailableCapacityRequest.validate();
    }
    if (returnCapacityRequest != null) {
      returnCapacityRequest.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildSlaveRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildSlaveRequestStandardScheme getScheme() {
      return new BuildSlaveRequestStandardScheme();
    }
  }

  private static class BuildSlaveRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildSlaveRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.facebook.buck.distributed.thrift.BuildSlaveRequestType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GET_ALL_AVAILABLE_CAPACITY_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.getAllAvailableCapacityRequest = new GetAllAvailableCapacityRequest();
              struct.getAllAvailableCapacityRequest.read(iprot);
              struct.setGetAllAvailableCapacityRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBTAIN_CAPACITY_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.obtainCapacityRequest = new ObtainCapacityRequest();
              struct.obtainCapacityRequest.read(iprot);
              struct.setObtainCapacityRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.obtainAllAvailableCapacityRequest = new ObtainAllAvailableCapacityRequest();
              struct.obtainAllAvailableCapacityRequest.read(iprot);
              struct.setObtainAllAvailableCapacityRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RETURN_CAPACITY_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.returnCapacityRequest = new ReturnCapacityRequest();
              struct.returnCapacityRequest.read(iprot);
              struct.setReturnCapacityRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.getAllAvailableCapacityRequest != null) {
        if (struct.isSetGetAllAvailableCapacityRequest()) {
          oprot.writeFieldBegin(GET_ALL_AVAILABLE_CAPACITY_REQUEST_FIELD_DESC);
          struct.getAllAvailableCapacityRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.obtainCapacityRequest != null) {
        if (struct.isSetObtainCapacityRequest()) {
          oprot.writeFieldBegin(OBTAIN_CAPACITY_REQUEST_FIELD_DESC);
          struct.obtainCapacityRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.obtainAllAvailableCapacityRequest != null) {
        if (struct.isSetObtainAllAvailableCapacityRequest()) {
          oprot.writeFieldBegin(OBTAIN_ALL_AVAILABLE_CAPACITY_REQUEST_FIELD_DESC);
          struct.obtainAllAvailableCapacityRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.returnCapacityRequest != null) {
        if (struct.isSetReturnCapacityRequest()) {
          oprot.writeFieldBegin(RETURN_CAPACITY_REQUEST_FIELD_DESC);
          struct.returnCapacityRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildSlaveRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildSlaveRequestTupleScheme getScheme() {
      return new BuildSlaveRequestTupleScheme();
    }
  }

  private static class BuildSlaveRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildSlaveRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetGetAllAvailableCapacityRequest()) {
        optionals.set(1);
      }
      if (struct.isSetObtainCapacityRequest()) {
        optionals.set(2);
      }
      if (struct.isSetObtainAllAvailableCapacityRequest()) {
        optionals.set(3);
      }
      if (struct.isSetReturnCapacityRequest()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetGetAllAvailableCapacityRequest()) {
        struct.getAllAvailableCapacityRequest.write(oprot);
      }
      if (struct.isSetObtainCapacityRequest()) {
        struct.obtainCapacityRequest.write(oprot);
      }
      if (struct.isSetObtainAllAvailableCapacityRequest()) {
        struct.obtainAllAvailableCapacityRequest.write(oprot);
      }
      if (struct.isSetReturnCapacityRequest()) {
        struct.returnCapacityRequest.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.type = com.facebook.buck.distributed.thrift.BuildSlaveRequestType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.getAllAvailableCapacityRequest = new GetAllAvailableCapacityRequest();
        struct.getAllAvailableCapacityRequest.read(iprot);
        struct.setGetAllAvailableCapacityRequestIsSet(true);
      }
      if (incoming.get(2)) {
        struct.obtainCapacityRequest = new ObtainCapacityRequest();
        struct.obtainCapacityRequest.read(iprot);
        struct.setObtainCapacityRequestIsSet(true);
      }
      if (incoming.get(3)) {
        struct.obtainAllAvailableCapacityRequest = new ObtainAllAvailableCapacityRequest();
        struct.obtainAllAvailableCapacityRequest.read(iprot);
        struct.setObtainAllAvailableCapacityRequestIsSet(true);
      }
      if (incoming.get(4)) {
        struct.returnCapacityRequest = new ReturnCapacityRequest();
        struct.returnCapacityRequest.read(iprot);
        struct.setReturnCapacityRequestIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

