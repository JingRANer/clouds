package com.cloud.register.req;

import com.cloud.register.domain.User;
import lombok.Data;

/**
 * @author JingRAN
 */
@Data
public class UserLogReq {
    private User user;

    private String role;
}
