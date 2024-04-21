package com.cloud.app.service;

import com.cloud.app.annotion.GrpcService;
import com.cloud.app.proto.AuthServiceGrpc;
import com.cloud.app.proto.GetAuthStatusRequest;
import com.cloud.app.proto.GetAuthStatusResponse;
import com.cloud.app.proto.User;
import io.grpc.stub.StreamObserver;

/**
 * @author JingRAN
 */
@GrpcService
public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {

    @Override
    public void getAuthStatus(GetAuthStatusRequest request, StreamObserver<GetAuthStatusResponse> responseObserver) {
        System.out.println("AuthService 接收的参数：" + request);
        int id = request.getId();
        User user = User.newBuilder().setId(id).setName("hello").setPassword("helllo").build();
        GetAuthStatusResponse response = GetAuthStatusResponse.newBuilder().setUser(user).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
