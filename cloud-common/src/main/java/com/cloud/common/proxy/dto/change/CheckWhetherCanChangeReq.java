package com.cloud.common.proxy.dto.change;

import com.umetrip.air.order.service.dto.order.PassengerBriefInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2021-10-27
 */
@Data
public class CheckWhetherCanChangeReq implements Serializable {

    private static final long serialVersionUID = -3681852337894084657L;

    /**
     * 选择的乘机人信息
     */
    private List<PassengerBriefInfo> passengerList;

    /**
     * 订单号
     */
    private String orderNo;

}
