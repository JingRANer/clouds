package com.cloud.register;

import com.cloud.common.SingleResponse;
import com.cloud.register.domain.User;
import com.cloud.register.req.UserLogReq;

public interface UserService {


    /**
     * login
     */
    SingleResponse<User> login(UserLogReq req);


    /**
     * register
     */
    SingleResponse register(UserLogReq req);

    /**
     * edit
     */
    SingleResponse editUser(User user);

    /**
     * search
     */
    SingleResponse<User> findUser(String userId);


    /**
     * 获取全部用户信息 todo
     * @param userId
     * @return
     */
    SingleResponse<User> getUserInfo(String userId);
    SingleResponse isLogin(String userId, String token);

}
