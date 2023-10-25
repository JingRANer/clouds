package com.cloud.common.proxy.dto.changeorder.response;

import lombok.Data;

import java.util.List;

@Data
public class InvoluntaryChangeImgCodeResp {

    private List<String> imgList;

    private String verifyTicket;

    private String captchaDesc;
}
