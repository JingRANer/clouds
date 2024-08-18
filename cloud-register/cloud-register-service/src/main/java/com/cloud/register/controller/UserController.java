package com.cloud.register.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.cloud.common.SingleResponse;
import com.cloud.register.UserService;
import com.cloud.register.domain.User;
import com.cloud.register.req.UserLogReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user/")
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

    @RequestMapping("doLogin")
    public SingleResponse<User> doLogin(@RequestBody UserLogReq req) {
        return userService.login(req);
    }

    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
    @RequestMapping("isLogin")
    public String isLogin(String userId) {
        return "当前会话是否登录：" + StpUtil.isLogin(userId);
    }

}
