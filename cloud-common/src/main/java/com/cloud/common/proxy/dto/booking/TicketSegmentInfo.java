package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class TicketSegmentInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 航段信息 自增数字
     */
    private Long id;

    /**
     * 订单id 随机字符串
     */
    private String orderId;

    /**
     * 航旅纵横用户id
     */
    private Long userId;
    /**
     * 乘客id
     */
    private String passengerId;

    /**
     * 航司
     */
    private String airline;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 承运航班号
     */
    private String hostFlightNo;
    /**
     *出发地三字码
     */
    private String deptCode;
    /**
     * 目的地三字码
     */
    private String destCode;
    /**
     *出发日期
     */
    private String deptDate;
    /**
     *出发时间
     */
    private String deptTime;
    /**
     * 到达日期
     */
    private String  destDate;
    /**
     * 到达时间
     */
    private String destTime;
    /**
     * 折扣
     */
    private String discount;
    /**
     * 舱位代码
     */
    private String cabin;
    /**
     * 舱位等级
     */
    private String  classType;
    /**
     * 价格（分，其他同）
     */
    private Integer price;
    /**
     * 燃油税（分，其他同）
     */
    private Integer fuelTax;
    /**
     *儿童燃油税
     */
    private Integer fuelTaxCHD;
    /**
     *机建税
     */
    private Integer airportTax;
    /**
     *儿童机建税
     */
    private Integer airportTaxCHD;
    /**
     * 备注项
     */
    private String remark;

    /**
     * 是否有餐食
     */
    private String mealDesc;

    /**
     * 准点率
     */
    private String rate;

    /**
     * 机型
     */
    private String aircraftType;

    /**
     * 航段号
     */
    private int segment;

    /**
     * 往返 0 代表 dept，1 代表return
     */
    private int roundTrip;

    /**
     *  出发城市名字
     */
    private String deptCityName;

    /**
     * 到达城市名字
     */
    private String destCityName;

    /**
     * 出发机场名字
     */
    private String deptAirportName;

    /**
     * 到达机场名字
     */
    private String destAirportName;

    /**
     * 出发地航站楼
     */
    private String deptTerminal;

    /**
     * 到达地航站楼
     */
    private String destTerminal;

    /**
     * 客票号
     */
    private String tktNo;

    /**
     * 航段号
     */
    private String coupon;

    /**
     * pnr
     */
    private String pnr;

    /**
     * 客票状态
     */
    private String tktStatus;

    /**
     * 证件号
     */
    private String certNo;

    /**
     * 航司退款id
     */
    private String airlineRefundId;

    /**
     * 长龙航空退票ID
     */
    private String ticketId;

    /**
     * 优惠多少价格
     */
    private Integer discountPrice;

    /**
     * 会员价
     */
    private Integer memberPrice;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 航段id(与coupon相同)
     */
    private String segmentId;

    /**
     * 航班日期
     * @mock 8月25日 星期日
     */
    private String flightDate;

    /**
     * 乘客信息列表
     */
    private List<PassengerInfo> passengerInfoList;

    /**
     * 优惠码
     */
    private String couponCode;

    /**
     * 优惠码状态,0=已取券,1=已退库
     */
    private String couponStatus;

    /**
     * 单段订单号
     */
    private String orderItemId;

    /**
     * 大编号，ibe+用到
     */
    private String bigPnr;

    /**
     * 经停城市
     */
    private String stopOverCity;

    /**
     * 经停机场code
     */
    private String stopOverAirportCode;

    /**
     * 停留时间
     */
    private String stopOverTime;

    /**
     * 多段经停信息(数据库长度255)
     */
    private String stopOverContext;

    /**
     * source渠道号
     * 航司渠道是航司二字码、美程渠道asms
     */
    private String source;

    /**
     * 舱位折扣(美程)
     */
    private String cabinDiscount;

    /**
     * ----------------------------------------订单改版-------------------------------------------
     */
    private String serviceStatus;

    /**
     * 服务类型
     */
    private String serviceType;

    /**
     * 跨天加1
     */
    private String spanDayNum;

    /**
     * 航司图标路径
     */
    private String airlineIcon;


    /**
     * 飞行时间
     */
    private String flyTime;

    /**
     * 舱位折扣描述
     */
    private String cabinDisDesc;


    /**
     * 经停信息
     */
    private String stopOverDesc;

    /**
     * 改期手续费
     */
    private Long reissueFee;

    /**
     * 原航段ID
     */
    private Long oriSegmentId;

    /**
     * 是否为改期后航段
     */
    private String isNew;


}
