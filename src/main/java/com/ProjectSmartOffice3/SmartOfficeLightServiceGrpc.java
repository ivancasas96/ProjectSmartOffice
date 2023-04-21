package com.ProjectSmartOffice3;

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
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ServiceLight.proto")
public final class SmartOfficeLightServiceGrpc {

  private SmartOfficeLightServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceLight.SmartOfficeLightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetLightRequest,
      com.ProjectSmartOffice3.SetLightResponse> getSetRoomLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRoomLight",
      requestType = com.ProjectSmartOffice3.SetLightRequest.class,
      responseType = com.ProjectSmartOffice3.SetLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetLightRequest,
      com.ProjectSmartOffice3.SetLightResponse> getSetRoomLightMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetLightRequest, com.ProjectSmartOffice3.SetLightResponse> getSetRoomLightMethod;
    if ((getSetRoomLightMethod = SmartOfficeLightServiceGrpc.getSetRoomLightMethod) == null) {
      synchronized (SmartOfficeLightServiceGrpc.class) {
        if ((getSetRoomLightMethod = SmartOfficeLightServiceGrpc.getSetRoomLightMethod) == null) {
          SmartOfficeLightServiceGrpc.getSetRoomLightMethod = getSetRoomLightMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice3.SetLightRequest, com.ProjectSmartOffice3.SetLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceLight.SmartOfficeLightService", "SetRoomLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.SetLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.SetLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeLightServiceMethodDescriptorSupplier("SetRoomLight"))
                  .build();
          }
        }
     }
     return getSetRoomLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetTemperatureRequest,
      com.ProjectSmartOffice3.SetTemperatureResponse> getSetRoomTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRoomTemperature",
      requestType = com.ProjectSmartOffice3.SetTemperatureRequest.class,
      responseType = com.ProjectSmartOffice3.SetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetTemperatureRequest,
      com.ProjectSmartOffice3.SetTemperatureResponse> getSetRoomTemperatureMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice3.SetTemperatureRequest, com.ProjectSmartOffice3.SetTemperatureResponse> getSetRoomTemperatureMethod;
    if ((getSetRoomTemperatureMethod = SmartOfficeLightServiceGrpc.getSetRoomTemperatureMethod) == null) {
      synchronized (SmartOfficeLightServiceGrpc.class) {
        if ((getSetRoomTemperatureMethod = SmartOfficeLightServiceGrpc.getSetRoomTemperatureMethod) == null) {
          SmartOfficeLightServiceGrpc.getSetRoomTemperatureMethod = getSetRoomTemperatureMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice3.SetTemperatureRequest, com.ProjectSmartOffice3.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceLight.SmartOfficeLightService", "SetRoomTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.SetTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeLightServiceMethodDescriptorSupplier("SetRoomTemperature"))
                  .build();
          }
        }
     }
     return getSetRoomTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ProjectSmartOffice3.RoomLightRequest,
      com.ProjectSmartOffice3.RoomLightResponse> getControlRoomLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlRoomLight",
      requestType = com.ProjectSmartOffice3.RoomLightRequest.class,
      responseType = com.ProjectSmartOffice3.RoomLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ProjectSmartOffice3.RoomLightRequest,
      com.ProjectSmartOffice3.RoomLightResponse> getControlRoomLightMethod() {
    io.grpc.MethodDescriptor<com.ProjectSmartOffice3.RoomLightRequest, com.ProjectSmartOffice3.RoomLightResponse> getControlRoomLightMethod;
    if ((getControlRoomLightMethod = SmartOfficeLightServiceGrpc.getControlRoomLightMethod) == null) {
      synchronized (SmartOfficeLightServiceGrpc.class) {
        if ((getControlRoomLightMethod = SmartOfficeLightServiceGrpc.getControlRoomLightMethod) == null) {
          SmartOfficeLightServiceGrpc.getControlRoomLightMethod = getControlRoomLightMethod = 
              io.grpc.MethodDescriptor.<com.ProjectSmartOffice3.RoomLightRequest, com.ProjectSmartOffice3.RoomLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceLight.SmartOfficeLightService", "ControlRoomLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.RoomLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ProjectSmartOffice3.RoomLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOfficeLightServiceMethodDescriptorSupplier("ControlRoomLight"))
                  .build();
          }
        }
     }
     return getControlRoomLightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartOfficeLightServiceStub newStub(io.grpc.Channel channel) {
    return new SmartOfficeLightServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartOfficeLightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartOfficeLightServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartOfficeLightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartOfficeLightServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static abstract class SmartOfficeLightServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary RPC to set the  lights in a room
     * </pre>
     */
    public void setRoomLight(com.ProjectSmartOffice3.SetLightRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRoomLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC to set the temperature of a room
     * </pre>
     */
    public void setRoomTemperature(com.ProjectSmartOffice3.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRoomTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional RPC to control the lights in a room
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.RoomLightRequest> controlRoomLight(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.RoomLightResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getControlRoomLightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetRoomLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ProjectSmartOffice3.SetLightRequest,
                com.ProjectSmartOffice3.SetLightResponse>(
                  this, METHODID_SET_ROOM_LIGHT)))
          .addMethod(
            getSetRoomTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ProjectSmartOffice3.SetTemperatureRequest,
                com.ProjectSmartOffice3.SetTemperatureResponse>(
                  this, METHODID_SET_ROOM_TEMPERATURE)))
          .addMethod(
            getControlRoomLightMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.ProjectSmartOffice3.RoomLightRequest,
                com.ProjectSmartOffice3.RoomLightResponse>(
                  this, METHODID_CONTROL_ROOM_LIGHT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class SmartOfficeLightServiceStub extends io.grpc.stub.AbstractStub<SmartOfficeLightServiceStub> {
    private SmartOfficeLightServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeLightServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeLightServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeLightServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC to set the  lights in a room
     * </pre>
     */
    public void setRoomLight(com.ProjectSmartOffice3.SetLightRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRoomLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary RPC to set the temperature of a room
     * </pre>
     */
    public void setRoomTemperature(com.ProjectSmartOffice3.SetTemperatureRequest request,
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetRoomTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional RPC to control the lights in a room
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.RoomLightRequest> controlRoomLight(
        io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.RoomLightResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getControlRoomLightMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class SmartOfficeLightServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartOfficeLightServiceBlockingStub> {
    private SmartOfficeLightServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeLightServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeLightServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeLightServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC to set the  lights in a room
     * </pre>
     */
    public com.ProjectSmartOffice3.SetLightResponse setRoomLight(com.ProjectSmartOffice3.SetLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRoomLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary RPC to set the temperature of a room
     * </pre>
     */
    public com.ProjectSmartOffice3.SetTemperatureResponse setRoomTemperature(com.ProjectSmartOffice3.SetTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetRoomTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class SmartOfficeLightServiceFutureStub extends io.grpc.stub.AbstractStub<SmartOfficeLightServiceFutureStub> {
    private SmartOfficeLightServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOfficeLightServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOfficeLightServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOfficeLightServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC to set the  lights in a room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ProjectSmartOffice3.SetLightResponse> setRoomLight(
        com.ProjectSmartOffice3.SetLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRoomLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary RPC to set the temperature of a room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ProjectSmartOffice3.SetTemperatureResponse> setRoomTemperature(
        com.ProjectSmartOffice3.SetTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetRoomTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ROOM_LIGHT = 0;
  private static final int METHODID_SET_ROOM_TEMPERATURE = 1;
  private static final int METHODID_CONTROL_ROOM_LIGHT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartOfficeLightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartOfficeLightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_ROOM_LIGHT:
          serviceImpl.setRoomLight((com.ProjectSmartOffice3.SetLightRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetLightResponse>) responseObserver);
          break;
        case METHODID_SET_ROOM_TEMPERATURE:
          serviceImpl.setRoomTemperature((com.ProjectSmartOffice3.SetTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.SetTemperatureResponse>) responseObserver);
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
        case METHODID_CONTROL_ROOM_LIGHT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlRoomLight(
              (io.grpc.stub.StreamObserver<com.ProjectSmartOffice3.RoomLightResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartOfficeLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartOfficeLightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ProjectSmartOffice3.ProjectSmartOfficeImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartOfficeLightService");
    }
  }

  private static final class SmartOfficeLightServiceFileDescriptorSupplier
      extends SmartOfficeLightServiceBaseDescriptorSupplier {
    SmartOfficeLightServiceFileDescriptorSupplier() {}
  }

  private static final class SmartOfficeLightServiceMethodDescriptorSupplier
      extends SmartOfficeLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartOfficeLightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartOfficeLightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartOfficeLightServiceFileDescriptorSupplier())
              .addMethod(getSetRoomLightMethod())
              .addMethod(getSetRoomTemperatureMethod())
              .addMethod(getControlRoomLightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
