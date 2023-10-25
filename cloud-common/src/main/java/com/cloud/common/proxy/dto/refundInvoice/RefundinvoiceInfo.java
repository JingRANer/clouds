package com.cloud.common.proxy.dto.refundInvoice;

import lombok.Data;

import java.util.List;

@Data
public class RefundinvoiceInfo {

    private UmetripOrderRefundinvoiceInfo umetripOrderRefundinvoiceInfo;
    /**
     * 乘机人集合
     */
    private List<String> passengers;



}