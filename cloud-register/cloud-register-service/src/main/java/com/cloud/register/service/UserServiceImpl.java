package com.cloud.register.service;

import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.session.TokenSign;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import com.cloud.common.CloudErrorEnum;
import com.cloud.common.SingleResponse;
import com.cloud.common.util.DateUtil;
import com.cloud.register.UserService;
import com.cloud.register.domain.User;
import com.cloud.register.repository.UserRepository;
import com.cloud.register.req.UserLogReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public SingleResponse<User> login(UserLogReq req) {
        User user = userRepository.selectByMobileAndName(req.getUser().getMobile(), req.getUser().getName());
        if (user == null) {
            return SingleResponse.buildFailure(CloudErrorEnum.LOGIN_NO_USER);
        }
        if (!user.getPassword().equals(req.getUser().getPassword())) {
            return SingleResponse.buildFailure(CloudErrorEnum.LOGIN_WRONG_PASSWORD);
        }
        StpUtil.login(user.getUserId(), req.getSourceFrom());
        SaSession session = StpUtil.getSessionByLoginId(user.getUserId());
        TokenSign tokenSign = session.getTokenSignList().stream().filter(s -> req.getSourceFrom().equals(s.getDevice())).findFirst().orElse(null);
        if (tokenSign != null) {
            user.setToken(tokenSign.getValue());
            return SingleResponse.of(user);
        }
        return SingleResponse.buildFailure(CloudErrorEnum.LOGIN_WRONG_PASSWORD);
    }

    @Override
    public SingleResponse register(UserLogReq req) {
        User user = req.getUser();
        Date birthday = DateUtil.fromStr2Date(user.getBirthday(), DateUtil.DATE_FORMAT);
        user.setAge(DateUtil.getAgeByBirth(birthday));
        user.setRole(req.getRole());
        return userRepository.save(user);
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

    @Override
    public SingleResponse<User> getUserInfo(String userId) {
        return null;
    }

    @Override
    public SingleResponse isLogin(String userId, String token) {
        return null;
    }
}
