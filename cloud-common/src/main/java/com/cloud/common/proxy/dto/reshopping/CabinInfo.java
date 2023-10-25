package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc: 舱位列表，包含多个报价源数据
 * @author: liwenjie
 * @date: 2019/04/28
 * @time: 20:02
 */
@Data
public class CabinInfo implements Serializable {

    private static final long serialVersionUID = 5866372817043228850L;
    /**
     * 报价源
     */
    private String source;
    /**
     * 航司二字码
     */
    private String airline;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 日期
     */
    private String flightDate;
    /**
     * 出发机场三字码
     */
    private String deptCode;
    /**
     * 到达机场三字码
     */
    private String destCode;
    /**
     * 大舱位代码
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
     * 成人机场建设费
     */
    private String airportTax;
    /**
     * 儿童机场建设费
     */
    private String childAirportTax;
    /**
     * 婴儿机场建设费
     */
    private String infantAirportTax;
    /**
     * 成人燃油税
     */
    private String fuelTax;
    /**
     * 儿童燃油税
     */
    private String childFuelTax;
    /**
     * 婴儿燃油税
     */
    private String infantFuelTax;
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
     * 舱位属性 如 兑换
     */
    private String cabinProperty;
    /**
     * 实际大仓位代码
     */
    private String midCabin;
    /**
     * 舱位权益
     */
    private Priority priority;
    /**
     * 退改签信息
     */
    private RefundChangeInfo refundChangeInfo;
    /**
     * 退改签短描述
     */
    private RefundChangeDescInfo refundChangeDescInfo;
    /**
     * 航班起飞时间
     */
    private String flightTime;
    /**
     * 舱位品牌 COMMON_Y
     */
    private String cabinProduct;

     /** 产品标签
     * @mock 优惠
     */
    private String productTag;

    /**
     * 产品icon
     */
    private String productIcon;

    /**
     * 限制条件
     */
    private String limit;

    /**
     * 改期差价
     */
    private String differentPrice;

    /**
     * 儿童改期差价
     */
    private String childDifferentPrice;

    /**
     * 婴儿改期差价
     */
    private String infantDifferentPrice;

    /**
     * 改期手续费
     */
    private String changeCommission;

    /**
     * 儿童改期手续费
     */
    private String changeChildCommission;

    /**
     * 婴儿改期手续费
     */
    private String changeInfantCommission;

    /**
     * 改期总价
     */
    private String totalCharge;

    /**
     * 儿童改期总价
     */
    private String childTotalCharge;

    /**
     * 婴儿改期差价
     */
    private String infantTotalCharge;
}
