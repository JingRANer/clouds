package com.cloud.common.proxy.dto.reshopping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @desc: 舱位信息数据
 * @author: liwenjie
 * @date: 2019/03/05
 * @time: 13:38
 */
@Getter
@Setter
@ToString
public class CabinInfoBean implements Serializable {
    private static final long serialVersionUID = -5745436810407923821L;
    /**
     * 查询大舱位代码
     */
    private String bigCabin;
    /**
     * 小舱位代码
     */
    private String cabin;
    /**
     * 舱位描述
     */
    private String cabinDesc;
    /**
     * 折扣
     */
    private String discount;
    /**
     * 成人机票价格
     */
    private String price;
    /**
     * 儿童价格
     */
    private String childPrice;
    /**
     * 婴儿价格
     */
    private String infantPrice;
    /**
     * 座位数
     */
    private String seats;
    /**
     * 是否支持儿童票售卖
     */
    private boolean supportChild;
    /**
     * 是否支持婴儿票售卖
     */
    private boolean supportInfant;
    /**
     * 退改签规则
     */
    private String remark;
    /**
     * 免费行李重量
     */
    private String freeBaggage;
    /**
     * 透传数据
     */
    private String context;
    /**
     * 是否可售
     */
    private boolean hasSell;
    /**
     * 常客价
     */
    private String memberPrice;
    /**
     * 舱位属性 如 特价 兑换
     */
    private String cabinProperty;
    /**
     * 实际大舱位代码
     */
    private String midCabin;
    /**
     * 舱位权益信息
     */
    private Priority cabinPriority;
    /**
     * 退改签价格
     */
    private RefundChangeInfo refundChangeInfo;
    /**
     * 舱位品牌 Y:COMMON_Y
     *
     * @return
     */
    private String cabinProduct;

    /**
     * 改期总费用
     */
    private String penalty;
    /**
     * 儿童改期总费用
     */
    private String childPenalty;
    /**
     * 婴儿改期总费用
     */
    private String infantPenalty;

    /**
     * 改期手续费
     */
    private String commission;
    private String childCommission;
    private String infantCommission;

    /**
     * 改期差价
     */
    private String differFee;
    private String childDifferFee;
    private String infantDifferFee;
}
