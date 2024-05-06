package com.cloud.app.service;

import com.cloud.app.annotion.GrpcService;
import com.cloud.app.proto.AuthServiceGrpc;
import com.cloud.app.proto.GetAuthStatusRequest;
import com.cloud.app.proto.GetAuthStatusResponse;
import com.cloud.app.proto.User;
import com.cloud.app.util.CustomServerInterceptor;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author JingRAN
 */
@GrpcService
public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {

    @Autowired
    private CustomServerInterceptor customInterceptor;

    @Override
    public void getAuthStatus(GetAuthStatusRequest request, StreamObserver<GetAuthStatusResponse> responseObserver) {
        System.out.println("AuthService 接收的参数：" + request);
        int id = request.getId();
        User user = User.newBuilder().setId(id).setName("hello").setPassword("helllo").build();
        GetAuthStatusResponse response = GetAuthStatusResponse.newBuilder().setUser(user).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public final ServerServiceDefinition bindService() {
        // 将自定义的ServerInterceptor添加到拦截器链中
        return ServerInterceptors.intercept(super.bindService(), customInterceptor);
    }



//    @Override
//    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
//            ServerCall<ReqT, RespT> call,
//            final Metadata requestHeaders,
//            ServerCallHandler<ReqT, RespT> next) {
//        // @1 打印从客户端设置的header信息
//        return next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
//            void publicvoidsendHeaders(Metadata responseHeaders) {
//                responseHeaders.put(Metadata.Key.of("content-type"));
//                // @2 响应客户端设置服务端Header信息
//                super.sendHeaders(responseHeaders);
//            }
//        }, requestHeaders);
//    }
}
