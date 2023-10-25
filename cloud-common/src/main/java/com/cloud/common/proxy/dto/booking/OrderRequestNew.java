package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.order.PassengerBean;
import com.umetrip.air.order.service.dto.order.ServiceDetail;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

/**
 * @ClassName : OrderRequestNew
 * @Description : 创建订单新的请求参数
 * @Author : jzy
 * @Date: 2021-10-25 21:25
 */
@Data
public class OrderRequestNew {
    public OrderRequestNew() {
    }

    private static final long serialVersionUID = 1L;

    /**
     * 乘机人信息
     */
    @NonNull
    private List<PassengerBean> passengerBeanList;

    /**
     * 航段信息
     */
    @NonNull
    private List<ServiceDetail> serviceDetailList;

    /**
     * 联系人姓名
     */
    private String linkMan;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 订单金额
     */
    private Integer price;

    /**
     * 航司二字码
     */
    @NonNull private String airline;

    /**
     * 用户id
     */
    @NonNull private Long userId;

    /**
     * 联系人地址
     */
    private String address;

    /**
     * 兑换码
     */
    private String redemptionCode;

    /**
     * 兑换码名称
     */
    private String redemptionName;

    /**
     * 兑换码抵扣金额（单位-分）
     */
    private String discountPrice;

    /**
     * APP类型（AND,IOS）
     */
    private String appType;

    /**
     * APP版本（free,pro）
     */
    private String appVersion;

    /**
     * APP版本号
     */
    private String appVersionNumber;

    /**
     * 常旅客id
     */
    private String memberId;

    /**
     * 退改签规则
     */
    private String refundChangeRuler;
    /**
     * 其他补充信息，json存储
     */
    private String otherInfo;

    /**
     * 是否组合下单,1为拆单
     */
    private String isUnion;

    /**
     * 组合下单往返方向，0是去程，1是返程
     */
    private String unionDirection;

    /**
     * 中转下单
     * 1：去程为中转，2：返程为中转，3：往返都为中转
     */
    private String transfer;

    /**
     * source
     */
    private String source;

    /**
     * 是否使用会员价
     */
    private boolean useMemberPrice;

    /**
     * 行李信息
     * @return
     */
    private String baggageDetailInfo;

    /**
     * 退改签规则类型
     * 0：每条航段都有自己的退改规则（1对1）
     * 1：多条航段有同一条退改规则（1对n）
     */
    private int refundChangeRuleType;

    /**
     * 中转服务信息
     */
    private String transferServiceInfo;

    /**
     * 拆单时，去程订单或返程中的第几个订单
     * 空代表去程所有航段不拆单或返程所有航段不拆单
     */
    private Integer splitOrderIndex;


    /**
     * 成人人数
     */
    private int adultPsgNum;

    /**
     * 儿童人数
     */
    private int childPsgNum;

    /**
     * 婴儿人数
     */
    private int infantPsgNum;

    /**
     * 透传字段
     */
    private String context;

    /**
     * 产品说明字段
     */
    private String priorityString;

    /**
     * 组合订单信息
     */
    private ComboOrderInfo comboOrderInfo;
    /**
     * 使用渠道
     *
     * 用于区分app，微信小程序等来源，如果为空，默认是app
     * 值为“app”或“wx”
     */
    private String sourceFrom;
    /**
     * 订单的前项来源
     */
    private String orderSource;

    /**
     * 行李信息
     * @return
     */
    private String baggageDetailInfoCHD;

    /**
     * 退改签规则
     */
    private String refundChangeRulerCHD;

    /**
     * 行李信息
     * @return
     */
    private String baggageDetailInfoINF;

    /**
     * 退改签规则
     */
    private String refundChangeRulerINF;


    public OrderRequestNew(List<PassengerBean> passengerBean, List<ServiceDetail> serviceDetailList, String airline, Long userId) {
        this.passengerBeanList = passengerBean;
        this.serviceDetailList = serviceDetailList;
        this.airline = airline;
        this.userId = userId;
    }
}
