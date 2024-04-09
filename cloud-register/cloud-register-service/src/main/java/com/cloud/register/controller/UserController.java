package com.cloud.register.controller;

import com.cloud.common.SingleResponse;
import com.cloud.register.UserService;
import com.cloud.register.domain.User;
import com.cloud.register.req.UserLogReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/register")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/login")
    public SingleResponse<User> login(@RequestBody UserLogReq req) {
        System.out.println("test login");
        SingleResponse<User> resp = userService.login(req);
        return resp;
    }
    @PostMapping(path = "/register")
    public SingleResponse<User> register(@RequestBody UserLogReq req) {
        SingleResponse<User> resp = userService.register(req);
        return resp;
    }
}
