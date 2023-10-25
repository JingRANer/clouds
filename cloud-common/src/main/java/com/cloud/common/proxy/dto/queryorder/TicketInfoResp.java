package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2022/3/24
 */
@Data
public class TicketInfoResp {

    /**
     * 支持多人退票
     */
    private Boolean refundMultiPassenger;

    /**
     * 未使用航段必须全退
     */
    private Boolean refundAllUnUsedSegment;

    /**
     * 支持改期
     */
    private Boolean changeOrder;

    /**
     * 支持多人改期
     */
    private Boolean changeMultiPassenger;

    /**
     * 未使用航段必须全退
     */
    private Boolean changeAllUnUsedSegment;

    /**
     * 支持再次改期
     */
    private Boolean secondChange;

    /**
     * 支持非自愿改期后再次改期
     */
    private Boolean invoSecondChange;

    /**
     * 仅支持单段改期
     */
    private Boolean mustChangeSingleSegment;

    /**
     * 往返或中转是否拆开展示
     */
    private Boolean splitOrder;

    /**
     * 是否必须单选（改期）
     */
    private Boolean changeSingleSegment;

    /**
     * 是否支持使用过一程后继续改期
     */
    private Boolean changeAfterUsed;

    /**
     * 运价类别  OW：单程 RT：往返
     */
    private String priceType;

    /**
     * 客票信息列表
     */
    private List<TicketInfo> ticketListInfo;

    /**
     * 渠道
     */
    private String source;

    /**
     * 改期标记
     */
    private String orderType;

    /**
     * 是否使用券兑换机票
     */
    private boolean usedCoupon;

    /**
     * 是否是老订单，为了GX切换新接口加
     */
    private Boolean formerOrder;
    /**
     * 渠道支持的成人带儿童比例
     */
    private Integer adultChildScaleValue;




}
