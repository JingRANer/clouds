package com.cloud.common.proxy.dto.changeorder.request;

import com.umetrip.air.order.service.dto.changeorder.FlightInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 退改签规则和行李规定请求参数
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/6 10:45
 */
@Data
public class RuleAndPriorityReq implements Serializable {
    private static final long serialVersionUID = 7567529945004180756L;
    /**
     * 改期SessionId
     */
    private String sessionId;
    /**
     * 航班信息
     */
    private List<FlightInfo> flightInfoList;
}
