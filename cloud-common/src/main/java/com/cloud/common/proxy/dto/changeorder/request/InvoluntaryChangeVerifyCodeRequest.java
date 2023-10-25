package com.cloud.common.proxy.dto.changeorder.request;

import lombok.Data;

@Data
public class InvoluntaryChangeVerifyCodeRequest {
    /**
     * sessionId
     * */
    private String sessionId;
    /**
     * 手机号
     * */
    private String mobile;

    private String imgVerificationCode;
}
