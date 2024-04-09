package com.cloud.app.proto;

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
    comments = "Source: user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.cloud.app.proto.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.ListUsersRequest,
      com.cloud.app.proto.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.cloud.app.proto.ListUsersRequest.class,
      responseType = com.cloud.app.proto.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.ListUsersRequest,
      com.cloud.app.proto.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.ListUsersRequest, com.cloud.app.proto.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
          UserServiceGrpc.getListUsersMethod = getListUsersMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.ListUsersRequest, com.cloud.app.proto.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.ListUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUsers"))
                  .build();
          }
        }
     }
     return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserRequest,
      com.cloud.app.proto.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.cloud.app.proto.GetUserRequest.class,
      responseType = com.cloud.app.proto.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserRequest,
      com.cloud.app.proto.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserRequest, com.cloud.app.proto.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.GetUserRequest, com.cloud.app.proto.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserRequest,
      com.cloud.app.proto.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.cloud.app.proto.CreateUserRequest.class,
      responseType = com.cloud.app.proto.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserRequest,
      com.cloud.app.proto.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserRequest, com.cloud.app.proto.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.CreateUserRequest, com.cloud.app.proto.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserRequest,
      com.cloud.app.proto.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.cloud.app.proto.UpdateUserRequest.class,
      responseType = com.cloud.app.proto.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserRequest,
      com.cloud.app.proto.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserRequest, com.cloud.app.proto.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.UpdateUserRequest, com.cloud.app.proto.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.UpdateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserRequest,
      com.cloud.app.proto.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.cloud.app.proto.DeleteUserRequest.class,
      responseType = com.cloud.app.proto.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserRequest,
      com.cloud.app.proto.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserRequest, com.cloud.app.proto.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.DeleteUserRequest, com.cloud.app.proto.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.DeleteUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserSettingRequest,
      com.cloud.app.proto.GetUserSettingResponse> getGetUserSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSetting",
      requestType = com.cloud.app.proto.GetUserSettingRequest.class,
      responseType = com.cloud.app.proto.GetUserSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserSettingRequest,
      com.cloud.app.proto.GetUserSettingResponse> getGetUserSettingMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.GetUserSettingRequest, com.cloud.app.proto.GetUserSettingResponse> getGetUserSettingMethod;
    if ((getGetUserSettingMethod = UserServiceGrpc.getGetUserSettingMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserSettingMethod = UserServiceGrpc.getGetUserSettingMethod) == null) {
          UserServiceGrpc.getGetUserSettingMethod = getGetUserSettingMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.GetUserSettingRequest, com.cloud.app.proto.GetUserSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "GetUserSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.GetUserSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.GetUserSettingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserSetting"))
                  .build();
          }
        }
     }
     return getGetUserSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserSettingRequest,
      com.cloud.app.proto.UpdateUserSettingResponse> getUpdateUserSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSetting",
      requestType = com.cloud.app.proto.UpdateUserSettingRequest.class,
      responseType = com.cloud.app.proto.UpdateUserSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserSettingRequest,
      com.cloud.app.proto.UpdateUserSettingResponse> getUpdateUserSettingMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.UpdateUserSettingRequest, com.cloud.app.proto.UpdateUserSettingResponse> getUpdateUserSettingMethod;
    if ((getUpdateUserSettingMethod = UserServiceGrpc.getUpdateUserSettingMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserSettingMethod = UserServiceGrpc.getUpdateUserSettingMethod) == null) {
          UserServiceGrpc.getUpdateUserSettingMethod = getUpdateUserSettingMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.UpdateUserSettingRequest, com.cloud.app.proto.UpdateUserSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "UpdateUserSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.UpdateUserSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.UpdateUserSettingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUserSetting"))
                  .build();
          }
        }
     }
     return getUpdateUserSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.ListUserAccessTokensRequest,
      com.cloud.app.proto.ListUserAccessTokensResponse> getListUserAccessTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserAccessTokens",
      requestType = com.cloud.app.proto.ListUserAccessTokensRequest.class,
      responseType = com.cloud.app.proto.ListUserAccessTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.ListUserAccessTokensRequest,
      com.cloud.app.proto.ListUserAccessTokensResponse> getListUserAccessTokensMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.ListUserAccessTokensRequest, com.cloud.app.proto.ListUserAccessTokensResponse> getListUserAccessTokensMethod;
    if ((getListUserAccessTokensMethod = UserServiceGrpc.getListUserAccessTokensMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserAccessTokensMethod = UserServiceGrpc.getListUserAccessTokensMethod) == null) {
          UserServiceGrpc.getListUserAccessTokensMethod = getListUserAccessTokensMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.ListUserAccessTokensRequest, com.cloud.app.proto.ListUserAccessTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "ListUserAccessTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.ListUserAccessTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.ListUserAccessTokensResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUserAccessTokens"))
                  .build();
          }
        }
     }
     return getListUserAccessTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserAccessTokenRequest,
      com.cloud.app.proto.CreateUserAccessTokenResponse> getCreateUserAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserAccessToken",
      requestType = com.cloud.app.proto.CreateUserAccessTokenRequest.class,
      responseType = com.cloud.app.proto.CreateUserAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserAccessTokenRequest,
      com.cloud.app.proto.CreateUserAccessTokenResponse> getCreateUserAccessTokenMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.CreateUserAccessTokenRequest, com.cloud.app.proto.CreateUserAccessTokenResponse> getCreateUserAccessTokenMethod;
    if ((getCreateUserAccessTokenMethod = UserServiceGrpc.getCreateUserAccessTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserAccessTokenMethod = UserServiceGrpc.getCreateUserAccessTokenMethod) == null) {
          UserServiceGrpc.getCreateUserAccessTokenMethod = getCreateUserAccessTokenMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.CreateUserAccessTokenRequest, com.cloud.app.proto.CreateUserAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "CreateUserAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.CreateUserAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.CreateUserAccessTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUserAccessToken"))
                  .build();
          }
        }
     }
     return getCreateUserAccessTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserAccessTokenRequest,
      com.cloud.app.proto.DeleteUserAccessTokenResponse> getDeleteUserAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserAccessToken",
      requestType = com.cloud.app.proto.DeleteUserAccessTokenRequest.class,
      responseType = com.cloud.app.proto.DeleteUserAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserAccessTokenRequest,
      com.cloud.app.proto.DeleteUserAccessTokenResponse> getDeleteUserAccessTokenMethod() {
    io.grpc.MethodDescriptor<com.cloud.app.proto.DeleteUserAccessTokenRequest, com.cloud.app.proto.DeleteUserAccessTokenResponse> getDeleteUserAccessTokenMethod;
    if ((getDeleteUserAccessTokenMethod = UserServiceGrpc.getDeleteUserAccessTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserAccessTokenMethod = UserServiceGrpc.getDeleteUserAccessTokenMethod) == null) {
          UserServiceGrpc.getDeleteUserAccessTokenMethod = getDeleteUserAccessTokenMethod = 
              io.grpc.MethodDescriptor.<com.cloud.app.proto.DeleteUserAccessTokenRequest, com.cloud.app.proto.DeleteUserAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cloud.app.proto.UserService", "DeleteUserAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.DeleteUserAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloud.app.proto.DeleteUserAccessTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUserAccessToken"))
                  .build();
          }
        }
     }
     return getDeleteUserAccessTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public void listUsers(com.cloud.app.proto.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUser gets a user by name.
     * </pre>
     */
    public void getUser(com.cloud.app.proto.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user.
     * </pre>
     */
    public void createUser(com.cloud.app.proto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public void updateUser(com.cloud.app.proto.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteUser deletes a user.
     * </pre>
     */
    public void deleteUser(com.cloud.app.proto.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * option (google.api.http) = {get: "/api/v2/{name=users/&#42;}/setting"};
     * option (google.api.method_signature) = "name";
     * </pre>
     */
    public void getUserSetting(com.cloud.app.proto.GetUserSettingRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserSettingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * option (google.api.http) = {
     *   patch: "/api/v2/{setting.name=users/&#42;&#47;setting}"
     *  body: "setting"
     * };
     * option (google.api.method_signature) = "setting,update_mask";
     * </pre>
     */
    public void updateUserSetting(com.cloud.app.proto.UpdateUserSettingRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserSettingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUserAccessTokens returns a list of access tokens for a user.
     * </pre>
     */
    public void listUserAccessTokens(com.cloud.app.proto.ListUserAccessTokensRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUserAccessTokensResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUserAccessTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUserAccessToken creates a new access token for a user.
     * </pre>
     */
    public void createUserAccessToken(com.cloud.app.proto.CreateUserAccessTokenRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserAccessTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteUserAccessToken deletes an access token for a user.
     * </pre>
     */
    public void deleteUserAccessToken(com.cloud.app.proto.DeleteUserAccessTokenRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserAccessTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.ListUsersRequest,
                com.cloud.app.proto.ListUsersResponse>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.GetUserRequest,
                com.cloud.app.proto.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.CreateUserRequest,
                com.cloud.app.proto.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.UpdateUserRequest,
                com.cloud.app.proto.UpdateUserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.DeleteUserRequest,
                com.cloud.app.proto.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetUserSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.GetUserSettingRequest,
                com.cloud.app.proto.GetUserSettingResponse>(
                  this, METHODID_GET_USER_SETTING)))
          .addMethod(
            getUpdateUserSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.UpdateUserSettingRequest,
                com.cloud.app.proto.UpdateUserSettingResponse>(
                  this, METHODID_UPDATE_USER_SETTING)))
          .addMethod(
            getListUserAccessTokensMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.ListUserAccessTokensRequest,
                com.cloud.app.proto.ListUserAccessTokensResponse>(
                  this, METHODID_LIST_USER_ACCESS_TOKENS)))
          .addMethod(
            getCreateUserAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.CreateUserAccessTokenRequest,
                com.cloud.app.proto.CreateUserAccessTokenResponse>(
                  this, METHODID_CREATE_USER_ACCESS_TOKEN)))
          .addMethod(
            getDeleteUserAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloud.app.proto.DeleteUserAccessTokenRequest,
                com.cloud.app.proto.DeleteUserAccessTokenResponse>(
                  this, METHODID_DELETE_USER_ACCESS_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public void listUsers(com.cloud.app.proto.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUser gets a user by name.
     * </pre>
     */
    public void getUser(com.cloud.app.proto.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUser creates a new user.
     * </pre>
     */
    public void createUser(com.cloud.app.proto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public void updateUser(com.cloud.app.proto.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteUser deletes a user.
     * </pre>
     */
    public void deleteUser(com.cloud.app.proto.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * option (google.api.http) = {get: "/api/v2/{name=users/&#42;}/setting"};
     * option (google.api.method_signature) = "name";
     * </pre>
     */
    public void getUserSetting(com.cloud.app.proto.GetUserSettingRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserSettingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * option (google.api.http) = {
     *   patch: "/api/v2/{setting.name=users/&#42;&#47;setting}"
     *  body: "setting"
     * };
     * option (google.api.method_signature) = "setting,update_mask";
     * </pre>
     */
    public void updateUserSetting(com.cloud.app.proto.UpdateUserSettingRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserSettingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUserAccessTokens returns a list of access tokens for a user.
     * </pre>
     */
    public void listUserAccessTokens(com.cloud.app.proto.ListUserAccessTokensRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUserAccessTokensResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListUserAccessTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUserAccessToken creates a new access token for a user.
     * </pre>
     */
    public void createUserAccessToken(com.cloud.app.proto.CreateUserAccessTokenRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteUserAccessToken deletes an access token for a user.
     * </pre>
     */
    public void deleteUserAccessToken(com.cloud.app.proto.DeleteUserAccessTokenRequest request,
        io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public com.cloud.app.proto.ListUsersResponse listUsers(com.cloud.app.proto.ListUsersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUser gets a user by name.
     * </pre>
     */
    public com.cloud.app.proto.GetUserResponse getUser(com.cloud.app.proto.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user.
     * </pre>
     */
    public com.cloud.app.proto.CreateUserResponse createUser(com.cloud.app.proto.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.cloud.app.proto.UpdateUserResponse updateUser(com.cloud.app.proto.UpdateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteUser deletes a user.
     * </pre>
     */
    public com.cloud.app.proto.DeleteUserResponse deleteUser(com.cloud.app.proto.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * option (google.api.http) = {get: "/api/v2/{name=users/&#42;}/setting"};
     * option (google.api.method_signature) = "name";
     * </pre>
     */
    public com.cloud.app.proto.GetUserSettingResponse getUserSetting(com.cloud.app.proto.GetUserSettingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * option (google.api.http) = {
     *   patch: "/api/v2/{setting.name=users/&#42;&#47;setting}"
     *  body: "setting"
     * };
     * option (google.api.method_signature) = "setting,update_mask";
     * </pre>
     */
    public com.cloud.app.proto.UpdateUserSettingResponse updateUserSetting(com.cloud.app.proto.UpdateUserSettingRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUserAccessTokens returns a list of access tokens for a user.
     * </pre>
     */
    public com.cloud.app.proto.ListUserAccessTokensResponse listUserAccessTokens(com.cloud.app.proto.ListUserAccessTokensRequest request) {
      return blockingUnaryCall(
          getChannel(), getListUserAccessTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUserAccessToken creates a new access token for a user.
     * </pre>
     */
    public com.cloud.app.proto.CreateUserAccessTokenResponse createUserAccessToken(com.cloud.app.proto.CreateUserAccessTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserAccessTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteUserAccessToken deletes an access token for a user.
     * </pre>
     */
    public com.cloud.app.proto.DeleteUserAccessTokenResponse deleteUserAccessToken(com.cloud.app.proto.DeleteUserAccessTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserAccessTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.ListUsersResponse> listUsers(
        com.cloud.app.proto.ListUsersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUser gets a user by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.GetUserResponse> getUser(
        com.cloud.app.proto.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUser creates a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.CreateUserResponse> createUser(
        com.cloud.app.proto.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.UpdateUserResponse> updateUser(
        com.cloud.app.proto.UpdateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteUser deletes a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.DeleteUserResponse> deleteUser(
        com.cloud.app.proto.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * option (google.api.http) = {get: "/api/v2/{name=users/&#42;}/setting"};
     * option (google.api.method_signature) = "name";
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.GetUserSettingResponse> getUserSetting(
        com.cloud.app.proto.GetUserSettingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * option (google.api.http) = {
     *   patch: "/api/v2/{setting.name=users/&#42;&#47;setting}"
     *  body: "setting"
     * };
     * option (google.api.method_signature) = "setting,update_mask";
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.UpdateUserSettingResponse> updateUserSetting(
        com.cloud.app.proto.UpdateUserSettingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListUserAccessTokens returns a list of access tokens for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.ListUserAccessTokensResponse> listUserAccessTokens(
        com.cloud.app.proto.ListUserAccessTokensRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListUserAccessTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUserAccessToken creates a new access token for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.CreateUserAccessTokenResponse> createUserAccessToken(
        com.cloud.app.proto.CreateUserAccessTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserAccessTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteUserAccessToken deletes an access token for a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloud.app.proto.DeleteUserAccessTokenResponse> deleteUserAccessToken(
        com.cloud.app.proto.DeleteUserAccessTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserAccessTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USERS = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_GET_USER_SETTING = 5;
  private static final int METHODID_UPDATE_USER_SETTING = 6;
  private static final int METHODID_LIST_USER_ACCESS_TOKENS = 7;
  private static final int METHODID_CREATE_USER_ACCESS_TOKEN = 8;
  private static final int METHODID_DELETE_USER_ACCESS_TOKEN = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.cloud.app.proto.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUsersResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.cloud.app.proto.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.cloud.app.proto.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.cloud.app.proto.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.cloud.app.proto.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SETTING:
          serviceImpl.getUserSetting((com.cloud.app.proto.GetUserSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.GetUserSettingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SETTING:
          serviceImpl.updateUserSetting((com.cloud.app.proto.UpdateUserSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.UpdateUserSettingResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_ACCESS_TOKENS:
          serviceImpl.listUserAccessTokens((com.cloud.app.proto.ListUserAccessTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.ListUserAccessTokensResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_ACCESS_TOKEN:
          serviceImpl.createUserAccessToken((com.cloud.app.proto.CreateUserAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.CreateUserAccessTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_ACCESS_TOKEN:
          serviceImpl.deleteUserAccessToken((com.cloud.app.proto.DeleteUserAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.cloud.app.proto.DeleteUserAccessTokenResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cloud.app.proto.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getListUsersMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetUserSettingMethod())
              .addMethod(getUpdateUserSettingMethod())
              .addMethod(getListUserAccessTokensMethod())
              .addMethod(getCreateUserAccessTokenMethod())
              .addMethod(getDeleteUserAccessTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
