package com.cloud.common.proxy.dto.syncorder;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChannelOrderToSync implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 渠道订单号
     */
    private String channelOrderNo;
    /**
     * 渠道订单状态
     */
    private String channelOrderStatus;
}
