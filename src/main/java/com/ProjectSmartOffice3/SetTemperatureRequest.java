// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceLight.proto

package com.ProjectSmartOffice3;

/**
 * <pre>
 * Request to change the temperature for a room
 * </pre>
 *
 * Protobuf type {@code ServiceLight.SetTemperatureRequest}
 */
public  final class SetTemperatureRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceLight.SetTemperatureRequest)
    SetTemperatureRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetTemperatureRequest.newBuilder() to construct.
  private SetTemperatureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetTemperatureRequest() {
    room_ = "";
    temperature_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetTemperatureRequest(
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

            room_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            temperature_ = s;
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
    return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_SetTemperatureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_SetTemperatureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ProjectSmartOffice3.SetTemperatureRequest.class, com.ProjectSmartOffice3.SetTemperatureRequest.Builder.class);
  }

  public static final int ROOM_FIELD_NUMBER = 1;
  private volatile java.lang.Object room_;
  /**
   * <code>string room = 1;</code>
   */
  public java.lang.String getRoom() {
    java.lang.Object ref = room_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      room_ = s;
      return s;
    }
  }
  /**
   * <code>string room = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoomBytes() {
    java.lang.Object ref = room_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      room_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 2;
  private volatile java.lang.Object temperature_;
  /**
   * <code>string temperature = 2;</code>
   */
  public java.lang.String getTemperature() {
    java.lang.Object ref = temperature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      temperature_ = s;
      return s;
    }
  }
  /**
   * <code>string temperature = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTemperatureBytes() {
    java.lang.Object ref = temperature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      temperature_ = b;
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
    if (!getRoomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, room_);
    }
    if (!getTemperatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, temperature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, room_);
    }
    if (!getTemperatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, temperature_);
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
    if (!(obj instanceof com.ProjectSmartOffice3.SetTemperatureRequest)) {
      return super.equals(obj);
    }
    com.ProjectSmartOffice3.SetTemperatureRequest other = (com.ProjectSmartOffice3.SetTemperatureRequest) obj;

    boolean result = true;
    result = result && getRoom()
        .equals(other.getRoom());
    result = result && getTemperature()
        .equals(other.getTemperature());
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
    hash = (37 * hash) + ROOM_FIELD_NUMBER;
    hash = (53 * hash) + getRoom().hashCode();
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice3.SetTemperatureRequest parseFrom(
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
  public static Builder newBuilder(com.ProjectSmartOffice3.SetTemperatureRequest prototype) {
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
   * Request to change the temperature for a room
   * </pre>
   *
   * Protobuf type {@code ServiceLight.SetTemperatureRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceLight.SetTemperatureRequest)
      com.ProjectSmartOffice3.SetTemperatureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_SetTemperatureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_SetTemperatureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ProjectSmartOffice3.SetTemperatureRequest.class, com.ProjectSmartOffice3.SetTemperatureRequest.Builder.class);
    }

    // Construct using com.ProjectSmartOffice3.SetTemperatureRequest.newBuilder()
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
      room_ = "";

      temperature_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.internal_static_ServiceLight_SetTemperatureRequest_descriptor;
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.SetTemperatureRequest getDefaultInstanceForType() {
      return com.ProjectSmartOffice3.SetTemperatureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.SetTemperatureRequest build() {
      com.ProjectSmartOffice3.SetTemperatureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ProjectSmartOffice3.SetTemperatureRequest buildPartial() {
      com.ProjectSmartOffice3.SetTemperatureRequest result = new com.ProjectSmartOffice3.SetTemperatureRequest(this);
      result.room_ = room_;
      result.temperature_ = temperature_;
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
      if (other instanceof com.ProjectSmartOffice3.SetTemperatureRequest) {
        return mergeFrom((com.ProjectSmartOffice3.SetTemperatureRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ProjectSmartOffice3.SetTemperatureRequest other) {
      if (other == com.ProjectSmartOffice3.SetTemperatureRequest.getDefaultInstance()) return this;
      if (!other.getRoom().isEmpty()) {
        room_ = other.room_;
        onChanged();
      }
      if (!other.getTemperature().isEmpty()) {
        temperature_ = other.temperature_;
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
      com.ProjectSmartOffice3.SetTemperatureRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ProjectSmartOffice3.SetTemperatureRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object room_ = "";
    /**
     * <code>string room = 1;</code>
     */
    public java.lang.String getRoom() {
      java.lang.Object ref = room_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        room_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string room = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoomBytes() {
      java.lang.Object ref = room_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        room_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string room = 1;</code>
     */
    public Builder setRoom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      room_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string room = 1;</code>
     */
    public Builder clearRoom() {
      
      room_ = getDefaultInstance().getRoom();
      onChanged();
      return this;
    }
    /**
     * <code>string room = 1;</code>
     */
    public Builder setRoomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      room_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object temperature_ = "";
    /**
     * <code>string temperature = 2;</code>
     */
    public java.lang.String getTemperature() {
      java.lang.Object ref = temperature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        temperature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string temperature = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTemperatureBytes() {
      java.lang.Object ref = temperature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        temperature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string temperature = 2;</code>
     */
    public Builder setTemperature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string temperature = 2;</code>
     */
    public Builder clearTemperature() {
      
      temperature_ = getDefaultInstance().getTemperature();
      onChanged();
      return this;
    }
    /**
     * <code>string temperature = 2;</code>
     */
    public Builder setTemperatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      temperature_ = value;
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


    // @@protoc_insertion_point(builder_scope:ServiceLight.SetTemperatureRequest)
  }

  // @@protoc_insertion_point(class_scope:ServiceLight.SetTemperatureRequest)
  private static final com.ProjectSmartOffice3.SetTemperatureRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ProjectSmartOffice3.SetTemperatureRequest();
  }

  public static com.ProjectSmartOffice3.SetTemperatureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetTemperatureRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetTemperatureRequest>() {
    @java.lang.Override
    public SetTemperatureRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetTemperatureRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetTemperatureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetTemperatureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ProjectSmartOffice3.SetTemperatureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
