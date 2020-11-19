package com.example.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: keyValue.proto")
public final class KeyValueGrpc {

  private KeyValueGrpc() {}

  public static final String SERVICE_NAME = "KeyValue";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.SetKeyValueRequest,
      com.example.grpc.KeyValueOuterClass.Status> getSetKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setKV",
      requestType = com.example.grpc.KeyValueOuterClass.SetKeyValueRequest.class,
      responseType = com.example.grpc.KeyValueOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.SetKeyValueRequest,
      com.example.grpc.KeyValueOuterClass.Status> getSetKVMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.SetKeyValueRequest, com.example.grpc.KeyValueOuterClass.Status> getSetKVMethod;
    if ((getSetKVMethod = KeyValueGrpc.getSetKVMethod) == null) {
      synchronized (KeyValueGrpc.class) {
        if ((getSetKVMethod = KeyValueGrpc.getSetKVMethod) == null) {
          KeyValueGrpc.getSetKVMethod = getSetKVMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.KeyValueOuterClass.SetKeyValueRequest, com.example.grpc.KeyValueOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KeyValue", "setKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.KeyValueOuterClass.SetKeyValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.KeyValueOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyValueMethodDescriptorSupplier("setKV"))
                  .build();
          }
        }
     }
     return getSetKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.GetValueRequest,
      com.example.grpc.KeyValueOuterClass.Status> getGetKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getKV",
      requestType = com.example.grpc.KeyValueOuterClass.GetValueRequest.class,
      responseType = com.example.grpc.KeyValueOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.GetValueRequest,
      com.example.grpc.KeyValueOuterClass.Status> getGetKVMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.KeyValueOuterClass.GetValueRequest, com.example.grpc.KeyValueOuterClass.Status> getGetKVMethod;
    if ((getGetKVMethod = KeyValueGrpc.getGetKVMethod) == null) {
      synchronized (KeyValueGrpc.class) {
        if ((getGetKVMethod = KeyValueGrpc.getGetKVMethod) == null) {
          KeyValueGrpc.getGetKVMethod = getGetKVMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.KeyValueOuterClass.GetValueRequest, com.example.grpc.KeyValueOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KeyValue", "getKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.KeyValueOuterClass.GetValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.KeyValueOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new KeyValueMethodDescriptorSupplier("getKV"))
                  .build();
          }
        }
     }
     return getGetKVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyValueStub newStub(io.grpc.Channel channel) {
    return new KeyValueStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyValueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeyValueBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyValueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeyValueFutureStub(channel);
  }

  /**
   */
  public static abstract class KeyValueImplBase implements io.grpc.BindableService {

    /**
     */
    public void setKV(com.example.grpc.KeyValueOuterClass.SetKeyValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getSetKVMethod(), responseObserver);
    }

    /**
     */
    public void getKV(com.example.grpc.KeyValueOuterClass.GetValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKVMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetKVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.KeyValueOuterClass.SetKeyValueRequest,
                com.example.grpc.KeyValueOuterClass.Status>(
                  this, METHODID_SET_KV)))
          .addMethod(
            getGetKVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.KeyValueOuterClass.GetValueRequest,
                com.example.grpc.KeyValueOuterClass.Status>(
                  this, METHODID_GET_KV)))
          .build();
    }
  }

  /**
   */
  public static final class KeyValueStub extends io.grpc.stub.AbstractStub<KeyValueStub> {
    private KeyValueStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueStub(channel, callOptions);
    }

    /**
     */
    public void setKV(com.example.grpc.KeyValueOuterClass.SetKeyValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKV(com.example.grpc.KeyValueOuterClass.GetValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyValueBlockingStub extends io.grpc.stub.AbstractStub<KeyValueBlockingStub> {
    private KeyValueBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.KeyValueOuterClass.Status setKV(com.example.grpc.KeyValueOuterClass.SetKeyValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetKVMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.KeyValueOuterClass.Status getKV(com.example.grpc.KeyValueOuterClass.GetValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKVMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyValueFutureStub extends io.grpc.stub.AbstractStub<KeyValueFutureStub> {
    private KeyValueFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.KeyValueOuterClass.Status> setKV(
        com.example.grpc.KeyValueOuterClass.SetKeyValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetKVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.KeyValueOuterClass.Status> getKV(
        com.example.grpc.KeyValueOuterClass.GetValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_KV = 0;
  private static final int METHODID_GET_KV = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyValueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyValueImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_KV:
          serviceImpl.setKV((com.example.grpc.KeyValueOuterClass.SetKeyValueRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status>) responseObserver);
          break;
        case METHODID_GET_KV:
          serviceImpl.getKV((com.example.grpc.KeyValueOuterClass.GetValueRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.KeyValueOuterClass.Status>) responseObserver);
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

  private static abstract class KeyValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyValueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.KeyValueOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyValue");
    }
  }

  private static final class KeyValueFileDescriptorSupplier
      extends KeyValueBaseDescriptorSupplier {
    KeyValueFileDescriptorSupplier() {}
  }

  private static final class KeyValueMethodDescriptorSupplier
      extends KeyValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyValueMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyValueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyValueFileDescriptorSupplier())
              .addMethod(getSetKVMethod())
              .addMethod(getGetKVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
