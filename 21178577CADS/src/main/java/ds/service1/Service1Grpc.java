package ds.service1;

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
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service1.EntryRequest,
      ds.service1.EntryResponse> getAuthoriseEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authoriseEntry",
      requestType = ds.service1.EntryRequest.class,
      responseType = ds.service1.EntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service1.EntryRequest,
      ds.service1.EntryResponse> getAuthoriseEntryMethod() {
    io.grpc.MethodDescriptor<ds.service1.EntryRequest, ds.service1.EntryResponse> getAuthoriseEntryMethod;
    if ((getAuthoriseEntryMethod = Service1Grpc.getAuthoriseEntryMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getAuthoriseEntryMethod = Service1Grpc.getAuthoriseEntryMethod) == null) {
          Service1Grpc.getAuthoriseEntryMethod = getAuthoriseEntryMethod = 
              io.grpc.MethodDescriptor.<ds.service1.EntryRequest, ds.service1.EntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "authoriseEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.EntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.EntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("authoriseEntry"))
                  .build();
          }
        }
     }
     return getAuthoriseEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service1.EntryLogRequest,
      ds.service1.EntryLogResponse> getEntryLogCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "entryLogCheck",
      requestType = ds.service1.EntryLogRequest.class,
      responseType = ds.service1.EntryLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service1.EntryLogRequest,
      ds.service1.EntryLogResponse> getEntryLogCheckMethod() {
    io.grpc.MethodDescriptor<ds.service1.EntryLogRequest, ds.service1.EntryLogResponse> getEntryLogCheckMethod;
    if ((getEntryLogCheckMethod = Service1Grpc.getEntryLogCheckMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getEntryLogCheckMethod = Service1Grpc.getEntryLogCheckMethod) == null) {
          Service1Grpc.getEntryLogCheckMethod = getEntryLogCheckMethod = 
              io.grpc.MethodDescriptor.<ds.service1.EntryLogRequest, ds.service1.EntryLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "entryLogCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.EntryLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service1.EntryLogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("entryLogCheck"))
                  .build();
          }
        }
     }
     return getEntryLogCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void authoriseEntry(ds.service1.EntryRequest request,
        io.grpc.stub.StreamObserver<ds.service1.EntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthoriseEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void entryLogCheck(ds.service1.EntryLogRequest request,
        io.grpc.stub.StreamObserver<ds.service1.EntryLogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEntryLogCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthoriseEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service1.EntryRequest,
                ds.service1.EntryResponse>(
                  this, METHODID_AUTHORISE_ENTRY)))
          .addMethod(
            getEntryLogCheckMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service1.EntryLogRequest,
                ds.service1.EntryLogResponse>(
                  this, METHODID_ENTRY_LOG_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void authoriseEntry(ds.service1.EntryRequest request,
        io.grpc.stub.StreamObserver<ds.service1.EntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthoriseEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void entryLogCheck(ds.service1.EntryLogRequest request,
        io.grpc.stub.StreamObserver<ds.service1.EntryLogResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEntryLogCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public ds.service1.EntryResponse authoriseEntry(ds.service1.EntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthoriseEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<ds.service1.EntryLogResponse> entryLogCheck(
        ds.service1.EntryLogRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEntryLogCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service1.EntryResponse> authoriseEntry(
        ds.service1.EntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthoriseEntryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORISE_ENTRY = 0;
  private static final int METHODID_ENTRY_LOG_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORISE_ENTRY:
          serviceImpl.authoriseEntry((ds.service1.EntryRequest) request,
              (io.grpc.stub.StreamObserver<ds.service1.EntryResponse>) responseObserver);
          break;
        case METHODID_ENTRY_LOG_CHECK:
          serviceImpl.entryLogCheck((ds.service1.EntryLogRequest) request,
              (io.grpc.stub.StreamObserver<ds.service1.EntryLogResponse>) responseObserver);
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

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getAuthoriseEntryMethod())
              .addMethod(getEntryLogCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
