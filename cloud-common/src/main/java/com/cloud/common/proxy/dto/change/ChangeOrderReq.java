package com.cloud.common.proxy.dto.change;

import lombok.Data;

/**
 * @author zcy
 * @Date 2022-01-08
 */
@Data
public class ChangeOrderReq {
    /**
     * sessionId
     */
    private String sessionId;

    /**
     * 联系人信息
     */
    private ContactInfo contactInfo;
}
