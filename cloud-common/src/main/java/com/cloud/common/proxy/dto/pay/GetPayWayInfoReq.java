package com.cloud.common.proxy.dto.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class GetPayWayInfoReq implements Serializable {

    private static final long serialVersionUID = -3036526424238011546L;

    /***
     * 航司二字码
     */
    private String airline;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 航司订单号
     */
    private String airlineOrderNo;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 总金额（元）
     */
    private String totalFee;

    /**
     * 	订单创建时间（yyyyMMddHHmmss）
     */
    private String timeStart;

    /**
     * 订单失效时间（yyyyMMddHHmmss）
     */
    private String timeExpire;

    /**
     * 全部金额（分账的时候 totalFee+子单totalFee，无需分账的时候totalFee）
     */
    private String allFee;

    /**
     * APP类型（AND,IOS）
     */
    private String appType;

    /**
     * APP版本（free,pro）
     */
    private String appVersion;

    /**
     * 接收支付平台支付结果通知的地址
     */
    private String notifyUrl;

    /**
     * 渠道
     * 航司或其他渠道
     * 如航司是航司二字码表示，其他比如美程则用asms表示
     */
    private String source;
}
