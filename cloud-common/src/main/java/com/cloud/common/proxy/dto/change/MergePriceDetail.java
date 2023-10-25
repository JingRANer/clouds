package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.util.List;

@Data
public class MergePriceDetail {

    /**
     * 超级经济舱融合列表7.0新增
     */
    private List<PriceDetail> mergeList;
    /**
     * 经济舱经济舱融合列表标签
     */
    private CabinLabel label;
}
