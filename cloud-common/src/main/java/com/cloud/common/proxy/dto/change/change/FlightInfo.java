package com.cloud.common.proxy.dto.change.change;
import lombok.Data;

import java.io.Serializable;

@Data
public class FlightInfo implements Serializable {

    private static final long serialVersionUID = -3951284260150081571L;
    /**
     * 航司中文名
     */
    private String airlineName;
    /**
     * flightNo: 航班号
     */
    private String flightNo = "";

    /**
     * 市场航班号
     */
    private String hostFlightNo="";
    /**
     * tktNo: 客票号
     */
    private String tktNo = "";

    /**
     * coupon: coupon号
     */
    private int coupon = 1;

    /**
     * pnr: pnr 号
     */
    private String pnr = "";

    /**
     * airline: 航司二字码
     */
    private String airline = "";

    /**
     * deptCode: 出发地三字码
     */
    private String deptCode = "";

    /**
     * deptChn: 出发地中文名
     */
    private String deptChn = "";

    /**
     * destCode: 目的地三字码
     */
    private String destCode = "";

    /**
     * destChn: 目的地中文名
     */
    private String destChn = "";

    /**
     * cabin: 舱位
     */
    private String cabin = "";

    /**
     * status: 舱位等级
     */
    private String cabinStatus = "";
    /**
     * cabinName : 舱位中文名  todo praxy修改
     */
    private String cabinName="经济舱";

    /**
     * flightDate: 航班日期
     */
    private String flightDate = "";

    /**
     * arrFlightDate: 到达航班日期
     */
    private String arrFlightDate = "";

    /**
     * std: 计划起飞时间
     */
    private String std = "";

    /**
     * sta: 计划到达时间
     */
    private String sta = "";

    /**
     * std: 计划起飞时间
     */
    private String stdTime = "";

    /**
     * sta: 计划到达时间
     */
    private String staTime = "";

    /**
     * newStopNumber: 经停数量
     */
    private int newStopNumber;

    /**
     * planeType: 飞机型号
     */
    private String planeType = "";

    /**
     * taxCN: 基建费
     */
    private Double taxCN = 0.0;

    /**
     * taxYQ: 燃油费
     */
    private Double taxYQ = 0.0;

    /**
     * fare: 票面价
     */
    private Double fare = 0.0;
    /**
     * @Fields punctual : 准点率，格式为“88.5”
     */
    private String punctual = "";

    /**
     * 以下是改期到的航班的费率信息
     */
    /**
     * penalty: 该次改期的费用
     */
    private Double penalty = 0.0;

    /**
     * penalty: 该次改期用户实际支付的金额
     */
    private Double realityAmount = 0.0;

    /**
     * differFare: 差价
     */
    private Double differFare = 0.0;

    /**
     * reissueFee: 手续费
     */
    private Double reissueFee = 0.0;

    /**
     * irrtag: 非正常航班标签
     */
    private String irrtag = "";
    /**
     * 航班状态
     */
    private String flightStatus = "";

    /**
     *操作码
     */
    private String actionCode = "";

    /**
     * 航站楼
     * @return
     */
    private String deptTerminal;

    /**
     * 到达地航站楼
     * @return
     */
    private String destTerminal;

    /**
     * 客票状态
     *
     * @return
     */
    private String tktStatus;

    /**
     * 价钱是否一定（是否需要查repricing接口）  0:确定   1:不确定
     */
    private String isMoneyConfirm;

    /**
     * 承运航司中文名
     *
     * @return
     */
    private String hostAirlineName;

    /**
     * 承运航司图标
     *
     * @return
     */
    private String hostAirlineUrl;

    /**
     * 经停时间
     *
     * @return
     */
    private String stopTime;

    /**
     * 经过城市
     *
     * @return
     */
    private String stopCity;

    /**
     * 经停城市三字码
     *
     * @return
     */
    private String stopCityCode;

    private String orderItem;

    private String preSegmentId;

    /**
     * 中转城市三字码
     */
    private String transferCode;

    /**
     * 中转城市名
     */
    private String transferCityName;

    /**
     * A-B-C
     * 时间间隔 在中转的情况下指A-C的时间间隔
     *
     */
    private String intervalTime;

    /**
     * 中转地航站楼
     */
    private String transferTerminal;

    /**
     * 中转地机场名
     */
    private String transferAirport;

    /**
     * 中转第一程到达日期
     */
    private String transferDestDate;

    /**
     * 中转第一程到达时间
     */
    private String transferDestTime;

    /**
     * 中转第二程出发日期
     */
    private String transferDeptDate;

    /**
     * 中转第二程出发时间
     */
    private String transferDeptTime;

    /**
     * 中转第二程航班号
     */
    private String transferFlightNo;

    private String deptAirportName;
    private String destAirportName;



    public FlightInfo(RQ_Segment seg) {
        this.airline = seg.getAirline();
        this.setDeptCode(seg.getDepAircode());
        this.setDestCode(seg.getArrAircode());
        this.flightDate = seg.getDepDate();
        this.arrFlightDate = seg.getArrDate();
        this.flightNo = seg.getFlightNumber();
        if (this.flightNo.length() == 4 && !this.flightNo.contains(airline)) {
            this.flightNo = this.airline + this.flightNo;
        }
        this.newStopNumber = seg.getNumberOfStops();
        this.deptTerminal= seg.getDepTerminal();
        this.destTerminal = seg.getArrTerminal();

        this.planeType = seg.getEquipment();
        this.hostFlightNo = seg.getOperatingFlightNumber();
        this.setStd(seg.getDepTime());
        this.setSta(seg.getArrTime());
        //修改如果日期选择不为当天，存入cache的信息错误导致的改期错误的BUG
        this.setStaTime(seg.getArrDate() + " " + seg.getArrTime() + ":00");
        this.setStdTime(seg.getDepDate() + " " + seg.getDepTime() + ":00");
       /* if (ToolUtil.getApolloInfoByChangeConfig("isAirlineMoneyConfirm","","").contains(airline)) {
            this.isMoneyConfirm = "0";
        } else {
            this.isMoneyConfirm = "1";
        }*/


    }
    public FlightInfo(){}


}
