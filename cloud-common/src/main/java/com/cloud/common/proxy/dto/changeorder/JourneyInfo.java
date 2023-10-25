package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class JourneyInfo implements Serializable {

    private static final long serialVersionUID = -5173537397205061244L;

    public JourneyInfo() {
    }

    /**
     * 行程航段列表
     */
    private List<JourneySegment> segmentList;

    /**
     * 航班最低价
     */
    private List<ReShoppingPrice> floorPriceList;

    /**
     * 行程类型，OW 单程 RT 往返 MT 联程
     */
    private String journeyType;

    /**
     * 中转须知
     */
    private List<Priority> transferPriority;

    /**
     * 航班剩余座位数
     * 航司有则返回，否则无
     * 此处的avCount是该航班所有座位数相加
     */
    private String avCount;

}
