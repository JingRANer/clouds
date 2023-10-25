package com.cloud.common.proxy.dto.refundInvoice;

import lombok.Data;

import java.util.List;

/**
 * @ClassName : SubRefundInvoiceReq
 * @Description :
 * @Author : jzy
 * @Date: 2021-09-02 16:36
 */
@Data
public class SubRefundInvoiceReq {
    /**
     * 提交航段id
     */
    private List<String> segmentIdList;

    /**
     * 发票信息
     */
    private UmetripOrderRefundinvoiceInfo umetripOrderRefundinvoiceInfo;
}
