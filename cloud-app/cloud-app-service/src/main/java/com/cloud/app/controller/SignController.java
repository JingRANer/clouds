package com.cloud.app.controller;


import com.alibaba.fastjson.JSON;
//import com.cloud.app.proto.User;
import com.cloud.app.proto.GetAuthStatusRequest;
import com.cloud.app.proto.GetAuthStatusRequestOrBuilder;
import com.cloud.app.proto.GetUserRequest;
import org.springframework.web.bind.annotation.*;

//@Api(tags = "signin")
@RestController
@RequestMapping("user")
@CrossOrigin
public class SignController {

//    @PostMapping(value="signin", produces="application/x-protobuf")
    @PostMapping(value="signin")
    public User signin(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            @RequestParam("remember") Boolean remember
            @RequestBody User user
    ) {
//        User user = User.newBuilder()
//                .setUsername(username)
//                .setPassword(password)
//                .build();
//        User user = new User();
//        user.setUserName(username);
        GetAuthStatusRequest request = GetAuthStatusRequest.newBuilder().setId(1).build();
        user.setId(1);
        return user;
    }
}
