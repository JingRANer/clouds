package com.cloud.common.proxy.dto.changeorder.request;

import com.umetrip.air.order.service.dto.changeorder.ChangePassenger;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ChangeCheckRequest implements Serializable {

    private static final long serialVersionUID = 2316178135808834364L;
    /**
     * 订单号(选择的要进行改期的订单)
     * @mock 1203478501939948500001
     */
    private String orderNo;

    /**
     * 用户选择的要改期 的乘机人及航段信息
     */
    private List<ChangePassenger> changePassengers;

}
