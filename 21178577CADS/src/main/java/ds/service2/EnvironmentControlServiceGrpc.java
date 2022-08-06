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
public final class EnvironmentControlServiceGrpc {

  private EnvironmentControlServiceGrpc() {}

  public static final String SERVICE_NAME = "service2.EnvironmentControlService";

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
    if ((getTempModifierMethod = EnvironmentControlServiceGrpc.getTempModifierMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getTempModifierMethod = EnvironmentControlServiceGrpc.getTempModifierMethod) == null) {
          EnvironmentControlServiceGrpc.getTempModifierMethod = getTempModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.TempRequest, ds.service2.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "tempModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("tempModifier"))
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
    if ((getHumidModifierMethod = EnvironmentControlServiceGrpc.getHumidModifierMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getHumidModifierMethod = EnvironmentControlServiceGrpc.getHumidModifierMethod) == null) {
          EnvironmentControlServiceGrpc.getHumidModifierMethod = getHumidModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.HumidRequest, ds.service2.HumidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "humidModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("humidModifier"))
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
    if ((getLightModifierMethod = EnvironmentControlServiceGrpc.getLightModifierMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getLightModifierMethod = EnvironmentControlServiceGrpc.getLightModifierMethod) == null) {
          EnvironmentControlServiceGrpc.getLightModifierMethod = getLightModifierMethod = 
              io.grpc.MethodDescriptor.<ds.service2.LightRequest, ds.service2.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "lightModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("lightModifier"))
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
    if ((getTempStatusCheckMethod = EnvironmentControlServiceGrpc.getTempStatusCheckMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getTempStatusCheckMethod = EnvironmentControlServiceGrpc.getTempStatusCheckMethod) == null) {
          EnvironmentControlServiceGrpc.getTempStatusCheckMethod = getTempStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.TempStatRequest, ds.service2.TempStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "tempStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.TempStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("tempStatusCheck"))
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
    if ((getHumidStatusCheckMethod = EnvironmentControlServiceGrpc.getHumidStatusCheckMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getHumidStatusCheckMethod = EnvironmentControlServiceGrpc.getHumidStatusCheckMethod) == null) {
          EnvironmentControlServiceGrpc.getHumidStatusCheckMethod = getHumidStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.HumidStatRequest, ds.service2.HumidStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "humidStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.HumidStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("humidStatusCheck"))
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
    if ((getLightStatusCheckMethod = EnvironmentControlServiceGrpc.getLightStatusCheckMethod) == null) {
      synchronized (EnvironmentControlServiceGrpc.class) {
        if ((getLightStatusCheckMethod = EnvironmentControlServiceGrpc.getLightStatusCheckMethod) == null) {
          EnvironmentControlServiceGrpc.getLightStatusCheckMethod = getLightStatusCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service2.LightStatRequest, ds.service2.LightStatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.EnvironmentControlService", "lightStatusCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.LightStatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentControlServiceMethodDescriptorSupplier("lightStatusCheck"))
                  .build();
          }
        }
     }
     return getLightStatusCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentControlServiceStub newStub(io.grpc.Channel channel) {
    return new EnvironmentControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EnvironmentControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EnvironmentControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class EnvironmentControlServiceImplBase implements io.grpc.BindableService {

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
  public static final class EnvironmentControlServiceStub extends io.grpc.stub.AbstractStub<EnvironmentControlServiceStub> {
    private EnvironmentControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlServiceStub(channel, callOptions);
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
  public static final class EnvironmentControlServiceBlockingStub extends io.grpc.stub.AbstractStub<EnvironmentControlServiceBlockingStub> {
    private EnvironmentControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlServiceBlockingStub(channel, callOptions);
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
  public static final class EnvironmentControlServiceFutureStub extends io.grpc.stub.AbstractStub<EnvironmentControlServiceFutureStub> {
    private EnvironmentControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentControlServiceFutureStub(channel, callOptions);
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
    private final EnvironmentControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentControlServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class EnvironmentControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentControlService");
    }
  }

  private static final class EnvironmentControlServiceFileDescriptorSupplier
      extends EnvironmentControlServiceBaseDescriptorSupplier {
    EnvironmentControlServiceFileDescriptorSupplier() {}
  }

  private static final class EnvironmentControlServiceMethodDescriptorSupplier
      extends EnvironmentControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnvironmentControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentControlServiceFileDescriptorSupplier())
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
