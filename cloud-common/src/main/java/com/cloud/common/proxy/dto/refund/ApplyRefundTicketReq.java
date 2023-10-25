package com.cloud.common.proxy.dto.refund;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/10/25
 */
@Data
public class ApplyRefundTicketReq {


    /**
     * token
     */
    private String token;

    /**
     * 退票类型
     * 0：自愿退票 1：非自愿退票
     */
    private Integer refundType;

    /**
     * 退票原因
     */
    private String refundReason;

    /**
     * 病退退票原因文件Key
     */
    private List<String> irrFileKeys;

    /**
     * 使用渠道
     */
    private String sourceFrom;
}
