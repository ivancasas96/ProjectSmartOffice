// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceTemperature.proto

package com.ProjectSmartOffice2;

public final class ProjectSmartOfficeImpl {
  private ProjectSmartOfficeImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureRangeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureRangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceTemperature_TemperatureRangeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ServiceTemperature.proto\022\022ServiceTempe" +
      "rature\"&\n\022TemperatureRequest\022\020\n\010trequest" +
      "\030\001 \001(\t\"O\n\023TemperatureResponse\022\032\n\022morning" +
      "temperature\030\001 \001(\t\022\034\n\024afternoontemperatur" +
      "e\030\002 \001(\t\"_\n\031TemperatureAverageRequest\022\024\n\014" +
      "temperatures\030\001 \001(\001\022\025\n\rtemperatures2\030\002 \001(" +
      "\001\022\025\n\rtemperatures3\030\003 \001(\001\"9\n\032TemperatureA" +
      "verageResponse\022\033\n\023average_temperature\030\002 " +
      "\001(\001\"^\n\027TemperatureRangeRequest\022\031\n\021ranget" +
      "emperatures\030\001 \001(\001\022\023\n\013lower_range\030\002 \001(\001\022\023" +
      "\n\013upper_range\030\003 \001(\001\")\n\030TemperatureRangeR" +
      "esponse\022\r\n\005range\030\001 \001(\0102\367\002\n\035SmartOfficeTe" +
      "mperatureService\022i\n\022StreamTemperatures\022&" +
      ".ServiceTemperature.TemperatureRequest\032\'" +
      ".ServiceTemperature.TemperatureResponse\"" +
      "\0000\001\022s\n\016GetTemperature\022-.ServiceTemperatu" +
      "re.TemperatureAverageRequest\032..ServiceTe" +
      "mperature.TemperatureAverageResponse\"\000(\001" +
      "\022v\n\025CheckTemperatureRange\022+.ServiceTempe" +
      "rature.TemperatureRangeRequest\032,.Service" +
      "Temperature.TemperatureRangeResponse\"\000(\001" +
      "B3\n\027com.ProjectSmartOffice2B\026ProjectSmar" +
      "tOfficeImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ServiceTemperature_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServiceTemperature_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureRequest_descriptor,
        new java.lang.String[] { "Trequest", });
    internal_static_ServiceTemperature_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ServiceTemperature_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureResponse_descriptor,
        new java.lang.String[] { "Morningtemperature", "Afternoontemperature", });
    internal_static_ServiceTemperature_TemperatureAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ServiceTemperature_TemperatureAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureAverageRequest_descriptor,
        new java.lang.String[] { "Temperatures", "Temperatures2", "Temperatures3", });
    internal_static_ServiceTemperature_TemperatureAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ServiceTemperature_TemperatureAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureAverageResponse_descriptor,
        new java.lang.String[] { "AverageTemperature", });
    internal_static_ServiceTemperature_TemperatureRangeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ServiceTemperature_TemperatureRangeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureRangeRequest_descriptor,
        new java.lang.String[] { "Rangetemperatures", "LowerRange", "UpperRange", });
    internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ServiceTemperature_TemperatureRangeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceTemperature_TemperatureRangeResponse_descriptor,
        new java.lang.String[] { "Range", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
