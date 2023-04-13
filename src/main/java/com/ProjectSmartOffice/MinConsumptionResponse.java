// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceConsumption.proto

package com.ProjectSmartOffice;

/**
 * <pre>
 * Response to a request for the minimum electricity consumption of the office
 * </pre>
 *
 * Protobuf type {@code ServiceConsumption.MinConsumptionResponse}
 */
public  final class MinConsumptionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceConsumption.MinConsumptionResponse)
    MinConsumptionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MinConsumptionResponse.newBuilder() to construct.
  private MinConsumptionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MinConsumptionResponse() {
    minConsumption_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MinConsumptionResponse(
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
          case 9: {

            minConsumption_ = input.readDouble();
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
    return com.ProjectSmartOffice.ProjectSmartOffice.internal_static_ServiceConsumption_MinConsumptionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ProjectSmartOffice.ProjectSmartOffice.internal_static_ServiceConsumption_MinConsumptionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ProjectSmartOffice.MinConsumptionResponse.class, com.ProjectSmartOffice.MinConsumptionResponse.Builder.class);
  }

  public static final int MIN_CONSUMPTION_FIELD_NUMBER = 1;
  private double minConsumption_;
  /**
   * <pre>
   * The minimum electricity consumption of the office in watts
   * </pre>
   *
   * <code>double min_consumption = 1;</code>
   */
  public double getMinConsumption() {
    return minConsumption_;
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
    if (minConsumption_ != 0D) {
      output.writeDouble(1, minConsumption_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minConsumption_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, minConsumption_);
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
    if (!(obj instanceof com.ProjectSmartOffice.MinConsumptionResponse)) {
      return super.equals(obj);
    }
    com.ProjectSmartOffice.MinConsumptionResponse other = (com.ProjectSmartOffice.MinConsumptionResponse) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getMinConsumption())
        == java.lang.Double.doubleToLongBits(
            other.getMinConsumption()));
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
    hash = (37 * hash) + MIN_CONSUMPTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinConsumption()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ProjectSmartOffice.MinConsumptionResponse parseFrom(
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
  public static Builder newBuilder(com.ProjectSmartOffice.MinConsumptionResponse prototype) {
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
   * Response to a request for the minimum electricity consumption of the office
   * </pre>
   *
   * Protobuf type {@code ServiceConsumption.MinConsumptionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceConsumption.MinConsumptionResponse)
      com.ProjectSmartOffice.MinConsumptionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ProjectSmartOffice.ProjectSmartOffice.internal_static_ServiceConsumption_MinConsumptionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ProjectSmartOffice.ProjectSmartOffice.internal_static_ServiceConsumption_MinConsumptionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ProjectSmartOffice.MinConsumptionResponse.class, com.ProjectSmartOffice.MinConsumptionResponse.Builder.class);
    }

    // Construct using com.ProjectSmartOffice.MinConsumptionResponse.newBuilder()
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
      minConsumption_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ProjectSmartOffice.ProjectSmartOffice.internal_static_ServiceConsumption_MinConsumptionResponse_descriptor;
    }

    @java.lang.Override
    public com.ProjectSmartOffice.MinConsumptionResponse getDefaultInstanceForType() {
      return com.ProjectSmartOffice.MinConsumptionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ProjectSmartOffice.MinConsumptionResponse build() {
      com.ProjectSmartOffice.MinConsumptionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ProjectSmartOffice.MinConsumptionResponse buildPartial() {
      com.ProjectSmartOffice.MinConsumptionResponse result = new com.ProjectSmartOffice.MinConsumptionResponse(this);
      result.minConsumption_ = minConsumption_;
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
      if (other instanceof com.ProjectSmartOffice.MinConsumptionResponse) {
        return mergeFrom((com.ProjectSmartOffice.MinConsumptionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ProjectSmartOffice.MinConsumptionResponse other) {
      if (other == com.ProjectSmartOffice.MinConsumptionResponse.getDefaultInstance()) return this;
      if (other.getMinConsumption() != 0D) {
        setMinConsumption(other.getMinConsumption());
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
      com.ProjectSmartOffice.MinConsumptionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ProjectSmartOffice.MinConsumptionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double minConsumption_ ;
    /**
     * <pre>
     * The minimum electricity consumption of the office in watts
     * </pre>
     *
     * <code>double min_consumption = 1;</code>
     */
    public double getMinConsumption() {
      return minConsumption_;
    }
    /**
     * <pre>
     * The minimum electricity consumption of the office in watts
     * </pre>
     *
     * <code>double min_consumption = 1;</code>
     */
    public Builder setMinConsumption(double value) {
      
      minConsumption_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The minimum electricity consumption of the office in watts
     * </pre>
     *
     * <code>double min_consumption = 1;</code>
     */
    public Builder clearMinConsumption() {
      
      minConsumption_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:ServiceConsumption.MinConsumptionResponse)
  }

  // @@protoc_insertion_point(class_scope:ServiceConsumption.MinConsumptionResponse)
  private static final com.ProjectSmartOffice.MinConsumptionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ProjectSmartOffice.MinConsumptionResponse();
  }

  public static com.ProjectSmartOffice.MinConsumptionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MinConsumptionResponse>
      PARSER = new com.google.protobuf.AbstractParser<MinConsumptionResponse>() {
    @java.lang.Override
    public MinConsumptionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MinConsumptionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MinConsumptionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MinConsumptionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ProjectSmartOffice.MinConsumptionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
