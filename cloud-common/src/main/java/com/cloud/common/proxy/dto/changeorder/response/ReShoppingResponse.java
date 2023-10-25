package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.JourneyInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ReShoppingResponse implements Serializable {

    private static final long serialVersionUID = -5895146937232550252L;

    /**
     * 航班列表
     */
    private List<JourneyInfo> journeyInfoList;

    /**
     * 缓存时的key
     */
    private String sessionId;

    /**
     * 渠道
     */
    private String source;

    /**
     * 是否航班保护
     */
    private boolean flightProtection;

    /**
     * 航班保护校验页的返回
     */
    private CheckChangeDetailResponse checkChangeDetailResponse;


    /**
     * 是否是改期订单
     */
    private boolean isSpiderChange;

}
