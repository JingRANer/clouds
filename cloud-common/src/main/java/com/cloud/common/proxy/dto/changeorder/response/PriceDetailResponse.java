package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.JourneySegment;
import com.umetrip.air.order.service.dto.changeorder.Offer;
import com.umetrip.air.order.service.dto.changeorder.Priority;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class PriceDetailResponse implements Serializable {
    private static final long serialVersionUID = -1906693326177443092L;

    /**
     * 缓存id
     */
    private String sessionId;

    /**
     * 行程航段列表
     */
    private List<JourneySegment> journeySegmentList;

    /**
     * 报价集合列表
     */
    private List<Offer> offerList;

    /**
     * 行程类型
     */
    private String journeyType;

    /**
     * 中转须知
     */
    private List<Priority> transferPriority;

    /**
     * 虚拟航班号
     */
    private String virFlightNo;

    /**
     * 渠道
     */
    private String source;

    /**
     * 提示错误码
     */
    private long errCode;

    /**
     * 错误提示描述
     */
    private String tipDesc;

    /**
     * 联系电话号
     */
    private String phoneNo;

    /**
     * 是否需要拨打电话
     */
    private boolean usePhoneNo;


    /**
     * 是否是非自愿爬虫改期
     */
    private boolean spiderChange;
}
