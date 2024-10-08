package com.cloud.register.repository;

import com.cloud.common.SingleResponse;
import com.cloud.register.domain.User;

public interface UserRepository {

    User selectByMobile(String mobile);
    User selectByMobileAndName(String mobile, String userName);

    User selectByUserId(String userId);
    SingleResponse update(User user);

    SingleResponse save(User user);
}
