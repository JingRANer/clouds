package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @desc: 机票搜索列表组合数据，包含中转情况。返回给中台数据
 * @author: liwenjie
 * @date: 2019/05/06
 * @time: 17:24
 */
@Data
public class MultiSearchTicketInfo implements Serializable {
    private static final long serialVersionUID = 2808223120953803529L;
    private String source;
    /**
     * true:国内,false:国际
     */
    private boolean civil = true;
    /**
     * 中转中的第一个出发地
     */
    private String deptCode;
    /**
     * 中转中的最后一个目的地
     */
    private String destCode;
    /**
     * 大舱 F-头等/商务。 Y-各种经济舱
     */
    private String bigCabin;
    private String flightDate;
    private String flightNo;
    private String deptAirportName;
    private String destAirportName;
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    private String deptTime;
    private String destTime;
    private String deptTerminal;
    private String destTerminal;
    /**
     * 多段中的成人总价 -- 不含税
     */
    private String price;
    /**
     * 多段中的婴儿总价 -- 不含税
     */
    private String childPrice;
    /**
     * 多段中的儿童总价 -- 不含税
     */
    private String infantPrice;
    /**
     * 多段中的成人总价 -- 含税
     */
    private String totalPrice;
    /**
     * 多段中的婴儿总价 -- 含税
     */
    private String childTotalPrice;
    /**
     * 多段中的儿童总价 -- 含税
     */
    private String infantTotalPrice;

    /**
     * 座位
     */
    private String seats;
    private String airportTax;
    private String childAirportTax;
    private String infantAirportTax;
    private String fuelTax;
    private String childFuelTax;
    private String infantFuelTax;
    private boolean hasSell;
    /**
     * //存放航班号（中转则多个）
     */
    private List<String> flightNoList;
    /**
     * 航班列表集合
     */
    List<SearchTicketCacheBean> searchTicketCacheBeanList;
    /**
     * 多段中的常客总价 -- 不含税
     */
    private String memberPrice;
    /**
     * 多段中的成人总价 -- 含税
     */
    private String memberTotalPrice;
    /**
     * 优惠券价格信息
     */
    private String preferentialPrice;

    /**
     * 改期手续费
     */
    private String commission;

    /**
     * 儿童改期手续费
     */
    private String childCommission;

    /**
     * 婴儿改期手续费
     */
    private String infantCommission;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MultiSearchTicketInfo that = (MultiSearchTicketInfo) o;
        return Objects.equals(flightNoList, that.flightNoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNoList);
    }

}
