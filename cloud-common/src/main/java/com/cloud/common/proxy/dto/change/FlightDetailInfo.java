package com.cloud.common.proxy.dto.change;

import com.umetrip.air.order.service.dto.reshopping.Priority;
import com.umetrip.air.order.service.dto.reshopping.RefundChangeDescInfo;
import com.umetrip.air.order.service.dto.reshopping.RefundChangeInfo;
import com.umetrip.air.order.service.dto.reshopping.StopOverBean;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author cy
 */
@Data
public class FlightDetailInfo implements Serializable {
    /**
     * 航司
     */
    private String airline;
    /**
     * 销售渠道(e.g. CZ, MU, ASMS)
     */
    private String source;
    /**
     * 航空公司中文名
     */
    private String flightCompany;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 承运航班号
     */
    private String hostFlightNo;
    /**
     * 计划起飞当地日期
     */
    private String flightDate;
    /**
     * 计划到达当地日期
     */
    private String destDate;
    /**
     * 出发机场三字码
     */
    private String deptCode;
    /**
     * 到达机场三字码
     */
    private String destCode;
    /**
     * 出发机场名
     */
    private String deptAirportName;
    /**
     * 到达机场名
     */
    private String destAirportName;
    /**
     * 出发机场名
     */
    private String deptCityName;
    /**
     * 到达机场名
     */
    private String destCityName;
    /**
     * 计划起飞当地时间(yyyy-MM-dd HH:mm:ss)
     */
    private String deptTime;
    /**
     * 计划到达当地时间(yyyy-MM-dd HH:mm:ss)
     */
    private String destTime;
    /**
     * 出发机场航站楼
     */
    private String deptTerminal;
    /**
     * 到达机场航站楼
     */
    private String destTerminal;
    /**
     * 机型描述
     */
    private String planeTypeDesc;
    /**
     * 准点率
     */
    private String onTimeRate;
    /**
     * 餐食描述
     */
    private String mealDesc;
    /**
     * 舱位
     */
    private String cabin;
    /**
     * 舱位描述
     */
    private String cabinDesc;
    /**
     * 是否提供wifi
     */
    private boolean wifi;
    /**
     * 跨天，+1、+2...
     */
    private String spanDayNum;
    /**
     * 是否经停，true:经停，false:直达
     */
    private boolean hasStopOver;
    /**
     * 飞行时长
     */
    private String flyTime;
    /**
     * 经停机场
     */
    private List<StopOverBean> stopOverBeanList;
    /**
     * 经停次数,0:无经停，1：经停一个机场，2：经停二个机场，
     */
    private int stopOverNum;


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
     * 中转停留时长
     *
     * @mock 2h30min
     */
    private String transFerRemainTime;
    /**
     * 中转停留跨天天数（1代表跨一天）
     *
     * @mock 1
     */
    private String transferSpanDayNum;

    /**
     * 订单信息扩展字段 退改规则
     * (从MongoDB取出, Priority结构不适合存储, 因此使用独立String字段存储)
     */
    private String extendRefundChangeRuler;

    /**
     * 订单信息扩展字段 权益信息
     * (从MongoDB取出, Priority结构不适合存储, 因此使用独立String字段存储)
     */
    private String extendEquityInfo;

    /**
     * 订单信息扩展字段 其他信息
     * (从MongoDB取出, Priority结构不适合存储, 因此使用独立String字段存储)
     */
    private String extendOtherInfo;

    /**
     * 是否为返程
     */
    private Boolean isReturnTrip;

    public FlightDetailInfo(){

    }
}
