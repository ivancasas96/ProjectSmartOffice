package com.ProjectSmartOffice;

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
 *Service Definition
 * Service for accessing smart office electricity consumption information
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ServiceConsumption.proto")
public final class SmartOfficeElectricityServiceGrpc {

  private SmartOfficeElectricityServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceConsumption.SmartOfficeElectricityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice.ConsumptionRequest,
      com.ProjectSmartOffice.ConsumptionResponse> getGetCurrentConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentConsumption",
      requestType = com.ProjectSmartOffice.ConsumptionRequest.class,
      responseType = com.ProjectSmartOffice.ConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice.ConsumptionRequest,
      com.ProjectSmartOffice.ConsumptionResponse> getGetCurrentConsumptionMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice.ConsumptionRequest, com.ProjectSmartOffice.ConsumptionResponse> getGetCurrentConsumptionMethod;
    if ((getGetCurrentConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetCurrentConsumptionMethod) == null) {
      synchronized (SmartOfficeElectricityServiceGrpc.class) {
        if ((getGetCurrentConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetCurrentConsumptionMethod) == null) {
          SmartOfficeElectricityServiceGrpc.getGetCurrentConsumptionMethod = getGetCurrentConsumptionMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice.ConsumptionRequest, com.ProjectSmartOffice.ConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceConsumption.SmartOfficeElectricityService", "GetCurrentConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.ConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.ConsumptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeElectricityServiceMethodDescriptorSupplier("GetCurrentConsumption"))
                  .build();
          }
        }
     }
     return getGetCurrentConsumptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice.MaxConsumptionRequest,
      com.ProjectSmartOffice.MaxConsumptionResponse> getGetMaxConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMaxConsumption",
      requestType = com.ProjectSmartOffice.MaxConsumptionRequest.class,
      responseType = com.ProjectSmartOffice.MaxConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice.MaxConsumptionRequest,
      com.ProjectSmartOffice.MaxConsumptionResponse> getGetMaxConsumptionMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice.MaxConsumptionRequest, com.ProjectSmartOffice.MaxConsumptionResponse> getGetMaxConsumptionMethod;
    if ((getGetMaxConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetMaxConsumptionMethod) == null) {
      synchronized (SmartOfficeElectricityServiceGrpc.class) {
        if ((getGetMaxConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetMaxConsumptionMethod) == null) {
          SmartOfficeElectricityServiceGrpc.getGetMaxConsumptionMethod = getGetMaxConsumptionMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice.MaxConsumptionRequest, com.ProjectSmartOffice.MaxConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceConsumption.SmartOfficeElectricityService", "GetMaxConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.MaxConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.MaxConsumptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeElectricityServiceMethodDescriptorSupplier("GetMaxConsumption"))
                  .build();
          }
        }
     }
     return getGetMaxConsumptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice.MinConsumptionRequest,
      com.ProjectSmartOffice.MinConsumptionResponse> getGetMinConsumptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMinConsumption",
      requestType = com.ProjectSmartOffice.MinConsumptionRequest.class,
      responseType = com.ProjectSmartOffice.MinConsumptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice.MinConsumptionRequest,
      com.ProjectSmartOffice.MinConsumptionResponse> getGetMinConsumptionMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice.MinConsumptionRequest, com.ProjectSmartOffice.MinConsumptionResponse> getGetMinConsumptionMethod;
    if ((getGetMinConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetMinConsumptionMethod) == null) {
      synchronized (SmartOfficeElectricityServiceGrpc.class) {
        if ((getGetMinConsumptionMethod = SmartOfficeElectricityServiceGrpc.getGetMinConsumptionMethod) == null) {
          SmartOfficeElectricityServiceGrpc.getGetMinConsumptionMethod = getGetMinConsumptionMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice.MinConsumptionRequest, com.ProjectSmartOffice.MinConsumptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceConsumption.SmartOfficeElectricityService", "GetMinConsumption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.MinConsumptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice.MinConsumptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeElectricityServiceMethodDescriptorSupplier("GetMinConsumption"))
                  .build();
          }
        }
     }
     return getGetMinConsumptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartOfficeElectricityServiceStub newStub(io.grpc.Channel channel) {
    return new SmartOfficeElectricityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartOfficeElectricityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartOfficeElectricityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartOfficeElectricityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartOfficeElectricityServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * Service for accessing smart office electricity consumption information
   * </pre>
   */
  public static abstract class SmartOfficeElectricityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the current electricity consumption of the office
     * </pre>
     */
    public void getCurrentConsumption(com.ProjectSmartOffice.ConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.ConsumptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentConsumptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the maximum electricity consumption of the office
     * </pre>
     */
    public void getMaxConsumption(com.ProjectSmartOffice.MaxConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MaxConsumptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMaxConsumptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the minimum electricity consumption of the office
     * </pre>
     */
    public void getMinConsumption(com.ProjectSmartOffice.MinConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MinConsumptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMinConsumptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentConsumptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ProjectSmartOffice.ConsumptionRequest,
                com.ProjectSmartOffice.ConsumptionResponse>(
                  this, METHODID_GET_CURRENT_CONSUMPTION)))
          .addMethod(
            getGetMaxConsumptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ProjectSmartOffice.MaxConsumptionRequest,
                com.ProjectSmartOffice.MaxConsumptionResponse>(
                  this, METHODID_GET_MAX_CONSUMPTION)))
          .addMethod(
            getGetMinConsumptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ProjectSmartOffice.MinConsumptionRequest,
                com.ProjectSmartOffice.MinConsumptionResponse>(
                  this, METHODID_GET_MIN_CONSUMPTION)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * Service for accessing smart office electricity consumption information
   * </pre>
   */
  public static final class SmartOfficeElectricityServiceStub extends io.grpc.stub.AbstractStub<SmartOfficeElectricityServiceStub> {
    private SmartOfficeElectricityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeElectricityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeElectricityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeElectricityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current electricity consumption of the office
     * </pre>
     */
    public void getCurrentConsumption(com.ProjectSmartOffice.ConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.ConsumptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentConsumptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the maximum electricity consumption of the office
     * </pre>
     */
    public void getMaxConsumption(com.ProjectSmartOffice.MaxConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MaxConsumptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMaxConsumptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the minimum electricity consumption of the office
     * </pre>
     */
    public void getMinConsumption(com.ProjectSmartOffice.MinConsumptionRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MinConsumptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMinConsumptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * Service for accessing smart office electricity consumption information
   * </pre>
   */
  public static final class SmartOfficeElectricityServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartOfficeElectricityServiceBlockingStub> {
    private SmartOfficeElectricityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeElectricityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeElectricityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeElectricityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current electricity consumption of the office
     * </pre>
     */
    public com.ProjectSmartOffice.ConsumptionResponse getCurrentConsumption(com.ProjectSmartOffice.ConsumptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentConsumptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the maximum electricity consumption of the office
     * </pre>
     */
    public com.ProjectSmartOffice.MaxConsumptionResponse getMaxConsumption(com.ProjectSmartOffice.MaxConsumptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMaxConsumptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the minimum electricity consumption of the office
     * </pre>
     */
    public com.ProjectSmartOffice.MinConsumptionResponse getMinConsumption(com.ProjectSmartOffice.MinConsumptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMinConsumptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * Service for accessing smart office electricity consumption information
   * </pre>
   */
  public static final class SmartOfficeElectricityServiceFutureStub extends io.grpc.stub.AbstractStub<SmartOfficeElectricityServiceFutureStub> {
    private SmartOfficeElectricityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeElectricityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeElectricityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeElectricityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current electricity consumption of the office
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ProjectSmartOffice.ConsumptionResponse> getCurrentConsumption(
        com.ProjectSmartOffice.ConsumptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentConsumptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the maximum electricity consumption of the office
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ProjectSmartOffice.MaxConsumptionResponse> getMaxConsumption(
        com.ProjectSmartOffice.MaxConsumptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMaxConsumptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the minimum electricity consumption of the office
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ProjectSmartOffice.MinConsumptionResponse> getMinConsumption(
        com.ProjectSmartOffice.MinConsumptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMinConsumptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_CONSUMPTION = 0;
  private static final int METHODID_GET_MAX_CONSUMPTION = 1;
  private static final int METHODID_GET_MIN_CONSUMPTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartOfficeElectricityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartOfficeElectricityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_CONSUMPTION:
          serviceImpl.getCurrentConsumption((com.ProjectSmartOffice.ConsumptionRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice.ConsumptionResponse>) responseObserver);
          break;
        case METHODID_GET_MAX_CONSUMPTION:
          serviceImpl.getMaxConsumption((com.ProjectSmartOffice.MaxConsumptionRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MaxConsumptionResponse>) responseObserver);
          break;
        case METHODID_GET_MIN_CONSUMPTION:
          serviceImpl.getMinConsumption((com.ProjectSmartOffice.MinConsumptionRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice.MinConsumptionResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartOfficeElectricityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartOfficeElectricityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ProjectSmartOffice.ProjectSmartOfficeImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartOfficeElectricityService");
    }
  }

  private static final class SmartOfficeElectricityServiceFileDescriptorSupplier
      extends SmartOfficeElectricityServiceBaseDescriptorSupplier {
    SmartOfficeElectricityServiceFileDescriptorSupplier() {}
  }

  private static final class SmartOfficeElectricityServiceMethodDescriptorSupplier
      extends SmartOfficeElectricityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartOfficeElectricityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartOfficeElectricityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartOfficeElectricityServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentConsumptionMethod())
              .addMethod(getGetMaxConsumptionMethod())
              .addMethod(getGetMinConsumptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
