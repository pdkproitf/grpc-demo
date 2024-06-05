package spring_boot.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: greeting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = spring_boot.grpc.GreetRequest.class,
      responseType = spring_boot.grpc.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse> getSayHelloMethod;
    if ((getSayHelloMethod = GreetServiceGrpc.getSayHelloMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getSayHelloMethod = GreetServiceGrpc.getSayHelloMethod) == null) {
          GreetServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloManyTimes",
      requestType = spring_boot.grpc.GreetRequest.class,
      responseType = spring_boot.grpc.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloManyTimesMethod() {
    io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse> getSayHelloManyTimesMethod;
    if ((getSayHelloManyTimesMethod = GreetServiceGrpc.getSayHelloManyTimesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getSayHelloManyTimesMethod = GreetServiceGrpc.getSayHelloManyTimesMethod) == null) {
          GreetServiceGrpc.getSayHelloManyTimesMethod = getSayHelloManyTimesMethod =
              io.grpc.MethodDescriptor.<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("SayHelloManyTimes"))
              .build();
        }
      }
    }
    return getSayHelloManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloAllAtOnceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAllAtOnce",
      requestType = spring_boot.grpc.GreetRequest.class,
      responseType = spring_boot.grpc.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloAllAtOnceMethod() {
    io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse> getSayHelloAllAtOnceMethod;
    if ((getSayHelloAllAtOnceMethod = GreetServiceGrpc.getSayHelloAllAtOnceMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getSayHelloAllAtOnceMethod = GreetServiceGrpc.getSayHelloAllAtOnceMethod) == null) {
          GreetServiceGrpc.getSayHelloAllAtOnceMethod = getSayHelloAllAtOnceMethod =
              io.grpc.MethodDescriptor.<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAllAtOnce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("SayHelloAllAtOnce"))
              .build();
        }
      }
    }
    return getSayHelloAllAtOnceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloOneByOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloOneByOne",
      requestType = spring_boot.grpc.GreetRequest.class,
      responseType = spring_boot.grpc.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest,
      spring_boot.grpc.GreetResponse> getSayHelloOneByOneMethod() {
    io.grpc.MethodDescriptor<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse> getSayHelloOneByOneMethod;
    if ((getSayHelloOneByOneMethod = GreetServiceGrpc.getSayHelloOneByOneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getSayHelloOneByOneMethod = GreetServiceGrpc.getSayHelloOneByOneMethod) == null) {
          GreetServiceGrpc.getSayHelloOneByOneMethod = getSayHelloOneByOneMethod =
              io.grpc.MethodDescriptor.<spring_boot.grpc.GreetRequest, spring_boot.grpc.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHelloOneByOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  spring_boot.grpc.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("sayHelloOneByOne"))
              .build();
        }
      }
    }
    return getSayHelloOneByOneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void sayHello(spring_boot.grpc.GreetRequest request,
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    default void sayHelloManyTimes(spring_boot.grpc.GreetRequest request,
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloManyTimesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<spring_boot.grpc.GreetRequest> sayHelloAllAtOnce(
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloAllAtOnceMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<spring_boot.grpc.GreetRequest> sayHelloOneByOne(
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloOneByOneMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GreetService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GreetService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(spring_boot.grpc.GreetRequest request,
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloManyTimes(spring_boot.grpc.GreetRequest request,
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayHelloManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<spring_boot.grpc.GreetRequest> sayHelloAllAtOnce(
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayHelloAllAtOnceMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<spring_boot.grpc.GreetRequest> sayHelloOneByOne(
        io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloOneByOneMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GreetService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public spring_boot.grpc.GreetResponse sayHello(spring_boot.grpc.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<spring_boot.grpc.GreetResponse> sayHelloManyTimes(
        spring_boot.grpc.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayHelloManyTimesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GreetService.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<spring_boot.grpc.GreetResponse> sayHello(
        spring_boot.grpc.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_MANY_TIMES = 1;
  private static final int METHODID_SAY_HELLO_ALL_AT_ONCE = 2;
  private static final int METHODID_SAY_HELLO_ONE_BY_ONE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((spring_boot.grpc.GreetRequest) request,
              (io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse>) responseObserver);
          break;
        case METHODID_SAY_HELLO_MANY_TIMES:
          serviceImpl.sayHelloManyTimes((spring_boot.grpc.GreetRequest) request,
              (io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse>) responseObserver);
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
        case METHODID_SAY_HELLO_ALL_AT_ONCE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloAllAtOnce(
              (io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse>) responseObserver);
        case METHODID_SAY_HELLO_ONE_BY_ONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloOneByOne(
              (io.grpc.stub.StreamObserver<spring_boot.grpc.GreetResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              spring_boot.grpc.GreetRequest,
              spring_boot.grpc.GreetResponse>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getSayHelloManyTimesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              spring_boot.grpc.GreetRequest,
              spring_boot.grpc.GreetResponse>(
                service, METHODID_SAY_HELLO_MANY_TIMES)))
        .addMethod(
          getSayHelloAllAtOnceMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              spring_boot.grpc.GreetRequest,
              spring_boot.grpc.GreetResponse>(
                service, METHODID_SAY_HELLO_ALL_AT_ONCE)))
        .addMethod(
          getSayHelloOneByOneMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              spring_boot.grpc.GreetRequest,
              spring_boot.grpc.GreetResponse>(
                service, METHODID_SAY_HELLO_ONE_BY_ONE)))
        .build();
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return spring_boot.grpc.GreetProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloManyTimesMethod())
              .addMethod(getSayHelloAllAtOnceMethod())
              .addMethod(getSayHelloOneByOneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
