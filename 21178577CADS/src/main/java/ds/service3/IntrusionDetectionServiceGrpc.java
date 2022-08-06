package ds.service3;

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
    comments = "Source: service3.proto")
public final class IntrusionDetectionServiceGrpc {

  private IntrusionDetectionServiceGrpc() {}

  public static final String SERVICE_NAME = "service3.IntrusionDetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.SensorRequest,
      ds.service3.SensorResponse> getMotionSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "motionSensor",
      requestType = ds.service3.SensorRequest.class,
      responseType = ds.service3.SensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.SensorRequest,
      ds.service3.SensorResponse> getMotionSensorMethod() {
    io.grpc.MethodDescriptor<ds.service3.SensorRequest, ds.service3.SensorResponse> getMotionSensorMethod;
    if ((getMotionSensorMethod = IntrusionDetectionServiceGrpc.getMotionSensorMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getMotionSensorMethod = IntrusionDetectionServiceGrpc.getMotionSensorMethod) == null) {
          IntrusionDetectionServiceGrpc.getMotionSensorMethod = getMotionSensorMethod = 
              io.grpc.MethodDescriptor.<ds.service3.SensorRequest, ds.service3.SensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.IntrusionDetectionService", "motionSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.SensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.SensorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("motionSensor"))
                  .build();
          }
        }
     }
     return getMotionSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.SensorLogRequest,
      ds.service3.SensorLogResponse> getSensorLogCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sensorLogCheck",
      requestType = ds.service3.SensorLogRequest.class,
      responseType = ds.service3.SensorLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.SensorLogRequest,
      ds.service3.SensorLogResponse> getSensorLogCheckMethod() {
    io.grpc.MethodDescriptor<ds.service3.SensorLogRequest, ds.service3.SensorLogResponse> getSensorLogCheckMethod;
    if ((getSensorLogCheckMethod = IntrusionDetectionServiceGrpc.getSensorLogCheckMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getSensorLogCheckMethod = IntrusionDetectionServiceGrpc.getSensorLogCheckMethod) == null) {
          IntrusionDetectionServiceGrpc.getSensorLogCheckMethod = getSensorLogCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service3.SensorLogRequest, ds.service3.SensorLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.IntrusionDetectionService", "sensorLogCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.SensorLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.SensorLogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("sensorLogCheck"))
                  .build();
          }
        }
     }
     return getSensorLogCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntrusionDetectionServiceStub newStub(io.grpc.Channel channel) {
    return new IntrusionDetectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntrusionDetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntrusionDetectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntrusionDetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntrusionDetectionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class IntrusionDetectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service3.SensorRequest> motionSensor(
        io.grpc.stub.StreamObserver<ds.service3.SensorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMotionSensorMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void sensorLogCheck(ds.service3.SensorLogRequest request,
        io.grpc.stub.StreamObserver<ds.service3.SensorLogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSensorLogCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMotionSensorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service3.SensorRequest,
                ds.service3.SensorResponse>(
                  this, METHODID_MOTION_SENSOR)))
          .addMethod(
            getSensorLogCheckMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service3.SensorLogRequest,
                ds.service3.SensorLogResponse>(
                  this, METHODID_SENSOR_LOG_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class IntrusionDetectionServiceStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceStub> {
    private IntrusionDetectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.service3.SensorRequest> motionSensor(
        io.grpc.stub.StreamObserver<ds.service3.SensorResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMotionSensorMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void sensorLogCheck(ds.service3.SensorLogRequest request,
        io.grpc.stub.StreamObserver<ds.service3.SensorLogResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSensorLogCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class IntrusionDetectionServiceBlockingStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceBlockingStub> {
    private IntrusionDetectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<ds.service3.SensorLogResponse> sensorLogCheck(
        ds.service3.SensorLogRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSensorLogCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class IntrusionDetectionServiceFutureStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceFutureStub> {
    private IntrusionDetectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SENSOR_LOG_CHECK = 0;
  private static final int METHODID_MOTION_SENSOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntrusionDetectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntrusionDetectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SENSOR_LOG_CHECK:
          serviceImpl.sensorLogCheck((ds.service3.SensorLogRequest) request,
              (io.grpc.stub.StreamObserver<ds.service3.SensorLogResponse>) responseObserver);
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
        case METHODID_MOTION_SENSOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.motionSensor(
              (io.grpc.stub.StreamObserver<ds.service3.SensorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IntrusionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntrusionDetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntrusionDetectionService");
    }
  }

  private static final class IntrusionDetectionServiceFileDescriptorSupplier
      extends IntrusionDetectionServiceBaseDescriptorSupplier {
    IntrusionDetectionServiceFileDescriptorSupplier() {}
  }

  private static final class IntrusionDetectionServiceMethodDescriptorSupplier
      extends IntrusionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntrusionDetectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntrusionDetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntrusionDetectionServiceFileDescriptorSupplier())
              .addMethod(getMotionSensorMethod())
              .addMethod(getSensorLogCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
