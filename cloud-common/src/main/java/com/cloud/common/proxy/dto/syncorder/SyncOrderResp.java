package com.cloud.common.proxy.dto.syncorder;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SyncOrderResp {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 航司订单号
     */
    private String airlineSubOrderNo;
    /**
     * order状态
     */
    private String orderStatus;
    /**
     * service
     */
    private List<ServiceToSync> serviceList;
    /**
     * channelOrder
     */
    private List<ChannelOrderToSync> channelOrderList;

}
