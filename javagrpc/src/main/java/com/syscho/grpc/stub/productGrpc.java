package com.syscho.grpc.stub;

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
    comments = "Source: product.proto")
public final class productGrpc {

  private productGrpc() {}

  public static final String SERVICE_NAME = "product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Empty,
      com.syscho.grpc.stub.ProductOuterClass.Products> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProducts",
      requestType = com.syscho.grpc.stub.ProductOuterClass.Empty.class,
      responseType = com.syscho.grpc.stub.ProductOuterClass.Products.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Empty,
      com.syscho.grpc.stub.ProductOuterClass.Products> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Empty, com.syscho.grpc.stub.ProductOuterClass.Products> getGetProductsMethod;
    if ((getGetProductsMethod = productGrpc.getGetProductsMethod) == null) {
      synchronized (productGrpc.class) {
        if ((getGetProductsMethod = productGrpc.getGetProductsMethod) == null) {
          productGrpc.getGetProductsMethod = getGetProductsMethod = 
              io.grpc.MethodDescriptor.<com.syscho.grpc.stub.ProductOuterClass.Empty, com.syscho.grpc.stub.ProductOuterClass.Products>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product", "getProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.Products.getDefaultInstance()))
                  .setSchemaDescriptor(new productMethodDescriptorSupplier("getProducts"))
                  .build();
          }
        }
     }
     return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId,
      com.syscho.grpc.stub.ProductOuterClass.Product> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductById",
      requestType = com.syscho.grpc.stub.ProductOuterClass.ProductId.class,
      responseType = com.syscho.grpc.stub.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId,
      com.syscho.grpc.stub.ProductOuterClass.Product> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId, com.syscho.grpc.stub.ProductOuterClass.Product> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = productGrpc.getGetProductByIdMethod) == null) {
      synchronized (productGrpc.class) {
        if ((getGetProductByIdMethod = productGrpc.getGetProductByIdMethod) == null) {
          productGrpc.getGetProductByIdMethod = getGetProductByIdMethod = 
              io.grpc.MethodDescriptor.<com.syscho.grpc.stub.ProductOuterClass.ProductId, com.syscho.grpc.stub.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product", "getProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new productMethodDescriptorSupplier("getProductById"))
                  .build();
          }
        }
     }
     return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId,
      com.syscho.grpc.stub.ProductOuterClass.StringMsg> getDeleteProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProductById",
      requestType = com.syscho.grpc.stub.ProductOuterClass.ProductId.class,
      responseType = com.syscho.grpc.stub.ProductOuterClass.StringMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId,
      com.syscho.grpc.stub.ProductOuterClass.StringMsg> getDeleteProductByIdMethod() {
    io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.ProductId, com.syscho.grpc.stub.ProductOuterClass.StringMsg> getDeleteProductByIdMethod;
    if ((getDeleteProductByIdMethod = productGrpc.getDeleteProductByIdMethod) == null) {
      synchronized (productGrpc.class) {
        if ((getDeleteProductByIdMethod = productGrpc.getDeleteProductByIdMethod) == null) {
          productGrpc.getDeleteProductByIdMethod = getDeleteProductByIdMethod = 
              io.grpc.MethodDescriptor.<com.syscho.grpc.stub.ProductOuterClass.ProductId, com.syscho.grpc.stub.ProductOuterClass.StringMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product", "deleteProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.StringMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new productMethodDescriptorSupplier("deleteProductById"))
                  .build();
          }
        }
     }
     return getDeleteProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Product,
      com.syscho.grpc.stub.ProductOuterClass.Product> getSaveProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveProduct",
      requestType = com.syscho.grpc.stub.ProductOuterClass.Product.class,
      responseType = com.syscho.grpc.stub.ProductOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Product,
      com.syscho.grpc.stub.ProductOuterClass.Product> getSaveProductMethod() {
    io.grpc.MethodDescriptor<com.syscho.grpc.stub.ProductOuterClass.Product, com.syscho.grpc.stub.ProductOuterClass.Product> getSaveProductMethod;
    if ((getSaveProductMethod = productGrpc.getSaveProductMethod) == null) {
      synchronized (productGrpc.class) {
        if ((getSaveProductMethod = productGrpc.getSaveProductMethod) == null) {
          productGrpc.getSaveProductMethod = getSaveProductMethod = 
              io.grpc.MethodDescriptor.<com.syscho.grpc.stub.ProductOuterClass.Product, com.syscho.grpc.stub.ProductOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product", "saveProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.syscho.grpc.stub.ProductOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new productMethodDescriptorSupplier("saveProduct"))
                  .build();
          }
        }
     }
     return getSaveProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static productStub newStub(io.grpc.Channel channel) {
    return new productStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static productBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new productBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static productFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new productFutureStub(channel);
  }

  /**
   */
  public static abstract class productImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProducts(com.syscho.grpc.stub.ProductOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Products> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     */
    public void getProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.StringMsg> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveProduct(com.syscho.grpc.stub.ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.syscho.grpc.stub.ProductOuterClass.Empty,
                com.syscho.grpc.stub.ProductOuterClass.Products>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            getGetProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.syscho.grpc.stub.ProductOuterClass.ProductId,
                com.syscho.grpc.stub.ProductOuterClass.Product>(
                  this, METHODID_GET_PRODUCT_BY_ID)))
          .addMethod(
            getDeleteProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.syscho.grpc.stub.ProductOuterClass.ProductId,
                com.syscho.grpc.stub.ProductOuterClass.StringMsg>(
                  this, METHODID_DELETE_PRODUCT_BY_ID)))
          .addMethod(
            getSaveProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.syscho.grpc.stub.ProductOuterClass.Product,
                com.syscho.grpc.stub.ProductOuterClass.Product>(
                  this, METHODID_SAVE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class productStub extends io.grpc.stub.AbstractStub<productStub> {
    private productStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productStub(channel, callOptions);
    }

    /**
     */
    public void getProducts(com.syscho.grpc.stub.ProductOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Products> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.StringMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveProduct(com.syscho.grpc.stub.ProductOuterClass.Product request,
        io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class productBlockingStub extends io.grpc.stub.AbstractStub<productBlockingStub> {
    private productBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.syscho.grpc.stub.ProductOuterClass.Products getProducts(com.syscho.grpc.stub.ProductOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syscho.grpc.stub.ProductOuterClass.Product getProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syscho.grpc.stub.ProductOuterClass.StringMsg deleteProductById(com.syscho.grpc.stub.ProductOuterClass.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.syscho.grpc.stub.ProductOuterClass.Product saveProduct(com.syscho.grpc.stub.ProductOuterClass.Product request) {
      return blockingUnaryCall(
          getChannel(), getSaveProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class productFutureStub extends io.grpc.stub.AbstractStub<productFutureStub> {
    private productFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syscho.grpc.stub.ProductOuterClass.Products> getProducts(
        com.syscho.grpc.stub.ProductOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syscho.grpc.stub.ProductOuterClass.Product> getProductById(
        com.syscho.grpc.stub.ProductOuterClass.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syscho.grpc.stub.ProductOuterClass.StringMsg> deleteProductById(
        com.syscho.grpc.stub.ProductOuterClass.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.syscho.grpc.stub.ProductOuterClass.Product> saveProduct(
        com.syscho.grpc.stub.ProductOuterClass.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_DELETE_PRODUCT_BY_ID = 2;
  private static final int METHODID_SAVE_PRODUCT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final productImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(productImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.syscho.grpc.stub.ProductOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Products>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((com.syscho.grpc.stub.ProductOuterClass.ProductId) request,
              (io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_BY_ID:
          serviceImpl.deleteProductById((com.syscho.grpc.stub.ProductOuterClass.ProductId) request,
              (io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.StringMsg>) responseObserver);
          break;
        case METHODID_SAVE_PRODUCT:
          serviceImpl.saveProduct((com.syscho.grpc.stub.ProductOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<com.syscho.grpc.stub.ProductOuterClass.Product>) responseObserver);
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

  private static abstract class productBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    productBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.syscho.grpc.stub.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("product");
    }
  }

  private static final class productFileDescriptorSupplier
      extends productBaseDescriptorSupplier {
    productFileDescriptorSupplier() {}
  }

  private static final class productMethodDescriptorSupplier
      extends productBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    productMethodDescriptorSupplier(String methodName) {
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
      synchronized (productGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new productFileDescriptorSupplier())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getDeleteProductByIdMethod())
              .addMethod(getSaveProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
