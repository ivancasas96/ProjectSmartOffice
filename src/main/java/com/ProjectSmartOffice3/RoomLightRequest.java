// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceLight.proto

package com.ProjectSmartOffice3;

/**
 * <pre>
 * Bidirectional RPC to control the lights
 * </pre>
 *
 * Protobuf type {@code ServiceLight.RoomLightRequest}
 */
public  final class RoomLightRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceLight.RoomLightRequest)
    RoomLightRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomLightRequest.newBuilder() to construct.
  private RoomLightRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomLightRequest() {
    rooms_ = "";
    lightState_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomLightRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            rooms_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            lightState_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_RoomLightRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_RoomLightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ProjectSmartOffice3.RoomLightRequest.class, com.ProjectSmartOffice3.RoomLightRequest.Builder.class);
  }

  public static final int ROOMS_FIELD_NUMBER = 1;
  private volatile java.lang.Object rooms_;
  /**
   * <code>string rooms = 1;</code>
   */
  public java.lang.String getRooms() {
    java.lang.Object ref = rooms_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rooms_ = s;
      return s;
    }
  }
  /**
   * <code>string rooms = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoomsBytes() {
    java.lang.Object ref = rooms_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rooms_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIGHT_STATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object lightState_;
  /**
   * <code>string light_state = 2;</code>
   */
  public java.lang.String getLightState() {
    java.lang.Object ref = lightState_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lightState_ = s;
      return s;
    }
  }
  /**
   * <code>string light_state = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLightStateBytes() {
    java.lang.Object ref = lightState_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lightState_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRoomsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rooms_);
    }
    if (!getLightStateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lightState_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoomsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rooms_);
    }
    if (!getLightStateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lightState_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ProjectSmartOffice3.RoomLightRequest)) {
      return super.equals(obj);
    }
    com.ProjectSmartOffice3.RoomLightRequest other = (com.ProjectSmartOffice3.RoomLightRequest) obj;

    boolean result = true;
    result = result && getRooms()
        .equals(other.getRooms());
    result = result && getLightState()
        .equals(other.getLightState());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROOMS_FIELD_NUMBER;
    hash = (53 * hash) + getRooms().hashCode();
    hash = (37 * hash) + LIGHT_STATE_FIELD_NUMBER;
    hash = (53 * hash) + getLightState().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.RoomLightRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ProjectSmartOffice3.RoomLightRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Bidirectional RPC to control the lights
   * </pre>
   *
   * Protobuf type {@code ServiceLight.RoomLightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceLight.RoomLightRequest)
      com.ProjectSmartOffice3.RoomLightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_RoomLightRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_RoomLightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ProjectSmartOffice3.RoomLightRequest.class, com.ProjectSmartOffice3.RoomLightRequest.Builder.class);
    }

    // Construct using com.ProjectSmartOffice3.RoomLightRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      rooms_ = "";

      lightState_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_RoomLightRequest_descriptor;
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.RoomLightRequest getDefaultInstanceForType() {
      return com.ProjectSmartOffice3.RoomLightRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.RoomLightRequest build() {
      com.ProjectSmartOffice3.RoomLightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.RoomLightRequest buildPartial() {
      com.ProjectSmartOffice3.RoomLightRequest result = new com.ProjectSmartOffice3.RoomLightRequest(this);
      result.rooms_ = rooms_;
      result.lightState_ = lightState_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ProjectSmartOffice3.RoomLightRequest) {
        return mergeFrom((com.ProjectSmartOffice3.RoomLightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ProjectSmartOffice3.RoomLightRequest other) {
      if (other == com.ProjectSmartOffice3.RoomLightRequest.getDefaultInstance()) return this;
      if (!other.getRooms().isEmpty()) {
        rooms_ = other.rooms_;
        onChanged();
      }
      if (!other.getLightState().isEmpty()) {
        lightState_ = other.lightState_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ProjectSmartOffice3.RoomLightRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ProjectSmartOffice3.RoomLightRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object rooms_ = "";
    /**
     * <code>string rooms = 1;</code>
     */
    public java.lang.String getRooms() {
      java.lang.Object ref = rooms_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rooms_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rooms = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoomsBytes() {
      java.lang.Object ref = rooms_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rooms_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rooms = 1;</code>
     */
    public Builder setRooms(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rooms_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rooms = 1;</code>
     */
    public Builder clearRooms() {
      
      rooms_ = getDefaultInstance().getRooms();
      onChanged();
      return this;
    }
    /**
     * <code>string rooms = 1;</code>
     */
    public Builder setRoomsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rooms_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lightState_ = "";
    /**
     * <code>string light_state = 2;</code>
     */
    public java.lang.String getLightState() {
      java.lang.Object ref = lightState_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lightState_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string light_state = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLightStateBytes() {
      java.lang.Object ref = lightState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lightState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string light_state = 2;</code>
     */
    public Builder setLightState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lightState_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string light_state = 2;</code>
     */
    public Builder clearLightState() {
      
      lightState_ = getDefaultInstance().getLightState();
      onChanged();
      return this;
    }
    /**
     * <code>string light_state = 2;</code>
     */
    public Builder setLightStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lightState_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ServiceLight.RoomLightRequest)
  }

  // @@protoc_insertion_point(class_scope:ServiceLight.RoomLightRequest)
  private static final com.ProjectSmartOffice3.RoomLightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ProjectSmartOffice3.RoomLightRequest();
  }

  public static com.ProjectSmartOffice3.RoomLightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomLightRequest>
      PARSER = new com.google.protobuf.AbstractParser<RoomLightRequest>() {
    @java.lang.Override
    public RoomLightRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomLightRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomLightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomLightRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ProjectSmartOffice3.RoomLightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

