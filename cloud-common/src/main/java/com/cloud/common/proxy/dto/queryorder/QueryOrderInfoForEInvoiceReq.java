package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2023/10/10
 */
@Data
public class QueryOrderInfoForEInvoiceReq implements Serializable {

    private static final long serialVersionUID = 49586923987300122L;

    /**
     * 票号
     */
    private String ticketNo;

    /**
     * 航司订单号
     */
    private String airlineOrderNo;

    /**
     * 航旅订单号
     */
    private String orderNo;

    /**
     * 航旅大订单号
     */
    private String superOrderNo;

}
