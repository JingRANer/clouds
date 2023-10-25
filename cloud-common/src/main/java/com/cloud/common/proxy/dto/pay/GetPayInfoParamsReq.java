package com.cloud.common.proxy.dto.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Gavin on 2019/4/17.
 * @author lyxbai
 */
@Data
public class GetPayInfoParamsReq implements Serializable {

    private static final long serialVersionUID = 7559450756055646546L;

    /**
     * 支付id(通用支付分配)
     */
    private String accountId;

    /**
     * 航旅订单号
     */
    private String orderId;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 支付方式： 支付宝301；微信 302
     */
    private String pluginId;

    /**
     * 用户APP的ip
     */
    private String userAppIp;

    /**
     * 用户的appId
     */
    private String userAppId;
}
