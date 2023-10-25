package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class OrderStatusAndSeg implements Serializable {

    private static final long serialVersionUID = 1800882570346906231L;

    /**
     * 订单状态
     * @mock 待支付
     */
    private String orderStatus;

    /**
     * 航段列表
     */
    private List<TicketOrderListInfo> ticketOrderListInfos;
}

