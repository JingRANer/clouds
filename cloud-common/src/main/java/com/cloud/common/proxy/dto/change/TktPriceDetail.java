package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.util.List;

@Data
public class TktPriceDetail {

    /**
     * 经济舱列表
     */
    private List<PriceDetail> economyClassList;

    /**
     * 超级经济舱列表
     */
    private List<PriceDetail> superEconomyClassList;

    /**
     * 公务舱列表
     */
    private List<PriceDetail> businessClassList;

    /**
     * 头等舱列表
     */
    private List<PriceDetail> firstClassList;

    /**
     * 经济舱融合列表 7.0新增
     */
    private List<PriceDetail> yMergeList;

    /**
     * 公务舱融合列表（公务舱和头等舱融合）7.0新增
     */
    private List<PriceDetail> fMergeList;

    /**
     * 经济舱经济舱融合列表标签  7.0新增
     */
    private CabinLabel yLabel;

    /**
     * 公务舱经济舱融合列表标签 7.0新增
     */
    private CabinLabel fLabel;

    /**
     * 展示默认标签（false-经济舱，true-公务舱）7.0新增
     */
    private Boolean labelFlag = false;

    /**
     * 超级经济舱融合列表7.0新增
     */
    private List<PriceDetail> wMergeList;

    /**
     * 经济舱经济舱融合列表标签  7.0新增
     */
    private CabinLabel wLabel;

    private List<MergePriceDetail> mergePriceDetailList;


}
