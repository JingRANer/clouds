package com.cloud.common.proxy.dto.changeorder.request;

import lombok.Data;

@Data
public class InvoluntaryChangeImgCodeReq {

    private String sessionId;

    private int changeType;

    private String needVerifyTicket;

    private String phoneCode;
}
