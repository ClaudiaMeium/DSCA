package ds.service2;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.TempRequest,
      ds.service2.TempResponse> getTempModifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tempModifier",
      requestType = ds.service2.TempRequest.class,
      responseType = ds.service2.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.TempRequest,
      ds.service2.TempResponse> getTempModifierMethod() {
    io.grpc.MethodDescriptor<ds.service2.TempRequest, ds.service2.TempResponse> getTempModifierMethod;
    if ((getTempModifierMethod = Service2Grpc.getTempModifierMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getTempModifierMethod = Service2Grpc.getTempModifierMethod) == null) {
          Service2Grpc.getTempModifierMethod = getTempModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.TempRequest, ds.service2.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "tempModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("tempModifier"))
                  .build();
          }
        }
     }
     return getTempModifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.HumidRequest,
      ds.service2.HumidResponse> getHumidModifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "humidModifier",
      requestType = ds.service2.HumidRequest.class,
      responseType = ds.service2.HumidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.HumidRequest,
      ds.service2.HumidResponse> getHumidModifierMethod() {
    io.grpc.MethodDescriptor<ds.service2.HumidRequest, ds.service2.HumidResponse> getHumidModifierMethod;
    if ((getHumidModifierMethod = Service2Grpc.getHumidModifierMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getHumidModifierMethod = Service2Grpc.getHumidModifierMethod) == null) {
          Service2Grpc.getHumidModifierMethod = getHumidModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.HumidRequest, ds.service2.HumidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "humidModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("humidModifier"))
                  .build();
          }
        }
     }
     return getHumidModifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.LightRequest,
      ds.service2.LightResponse> getLightModifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightModifier",
      requestType = ds.service2.LightRequest.class,
      responseType = ds.service2.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.LightRequest,
      ds.service2.LightResponse> getLightModifierMethod() {
    io.grpc.MethodDescriptor<ds.service2.LightRequest, ds.service2.LightResponse> getLightModifierMethod;
    if ((getLightModifierMethod = Service2Grpc.getLightModifierMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getLightModifierMethod = Service2Grpc.getLightModifierMethod) == null) {
          Service2Grpc.getLightModifierMethod = getLightModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.LightRequest, ds.service2.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "lightModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("lightModifier"))
                  .build();
          }
        }
     }
     return getLightModifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.TempStatRequest,
      ds.service2.TempStatResponse> getTempStatusCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tempStatusCheck",
      requestType = ds.service2.TempStatRequest.class,
      responseType = ds.service2.TempStatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.TempStatRequest,
      ds.service2.TempStatResponse> getTempStatusCheckMethod() {
    io.grpc.MethodDescriptor<ds.service2.TempStatRequest, ds.service2.TempStatResponse> getTempStatusCheckMethod;
    if ((getTempStatusCheckMethod = Service2Grpc.getTempStatusCheckMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getTempStatusCheckMethod = Service2Grpc.getTempStatusCheckMethod) == null) {
          Service2Grpc.getTempStatusCheckMethod = getTempStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.TempStatRequest, ds.service2.TempStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "tempStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("tempStatusCheck"))
                  .build();
          }
        }
     }
     return getTempStatusCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.HumidStatRequest,
      ds.service2.HumidStatResponse> getHumidStatusCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "humidStatusCheck",
      requestType = ds.service2.HumidStatRequest.class,
      responseType = ds.service2.HumidStatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.HumidStatRequest,
      ds.service2.HumidStatResponse> getHumidStatusCheckMethod() {
    io.grpc.MethodDescriptor<ds.service2.HumidStatRequest, ds.service2.HumidStatResponse> getHumidStatusCheckMethod;
    if ((getHumidStatusCheckMethod = Service2Grpc.getHumidStatusCheckMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getHumidStatusCheckMethod = Service2Grpc.getHumidStatusCheckMethod) == null) {
          Service2Grpc.getHumidStatusCheckMethod = getHumidStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.HumidStatRequest, ds.service2.HumidStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "humidStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("humidStatusCheck"))
                  .build();
          }
        }
     }
     return getHumidStatusCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.LightStatRequest,
      ds.service2.LightStatResponse> getLightStatusCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightStatusCheck",
      requestType = ds.service2.LightStatRequest.class,
      responseType = ds.service2.LightStatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.LightStatRequest,
      ds.service2.LightStatResponse> getLightStatusCheckMethod() {
    io.grpc.MethodDescriptor<ds.service2.LightStatRequest, ds.service2.LightStatResponse> getLightStatusCheckMethod;
    if ((getLightStatusCheckMethod = Service2Grpc.getLightStatusCheckMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getLightStatusCheckMethod = Service2Grpc.getLightStatusCheckMethod) == null) {
          Service2Grpc.getLightStatusCheckMethod = getLightStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.LightStatRequest, ds.service2.LightStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "lightStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("lightStatusCheck"))
                  .build();
          }
        }
     }
     return getLightStatusCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.TempRequest> tempModifier(
        io.grpc.stub.StreamObserver<ds.service2.TempResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTempModifierMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.HumidRequest> humidModifier(
        io.grpc.stub.StreamObserver<ds.service2.HumidResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHumidModifierMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.LightRequest> lightModifier(
        io.grpc.stub.StreamObserver<ds.service2.LightResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLightModifierMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void tempStatusCheck(ds.service2.TempStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.TempStatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTempStatusCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void humidStatusCheck(ds.service2.HumidStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.HumidStatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHumidStatusCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void lightStatusCheck(ds.service2.LightStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.LightStatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightStatusCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTempModifierMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service2.TempRequest,
                ds.service2.TempResponse>(
                  this, METHODID_TEMP_MODIFIER)))
          .addMethod(
            getHumidModifierMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service2.HumidRequest,
                ds.service2.HumidResponse>(
                  this, METHODID_HUMID_MODIFIER)))
          .addMethod(
            getLightModifierMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service2.LightRequest,
                ds.service2.LightResponse>(
                  this, METHODID_LIGHT_MODIFIER)))
          .addMethod(
            getTempStatusCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.TempStatRequest,
                ds.service2.TempStatResponse>(
                  this, METHODID_TEMP_STATUS_CHECK)))
          .addMethod(
            getHumidStatusCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.HumidStatRequest,
                ds.service2.HumidStatResponse>(
                  this, METHODID_HUMID_STATUS_CHECK)))
          .addMethod(
            getLightStatusCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.LightStatRequest,
                ds.service2.LightStatResponse>(
                  this, METHODID_LIGHT_STATUS_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.TempRequest> tempModifier(
        io.grpc.stub.StreamObserver<ds.service2.TempResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTempModifierMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.HumidRequest> humidModifier(
        io.grpc.stub.StreamObserver<ds.service2.HumidResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHumidModifierMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service2.LightRequest> lightModifier(
        io.grpc.stub.StreamObserver<ds.service2.LightResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLightModifierMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void tempStatusCheck(ds.service2.TempStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.TempStatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTempStatusCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void humidStatusCheck(ds.service2.HumidStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.HumidStatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHumidStatusCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void lightStatusCheck(ds.service2.LightStatRequest request,
        io.grpc.stub.StreamObserver<ds.service2.LightStatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightStatusCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ds.service2.TempStatResponse tempStatusCheck(ds.service2.TempStatRequest request) {
      return blockingUnaryCall(
          getChannel(), getTempStatusCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ds.service2.HumidStatResponse humidStatusCheck(ds.service2.HumidStatRequest request) {
      return blockingUnaryCall(
          getChannel(), getHumidStatusCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ds.service2.LightStatResponse lightStatusCheck(ds.service2.LightStatRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightStatusCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.TempStatResponse> tempStatusCheck(
        ds.service2.TempStatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTempStatusCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.HumidStatResponse> humidStatusCheck(
        ds.service2.HumidStatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHumidStatusCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.LightStatResponse> lightStatusCheck(
        ds.service2.LightStatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightStatusCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEMP_STATUS_CHECK = 0;
  private static final int METHODID_HUMID_STATUS_CHECK = 1;
  private static final int METHODID_LIGHT_STATUS_CHECK = 2;
  private static final int METHODID_TEMP_MODIFIER = 3;
  private static final int METHODID_HUMID_MODIFIER = 4;
  private static final int METHODID_LIGHT_MODIFIER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEMP_STATUS_CHECK:
          serviceImpl.tempStatusCheck((ds.service2.TempStatRequest) request,
              (io.grpc.stub.StreamObserver<ds.service2.TempStatResponse>) responseObserver);
          break;
        case METHODID_HUMID_STATUS_CHECK:
          serviceImpl.humidStatusCheck((ds.service2.HumidStatRequest) request,
              (io.grpc.stub.StreamObserver<ds.service2.HumidStatResponse>) responseObserver);
          break;
        case METHODID_LIGHT_STATUS_CHECK:
          serviceImpl.lightStatusCheck((ds.service2.LightStatRequest) request,
              (io.grpc.stub.StreamObserver<ds.service2.LightStatResponse>) responseObserver);
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
        case METHODID_TEMP_MODIFIER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.tempModifier(
              (io.grpc.stub.StreamObserver<ds.service2.TempResponse>) responseObserver);
        case METHODID_HUMID_MODIFIER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.humidModifier(
              (io.grpc.stub.StreamObserver<ds.service2.HumidResponse>) responseObserver);
        case METHODID_LIGHT_MODIFIER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lightModifier(
              (io.grpc.stub.StreamObserver<ds.service2.LightResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getTempModifierMethod())
              .addMethod(getHumidModifierMethod())
              .addMethod(getLightModifierMethod())
              .addMethod(getTempStatusCheckMethod())
              .addMethod(getHumidStatusCheckMethod())
              .addMethod(getLightStatusCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
