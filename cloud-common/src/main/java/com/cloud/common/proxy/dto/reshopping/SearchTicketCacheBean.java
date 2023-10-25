package com.cloud.common.proxy.dto.reshopping;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @desc: 机票搜索缓存bean
 * @author: liwenjie
 * @date: 2019/03/05
 * @time: 13:12
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"flightNo", "flightDate", "deptCode", "destCode"})
public class SearchTicketCacheBean implements Serializable {
    private static final long serialVersionUID = 518700204490628469L;
    /**
     * 航司
     */private String airline;
    /**
     * 航空公司中文名
     */private String flightCompany;
    /**
     * 航班号
     */private String flightNo;
    /**
     * 承运航班号
     */private String hostFlightNo;
    /**
     * 计划起飞当地日期
     */private String flightDate;
    /**
     * 计划到达当地日期
     */private String destDate;
    /**
     * 出发机场三字码
     */private String deptCode;
    /**
     * 到达机场三字码
     */private String destCode;
    /**
     * 出发机场名
     */private String deptAirportName;
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
     * 计划起飞当地时间(yyyy-MM-dd HH:mm:
     */
    private String deptTime;
    /**
     * 计划到达当地时间(yyyy-MM-dd HH:mm:
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
     * 透传数据
     */
    private String context;
    /**
     * 注册号
     */
    private String regNo;
    /**
     * 是否可售
     */
    private boolean hasSell;
    /**
     * 座位数
     */
    private Map<String, String> seatMap;
    /**
     * 中转的后续航班键
     */
    private Set<String> next;
    /**
     * 舱位信息列表
     */
    private List<CabinInfoBean> cabinInfoBeanList;
    /**
     * 飞行距离 km
     */
    private String flyDistance;
    /**
     * 出发机场摆渡车率（100-摆渡车率=靠廊桥率）
     */
    private String depBusRate;
    /**
     * 到达机场摆渡车率（100-摆渡车率=靠廊桥率）
     */
    private String desBusRate;
    /**
     * 平均延误 min 负数表示提前
     */
    private String delayTime;

    /**
     * 机龄
     */
    private String flightAge;
    /**
     * 出发机场 摆渡车/靠廊桥
     */
    private String depLandWays;
    /**
     * 到达机场 摆渡车/靠廊桥
     */
    private String desLandWays;
    /**
     * wifi类型描述
     */
    private String wifiType;

    /**
     * 渠道
     */
    private String source;

}
