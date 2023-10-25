package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author dcy
 * @ClassName ConfirmAddOrder.java
 * @Description TODO
 * @createTime 2022年06月07日 18:55
 */
@Data
public class ConfirmAddOrder implements Serializable {

    private static final long serialVersionUID = -6633340513971246391L;

    /**
     * 附属商户订单
     */
    private String addOrderNo;
    /**
     * 订单确认结果
     * 0失败，1成功，2确认中。失败，附属商户自行处理
     */
    private String status;
    /**
     * 订单信息
     */
    private List<ConfirmAddOrderInfo> confirmAddOrderInfoList;


}
