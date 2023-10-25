package com.cloud.common.proxy.dto.invoice;

import lombok.Data;

/**
 * @author lde
 * @create 2023/10/12
 */
@Data
public class VerifySupportToEInvoiceReq {


    /**
     * 订单号
     */
    private String orderNo;


    /**
     * 航司订单号
     */
    private String airlineOrderNo;



}
