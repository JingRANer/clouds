package com.cloud.register.service;

import com.cloud.common.CloudErrorEnum;
import com.cloud.common.SingleResponse;
import com.cloud.register.UserService;
import com.cloud.register.domain.User;
import com.cloud.register.repository.UserRepository;
import com.cloud.register.req.UserLogReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public SingleResponse<User> login(UserLogReq req) {
        User user = userRepository.selectByMobile(req.getUser().getMobile());
        if(user == null) {
            return SingleResponse.buildFailure(CloudErrorEnum.LOGIN_NO_USER);
        }
        if(!user.getPassword().equals(req.getUser().getPassword())) {
            return SingleResponse.buildFailure(CloudErrorEnum.LOGIN_WRONG_PASSWORD);
        }
        return SingleResponse.of(user);

    }

    @Override
    public SingleResponse register(UserLogReq req) {
        return userRepository.save(req.getUser());
    }

    @Override
    public SingleResponse editUser(User user) {
        return userRepository.update(user);
    }

    @Override
    public SingleResponse<User> findUser(String userId) {
        User user = userRepository.selectByUserId(userId);
        return SingleResponse.of(user);
    }
}
