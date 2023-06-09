// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceTemperature.proto

package com.ProjectSmartOffice2;

/**
 * <pre>
 * Response indicating whether the temperature readings are within the specified range
 * </pre>
 *
 * Protobuf type {@code ServiceTemperature.TemperatureRangeResponse}
 */
public  final class TemperatureRangeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceTemperature.TemperatureRangeResponse)
    TemperatureRangeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TemperatureRangeResponse.newBuilder() to construct.
  private TemperatureRangeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TemperatureRangeResponse() {
    range_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TemperatureRangeResponse(
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
          case 8: {

            range_ = input.readBool();
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
    return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRangeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ProjectSmartOffice2.TemperatureRangeResponse.class, com.ProjectSmartOffice2.TemperatureRangeResponse.Builder.class);
  }

  public static final int RANGE_FIELD_NUMBER = 1;
  private boolean range_;
  /**
   * <pre>
   * True if the temperature readings are within the specified range, false otherwise
   * </pre>
   *
   * <code>bool range = 1;</code>
   */
  public boolean getRange() {
    return range_;
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
    if (range_ != false) {
      output.writeBool(1, range_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (range_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, range_);
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
    if (!(obj instanceof com.ProjectSmartOffice2.TemperatureRangeResponse)) {
      return super.equals(obj);
    }
    com.ProjectSmartOffice2.TemperatureRangeResponse other = (com.ProjectSmartOffice2.TemperatureRangeResponse) obj;

    boolean result = true;
    result = result && (getRange()
        == other.getRange());
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
    hash = (37 * hash) + RANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRange());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice2.TemperatureRangeResponse parseFrom(
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
  public static Builder newBuilder(com.ProjectSmartOffice2.TemperatureRangeResponse prototype) {
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
   * Response indicating whether the temperature readings are within the specified range
   * </pre>
   *
   * Protobuf type {@code ServiceTemperature.TemperatureRangeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceTemperature.TemperatureRangeResponse)
      com.ProjectSmartOffice2.TemperatureRangeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRangeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ProjectSmartOffice2.TemperatureRangeResponse.class, com.ProjectSmartOffice2.TemperatureRangeResponse.Builder.class);
    }

    // Construct using com.ProjectSmartOffice2.TemperatureRangeResponse.newBuilder()
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
      range_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor;
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRangeResponse getDefaultInstanceForType() {
      return com.ProjectSmartOffice2.TemperatureRangeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRangeResponse build() {
      com.ProjectSmartOffice2.TemperatureRangeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ProjectSmartOffice2.TemperatureRangeResponse buildPartial() {
      com.ProjectSmartOffice2.TemperatureRangeResponse result = new com.ProjectSmartOffice2.TemperatureRangeResponse(this);
      result.range_ = range_;
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
      if (other instanceof com.ProjectSmartOffice2.TemperatureRangeResponse) {
        return mergeFrom((com.ProjectSmartOffice2.TemperatureRangeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ProjectSmartOffice2.TemperatureRangeResponse other) {
      if (other == com.ProjectSmartOffice2.TemperatureRangeResponse.getDefaultInstance()) return this;
      if (other.getRange() != false) {
        setRange(other.getRange());
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
      com.ProjectSmartOffice2.TemperatureRangeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ProjectSmartOffice2.TemperatureRangeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean range_ ;
    /**
     * <pre>
     * True if the temperature readings are within the specified range, false otherwise
     * </pre>
     *
     * <code>bool range = 1;</code>
     */
    public boolean getRange() {
      return range_;
    }
    /**
     * <pre>
     * True if the temperature readings are within the specified range, false otherwise
     * </pre>
     *
     * <code>bool range = 1;</code>
     */
    public Builder setRange(boolean value) {
      
      range_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if the temperature readings are within the specified range, false otherwise
     * </pre>
     *
     * <code>bool range = 1;</code>
     */
    public Builder clearRange() {
      
      range_ = false;
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


    // @@protoc_insertion_point(builder_scope:ServiceTemperature.TemperatureRangeResponse)
  }

  // @@protoc_insertion_point(class_scope:ServiceTemperature.TemperatureRangeResponse)
  private static final com.ProjectSmartOffice2.TemperatureRangeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ProjectSmartOffice2.TemperatureRangeResponse();
  }

  public static com.ProjectSmartOffice2.TemperatureRangeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemperatureRangeResponse>
      PARSER = new com.google.protobuf.AbstractParser<TemperatureRangeResponse>() {
    @java.lang.Override
    public TemperatureRangeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TemperatureRangeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TemperatureRangeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemperatureRangeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ProjectSmartOffice2.TemperatureRangeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

