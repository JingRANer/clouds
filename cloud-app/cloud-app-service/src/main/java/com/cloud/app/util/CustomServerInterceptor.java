package com.cloud.app.util;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.stereotype.Component;

@Component
@GrpcGlobalServerInterceptor
public class CustomServerInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                                 Metadata headers,
                                                                 ServerCallHandler<ReqT, RespT> next) {

        // 从请求中读取数据
        // 例如，从请求的header中获取某个字段的值
        String customData = headers.get(Metadata.Key.of("custom-data", Metadata.ASCII_STRING_MARSHALLER));
        System.out.println("Custom data from request: " + customData);

        // 将数据设置在响应中
        ServerCall.Listener<ReqT> listener = next.startCall(call, headers);

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(listener) {
            @Override
            public void onHalfClose() {
                // 在响应完成之前，可以修改响应的header或payload
                // 例如，将自定义字段设置在响应的header中
                Metadata responseHeaders = new Metadata();
                responseHeaders.put(Metadata.Key.of("custom-data", Metadata.ASCII_STRING_MARSHALLER), "Custom Data from Response");
                responseHeaders.put(Metadata.Key.of("content-type", Metadata.ASCII_STRING_MARSHALLER), "applictaion/grpc-web+proto");
                call.sendHeaders(responseHeaders);

                super.onHalfClose();
            }
        };
    }
}