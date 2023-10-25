package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @desc: 舱位组合
 * @author: liwenjie
 * @date: 2019/05/15
 * @time: 15:15
 */
@Data
public class TicketCabinInfo implements Serializable {
    private static final long serialVersionUID = 8985540781045328858L;
    /**
     * 报价源，目前仅支持同航司匹配
     */
    private String source;
    /**
     * 航司二字码
     */
    private String airline;
    /**
     * 成人机票价格（多段为总价）
     */
    private String price;
    /**
     * 儿童价格（多段为总价）
     */
    private String childPrice;
    /**
     * 婴儿价格（多段为总价）
     */
    private String infantPrice;
    /**
     * 成人机场建设费（多段为总价）
     */
    private String airportTax;
    /**
     * 儿童机场建设费（多段为总价）
     */
    private String childAirportTax;
    /**
     * 婴儿机场建设费（多段为总价）
     */
    private String infantAirportTax;
    /**
     * 成人燃油税（多段为总价）
     */
    private String fuelTax;
    /**
     * 儿童燃油税（多段为总价）
     */
    private String childFuelTax;
    /**
     * 婴儿燃油税（多段为总价）
     */
    private String infantFuelTax;
    /**
     * 座位数（多段取最小的座位数）
     */
    private String seats;
    /**
     * 中转存放多张票
     */
    List<CabinInfo> cabinInfoList;
    /**
     * 常客价 （多段为总价 用于校验）
     */
    private String memberPrice;
    /**
     * 实际常客价 (多段为总价 包含单段常客价情况)
     */
    private String mixMemberPrice;
    /**
     * 优惠价
     */
    private String preferentialPrice;
    /**
     * 是否为同品牌最低价
     */
    private boolean cheapestProduct;

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
