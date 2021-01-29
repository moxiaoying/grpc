package com.learn.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: data.proto")
public final class DoFormatGrpc {

  private DoFormatGrpc() {}

  public static final String SERVICE_NAME = "com.learn.demo.DoFormat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.learn.demo.DataOuterClass.Data,
      com.learn.demo.DataOuterClass.Data> getText2UpperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Text2Upper",
      requestType = com.learn.demo.DataOuterClass.Data.class,
      responseType = com.learn.demo.DataOuterClass.Data.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learn.demo.DataOuterClass.Data,
      com.learn.demo.DataOuterClass.Data> getText2UpperMethod() {
    io.grpc.MethodDescriptor<com.learn.demo.DataOuterClass.Data, com.learn.demo.DataOuterClass.Data> getText2UpperMethod;
    if ((getText2UpperMethod = DoFormatGrpc.getText2UpperMethod) == null) {
      synchronized (DoFormatGrpc.class) {
        if ((getText2UpperMethod = DoFormatGrpc.getText2UpperMethod) == null) {
          DoFormatGrpc.getText2UpperMethod = getText2UpperMethod =
              io.grpc.MethodDescriptor.<com.learn.demo.DataOuterClass.Data, com.learn.demo.DataOuterClass.Data>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Text2Upper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.demo.DataOuterClass.Data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.demo.DataOuterClass.Data.getDefaultInstance()))
              .setSchemaDescriptor(new DoFormatMethodDescriptorSupplier("Text2Upper"))
              .build();
        }
      }
    }
    return getText2UpperMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoFormatStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoFormatStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoFormatStub>() {
        @java.lang.Override
        public DoFormatStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoFormatStub(channel, callOptions);
        }
      };
    return DoFormatStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoFormatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoFormatBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoFormatBlockingStub>() {
        @java.lang.Override
        public DoFormatBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoFormatBlockingStub(channel, callOptions);
        }
      };
    return DoFormatBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoFormatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoFormatFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoFormatFutureStub>() {
        @java.lang.Override
        public DoFormatFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoFormatFutureStub(channel, callOptions);
        }
      };
    return DoFormatFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DoFormatImplBase implements io.grpc.BindableService {

    /**
     */
    public void text2Upper(com.learn.demo.DataOuterClass.Data request,
        io.grpc.stub.StreamObserver<com.learn.demo.DataOuterClass.Data> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getText2UpperMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getText2UpperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.learn.demo.DataOuterClass.Data,
                com.learn.demo.DataOuterClass.Data>(
                  this, METHODID_TEXT2UPPER)))
          .build();
    }
  }

  /**
   */
  public static final class DoFormatStub extends io.grpc.stub.AbstractAsyncStub<DoFormatStub> {
    private DoFormatStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoFormatStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoFormatStub(channel, callOptions);
    }

    /**
     */
    public void text2Upper(com.learn.demo.DataOuterClass.Data request,
        io.grpc.stub.StreamObserver<com.learn.demo.DataOuterClass.Data> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getText2UpperMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DoFormatBlockingStub extends io.grpc.stub.AbstractBlockingStub<DoFormatBlockingStub> {
    private DoFormatBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoFormatBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoFormatBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.learn.demo.DataOuterClass.Data text2Upper(com.learn.demo.DataOuterClass.Data request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getText2UpperMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DoFormatFutureStub extends io.grpc.stub.AbstractFutureStub<DoFormatFutureStub> {
    private DoFormatFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoFormatFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoFormatFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learn.demo.DataOuterClass.Data> text2Upper(
        com.learn.demo.DataOuterClass.Data request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getText2UpperMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEXT2UPPER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoFormatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoFormatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEXT2UPPER:
          serviceImpl.text2Upper((com.learn.demo.DataOuterClass.Data) request,
              (io.grpc.stub.StreamObserver<com.learn.demo.DataOuterClass.Data>) responseObserver);
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

  private static abstract class DoFormatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoFormatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.learn.demo.DataOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoFormat");
    }
  }

  private static final class DoFormatFileDescriptorSupplier
      extends DoFormatBaseDescriptorSupplier {
    DoFormatFileDescriptorSupplier() {}
  }

  private static final class DoFormatMethodDescriptorSupplier
      extends DoFormatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoFormatMethodDescriptorSupplier(String methodName) {
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
      synchronized (DoFormatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoFormatFileDescriptorSupplier())
              .addMethod(getText2UpperMethod())
              .build();
        }
      }
    }
    return result;
  }
}
