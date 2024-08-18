package com.cloud.register.req;

import com.cloud.register.domain.User;
import lombok.Data;

/**
 * @author JingRAN
 */
@Data
public class UserLogReq {
    String username;
    String password;
    String remember;

    private User user;

    private String role;

    private String sourceFrom;
}
