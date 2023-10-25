package com.cloud.common.proxy.dto.queryorder;

import com.umetrip.air.order.service.dto.order.OrderDetailInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2023/10/10
 */
@Data
public class QueryOrderInfoForEInvoiceResp implements Serializable {

    private static final long serialVersionUID = 9586923987300122L;

    /**
     * 航司订单号
     */
    private String airlineOrderNo;

    /**
     * 可开票的总金额
     */
    private String amount;

    /**
     * 可开票的订单信息
     */
    OrderDetailInfo orderDetailInfo;

    /**
     * 可开票的订单信息集合（一个大订单下，所有可以开具发票的订单信息，过滤过不可开发票的客票信息）
     */
    List<OrderDetailInfo> orderDetailInfoList;

    /**
     * 航旅订单号
     */
    private String orderNo;
}
