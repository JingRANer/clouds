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

}
