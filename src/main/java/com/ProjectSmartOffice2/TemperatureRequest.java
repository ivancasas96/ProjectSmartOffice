// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceTemperature.proto

package com.ProjectSmartOffice2;

/**
 * <pre>
 *Request to get the temperature in the office
 * </pre>
 *
 * Protobuf type {@code ServiceTemperature.TemperatureRequest}
 */
public  final class TemperatureRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceTemperature.TemperatureRequest)
    TemperatureRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TemperatureRequest.newBuilder() to construct.
  private TemperatureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TemperatureRequest() {
    trequest_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TemperatureRequest(
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

            trequest_ = s;
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
    return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ProjectSmartOffice2.TemperatureRequest.class, com.ProjectSmartOffice2.TemperatureRequest.Builder.class);
  }

  public static final int TREQUEST_FIELD_NUMBER = 1;
  private volatile java.lang.Object trequest_;
  /**
   * <code>string trequest = 1;</code>
   */
  public java.lang.String getTrequest() {
    java.lang.Object ref = trequest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trequest_ = s;
      return s;
    }
  }
  /**
   * <code>string trequest = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTrequestBytes() {
    java.lang.Object ref = trequest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trequest_ = b;
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
    if (!getTrequestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trequest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrequestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trequest_);
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
    if (!(obj instanceof com.ProjectSmartOffice2.TemperatureRequest)) {
      return super.equals(obj);
    }
    com.ProjectSmartOffice2.TemperatureRequest other = (com.ProjectSmartOffice2.TemperatureRequest) obj;

    boolean result = true;
    result = result && getTrequest()
        .equals(other.getTrequest());
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
    hash = (37 * hash) + TREQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getTrequest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRequest parseFrom(
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
  public static Builder newBuilder(com.ProjectSmartOffice2.TemperatureRequest prototype) {
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
   *Request to get the temperature in the office
   * </pre>
   *
   * Protobuf type {@code ServiceTemperature.TemperatureRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceTemperature.TemperatureRequest)
      com.ProjectSmartOffice2.TemperatureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ProjectSmartOffice2.TemperatureRequest.class, com.ProjectSmartOffice2.TemperatureRequest.Builder.class);
    }

    // Construct using com.ProjectSmartOffice2.TemperatureRequest.newBuilder()
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
      trequest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRequest_descriptor;
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRequest getDefaultInstanceForType() {
      return com.ProjectSmartOffice2.TemperatureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRequest build() {
      com.ProjectSmartOffice2.TemperatureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRequest buildPartial() {
      com.ProjectSmartOffice2.TemperatureRequest result = new com.ProjectSmartOffice2.TemperatureRequest(this);
      result.trequest_ = trequest_;
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
      if (other instanceof com.ProjectSmartOffice2.TemperatureRequest) {
        return mergeFrom((com.ProjectSmartOffice2.TemperatureRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ProjectSmartOffice2.TemperatureRequest other) {
      if (other == com.ProjectSmartOffice2.TemperatureRequest.getDefaultInstance()) return this;
      if (!other.getTrequest().isEmpty()) {
        trequest_ = other.trequest_;
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
      com.ProjectSmartOffice2.TemperatureRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ProjectSmartOffice2.TemperatureRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object trequest_ = "";
    /**
     * <code>string trequest = 1;</code>
     */
    public java.lang.String getTrequest() {
      java.lang.Object ref = trequest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trequest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string trequest = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTrequestBytes() {
      java.lang.Object ref = trequest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trequest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string trequest = 1;</code>
     */
    public Builder setTrequest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      trequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string trequest = 1;</code>
     */
    public Builder clearTrequest() {
      
      trequest_ = getDefaultInstance().getTrequest();
      onChanged();
      return this;
    }
    /**
     * <code>string trequest = 1;</code>
     */
    public Builder setTrequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      trequest_ = value;
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


    // @@protoc_insertion_point(builder_scope:ServiceTemperature.TemperatureRequest)
  }

  // @@protoc_insertion_point(class_scope:ServiceTemperature.TemperatureRequest)
  private static final com.ProjectSmartOffice2.TemperatureRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ProjectSmartOffice2.TemperatureRequest();
  }

  public static com.ProjectSmartOffice2.TemperatureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemperatureRequest>
      PARSER = new com.google.protobuf.AbstractParser<TemperatureRequest>() {
    @java.lang.Override
    public TemperatureRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TemperatureRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TemperatureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemperatureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ProjectSmartOffice2.TemperatureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

