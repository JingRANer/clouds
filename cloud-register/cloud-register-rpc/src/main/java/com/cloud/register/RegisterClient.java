package com.cloud.register;

import com.cloud.common.SingleResponse;
import com.cloud.register.domain.User;
import com.cloud.register.req.UserLogReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cloud-register-service")
public interface RegisterClient {


    @PostMapping(path = "/login")
    SingleResponse<User> login(@RequestParam UserLogReq req);

    @PostMapping(path = "/register")
    SingleResponse<User> register(@RequestParam UserLogReq req);
}
