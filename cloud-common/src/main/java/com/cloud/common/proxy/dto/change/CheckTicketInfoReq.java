package com.cloud.common.proxy.dto.change;

import com.umetrip.air.order.service.dto.order.SegmentBriefInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2021-06-03
 */
@Data
public class CheckTicketInfoReq implements Serializable {

    private static final long serialVersionUID = 6981198355262460127L;

    /**
     * sessionId
     */
    private String sessionId;

    /**
     * 用户选择的航段信息
     */
    @Deprecated
    List<SegmentBriefInfo> segmentBriefInfoList;

    List<FlightInfoVo> flightInfoVoList;

}
