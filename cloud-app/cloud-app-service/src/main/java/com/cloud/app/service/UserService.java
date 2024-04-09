package com.cloud.app.service;


import com.alibaba.fastjson.JSON;
import com.cloud.app.proto.CreateUserRequest;
import com.cloud.app.proto.CreateUserResponse;
import com.cloud.app.proto.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;



@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> responseObserver) {
        System.out.println(" UserService 接收到的参数: " + request);
        CreateUserResponse response = CreateUserResponse.newBuilder().setUser(request.getUser()).build();
        System.out.println(response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }
}
