package com.ProjectSmartOffice2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service Definition
 * Service to access to the temperature information from the office
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ServiceTemperature.proto")
public final class SmartOfficeTemperatureServiceGrpc {

  private SmartOfficeTemperatureServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceTemperature.SmartOfficeTemperatureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRequest,
      com.ProjectSmartOffice2.TemperatureResponse> getStreamTemperaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTemperatures",
      requestType = com.ProjectSmartOffice2.TemperatureRequest.class,
      responseType = com.ProjectSmartOffice2.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRequest,
      com.ProjectSmartOffice2.TemperatureResponse> getStreamTemperaturesMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRequest, com.ProjectSmartOffice2.TemperatureResponse> getStreamTemperaturesMethod;
    if ((getStreamTemperaturesMethod = SmartOfficeTemperatureServiceGrpc.getStreamTemperaturesMethod) == null) {
      synchronized (SmartOfficeTemperatureServiceGrpc.class) {
        if ((getStreamTemperaturesMethod = SmartOfficeTemperatureServiceGrpc.getStreamTemperaturesMethod) == null) {
          SmartOfficeTemperatureServiceGrpc.getStreamTemperaturesMethod = getStreamTemperaturesMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice2.TemperatureRequest, com.ProjectSmartOffice2.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceTemperature.SmartOfficeTemperatureService", "StreamTemperatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeTemperatureServiceMethodDescriptorSupplier("StreamTemperatures"))
                  .build();
          }
        }
     }
     return getStreamTemperaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureAverageRequest,
      com.ProjectSmartOffice2.TemperatureAverageResponse> getGetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemperature",
      requestType = com.ProjectSmartOffice2.TemperatureAverageRequest.class,
      responseType = com.ProjectSmartOffice2.TemperatureAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureAverageRequest,
      com.ProjectSmartOffice2.TemperatureAverageResponse> getGetTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureAverageRequest, com.ProjectSmartOffice2.TemperatureAverageResponse> getGetTemperatureMethod;
    if ((getGetTemperatureMethod = SmartOfficeTemperatureServiceGrpc.getGetTemperatureMethod) == null) {
      synchronized (SmartOfficeTemperatureServiceGrpc.class) {
        if ((getGetTemperatureMethod = SmartOfficeTemperatureServiceGrpc.getGetTemperatureMethod) == null) {
          SmartOfficeTemperatureServiceGrpc.getGetTemperatureMethod = getGetTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice2.TemperatureAverageRequest, com.ProjectSmartOffice2.TemperatureAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceTemperature.SmartOfficeTemperatureService", "GetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureAverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeTemperatureServiceMethodDescriptorSupplier("GetTemperature"))
                  .build();
          }
        }
     }
     return getGetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRangeRequest,
      com.ProjectSmartOffice2.TemperatureRangeResponse> getCheckTemperatureRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTemperatureRange",
      requestType = com.ProjectSmartOffice2.TemperatureRangeRequest.class,
      responseType = com.ProjectSmartOffice2.TemperatureRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRangeRequest,
      com.ProjectSmartOffice2.TemperatureRangeResponse> getCheckTemperatureRangeMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice2.TemperatureRangeRequest, com.ProjectSmartOffice2.TemperatureRangeResponse> getCheckTemperatureRangeMethod;
    if ((getCheckTemperatureRangeMethod = SmartOfficeTemperatureServiceGrpc.getCheckTemperatureRangeMethod) == null) {
      synchronized (SmartOfficeTemperatureServiceGrpc.class) {
        if ((getCheckTemperatureRangeMethod = SmartOfficeTemperatureServiceGrpc.getCheckTemperatureRangeMethod) == null) {
          SmartOfficeTemperatureServiceGrpc.getCheckTemperatureRangeMethod = getCheckTemperatureRangeMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice2.TemperatureRangeRequest, com.ProjectSmartOffice2.TemperatureRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceTemperature.SmartOfficeTemperatureService", "CheckTemperatureRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice2.TemperatureRangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeTemperatureServiceMethodDescriptorSupplier("CheckTemperatureRange"))
                  .build();
          }
        }
     }
     return getCheckTemperatureRangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartOfficeTemperatureServiceStub newStub(io.grpc.Channel channel) {
    return new SmartOfficeTemperatureServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartOfficeTemperatureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartOfficeTemperatureServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartOfficeTemperatureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartOfficeTemperatureServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definition
   * Service to access to the temperature information from the office
   * </pre>
   */
  public static abstract class SmartOfficeTemperatureServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the current temperature in the office
     * </pre>
     */
    public void streamTemperatures(com.ProjectSmartOffice2.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamTemperaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Calculate the average temperature in the office
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureAverageRequest> getTemperature(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Determine if a series of temperature readings are within a specified range
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureRangeRequest> checkTemperatureRange(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureRangeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckTemperatureRangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamTemperaturesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ProjectSmartOffice2.TemperatureRequest,
                com.ProjectSmartOffice2.TemperatureResponse>(
                  this, METHODID_STREAM_TEMPERATURES)))
          .addMethod(
            getGetTemperatureMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.ProjectSmartOffice2.TemperatureAverageRequest,
                com.ProjectSmartOffice2.TemperatureAverageResponse>(
                  this, METHODID_GET_TEMPERATURE)))
          .addMethod(
            getCheckTemperatureRangeMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.ProjectSmartOffice2.TemperatureRangeRequest,
                com.ProjectSmartOffice2.TemperatureRangeResponse>(
                  this, METHODID_CHECK_TEMPERATURE_RANGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definition
   * Service to access to the temperature information from the office
   * </pre>
   */
  public static final class SmartOfficeTemperatureServiceStub extends io.grpc.stub.AbstractStub<SmartOfficeTemperatureServiceStub> {
    private SmartOfficeTemperatureServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeTemperatureServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeTemperatureServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeTemperatureServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current temperature in the office
     * </pre>
     */
    public void streamTemperatures(com.ProjectSmartOffice2.TemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamTemperaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Calculate the average temperature in the office
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureAverageRequest> getTemperature(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Determine if a series of temperature readings are within a specified range
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureRangeRequest> checkTemperatureRange(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureRangeResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCheckTemperatureRangeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definition
   * Service to access to the temperature information from the office
   * </pre>
   */
  public static final class SmartOfficeTemperatureServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartOfficeTemperatureServiceBlockingStub> {
    private SmartOfficeTemperatureServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeTemperatureServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeTemperatureServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeTemperatureServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current temperature in the office
     * </pre>
     */
    public java.util.Iterator<com.ProjectSmartOffice2.TemperatureResponse> streamTemperatures(
        com.ProjectSmartOffice2.TemperatureRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamTemperaturesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definition
   * Service to access to the temperature information from the office
   * </pre>
   */
  public static final class SmartOfficeTemperatureServiceFutureStub extends io.grpc.stub.AbstractStub<SmartOfficeTemperatureServiceFutureStub> {
    private SmartOfficeTemperatureServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeTemperatureServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeTemperatureServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeTemperatureServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_TEMPERATURES = 0;
  private static final int METHODID_GET_TEMPERATURE = 1;
  private static final int METHODID_CHECK_TEMPERATURE_RANGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartOfficeTemperatureServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartOfficeTemperatureServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_TEMPERATURES:
          serviceImpl.streamTemperatures((com.ProjectSmartOffice2.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getTemperature(
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureAverageResponse>) responseObserver);
        case METHODID_CHECK_TEMPERATURE_RANGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkTemperatureRange(
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice2.TemperatureRangeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartOfficeTemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartOfficeTemperatureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ProjectSmartOffice2.ProjectSmartOfficeImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartOfficeTemperatureService");
    }
  }

  private static final class SmartOfficeTemperatureServiceFileDescriptorSupplier
      extends SmartOfficeTemperatureServiceBaseDescriptorSupplier {
    SmartOfficeTemperatureServiceFileDescriptorSupplier() {}
  }

  private static final class SmartOfficeTemperatureServiceMethodDescriptorSupplier
      extends SmartOfficeTemperatureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartOfficeTemperatureServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmartOfficeTemperatureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartOfficeTemperatureServiceFileDescriptorSupplier())
              .addMethod(getStreamTemperaturesMethod())
              .addMethod(getGetTemperatureMethod())
              .addMethod(getCheckTemperatureRangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
