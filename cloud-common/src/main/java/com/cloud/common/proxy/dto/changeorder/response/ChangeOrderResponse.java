package com.cloud.common.proxy.dto.changeorder.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liwenjie
 * @ClassName ChangeOrderResponse.java
 * @Description 改期下单返回
 * @createTime 2022年04月09日 10:02:00
 */
@Data
public class ChangeOrderResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 改期下单的订单号
     */
    private String orderNo;
    /**
     * 改期订单状态
     */
    private String orderStatus;
    /**
     * 收银台需要的参数
     */
    private String bizContent;
    /**
     * 收银台需要的签名信息
     */
    private String signature;

    /**
     * 使用渠道
     */
    private String sourceFrom;


}
