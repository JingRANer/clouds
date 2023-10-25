package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.refund.NeedRefundSegmentInfo;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class TicketInfo {
    private Long id;

    /**
     * 旅客id
     */
    private String passengerId;

    /**
     * 旅客姓名，加密
     */
    private String name;

    private String userId;

    /**
     * 性别，F女，M男
     */
    private String gender;

    /**
     * 乘客类型A成人C儿童I婴儿
     */
    private String type;

    /**
     * 证件类型，0身份证2护照3其他5户口本7台胞证8回乡证9港澳台身份证
     */
    private Integer certType;

    /**
     * 证件号，加密
     */
    private String certNo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期，yyyy-MM-dd
     */
    private String birthday;

    /**
     * 手机号，加密
     */
    private String mobile;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 航旅大订单号
     */
    private String superOrderNo;

    //------------------------以下航段信息--------------------------------------

    /**
     * 航段ID
     */
    private String segmentId;

    /**
     * 市场航司
     */
    private String marketAirline;

    /**
     * 承运航司
     */
    private String hostAirline;

    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 承运航班号
     */
    private String hostFlightNo;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 出发机场中文名
     */
    private String deptAirportName;

    /**
     * 到达机场三字码
     */
    private String destCode;

    /**
     * 到达机场中文名
     */
    private String destAirportName;

    /**
     * 出发日期
     */
    private String deptDate;

    /**
     * 出发时间
     */
    private String deptTime;

    /**
     * '舱位代码'
     */
    private String cabin;
    /**
     * 舱位描述
     */
    private String cabinDesc;

    /**
     * 舱位等级描述
     */
    private String classType;
    /**
     * 往返程标识 0标识去程 1标识返程
     */
    private String roundTrip;
    /**
     * '出发地航站楼'
     */
    private String deptTerminal;
    /**
     * '到达地航站楼'
     */
    private String destTerminal;

    /**
     * '餐食描述'
     */
    private String mealDesc;

    /**
     * 票号
     */
    private String tktNo;

    /**
     * 往返程段数
     */
    private String coupon;

    /**
     * 客票状态OPEN FOR USE,REFUNDED,EXCHANGED,USED/FLOWN
     */
    private String tktStatus;

    /**
     * 经停城市名称
     */
    private String stopOverCityName;

    /**
     * 经停地三字码
     */
    private String stopOverCode;

    /**
     * 停留时间
     */
    private String stopOverTime;

    /**
     * 多段经停信息
     */
    private String stopOverContext;

    /**
     * 航段序列号1 2 区分航段先后顺序
     */
    private String serialNumber;

    /**
     * 服务id
     */
    private String serviceId;

    /**
     * 是否支持多段退
     */
    private Boolean multiSegmentRefund;

    /**
     * 是否支持多段改
     */
    private Boolean multiSegmentChange;

    /**
     * 是否支持改期
     */
    protected Boolean supportChangeOrder;

    /**
     * 是否支持改后改 MU ASMS
     */
    protected Boolean supportSecondChange;

    /**
     * 是否支持中转改期
     */
    protected Boolean supportTransferChange;

    /**
     * 能否选择退改
     */
    private Boolean supportRefundChange;

    /**
     * 乘机人类型
     * A：成人 C：儿童
     */
    private String passengerType;

    /**
     * 用户选择的航段信息
     */
    private NeedRefundSegmentInfo segmentInfoList;

    /**
     * 标签
     */
    private String label;

    /**
     * 标签
     */
    private String SegmentNum;

    /**
     * 出发地城市名
     */
    private String deptCityName;

    /**
     * 目的地城市名
     */
    private String destCityName;

    /**
     * 销售渠道
     */
    private String source;

    /**
     * 是否支持非自愿改后改
     */
    private Boolean supportInvoSecondChange;

    /**
     * 是否已取消座位 0未取消 1已取消
     */
    private int opened;
}