package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2021-06-03
 */
@Data
public class TicketPriceDetailReq implements Serializable {
    private static final long serialVersionUID = -3131165596581434905L;

    /**
     * sessionId
     */
    private String sessionId;


    /**
     * 用户选择的航班信息
     * 单段则flightInfo 为1
     * 往返、中转flightInfo > 1(往返中转对于order来说也是在同一个service下的)
     */
    List<FlightInfoVo> flightInfoList;

}
