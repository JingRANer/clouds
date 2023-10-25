package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.order.PassengerBean;
import com.umetrip.air.order.service.dto.order.SegmentBean;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class OrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    public OrderRequest(){

    }

    /**
     * 乘机人信息
     */
    @NonNull private List<PassengerBean> passengerBean;

    /**
     * 航段信息
     */
    @NonNull private List<SegmentBean> segmentBeanList;

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
     * 0:往返程全部为中转，1：去程为中转，2：返程为中转
     */
    private String transfer;

    /**
     * source
     * 历史数据，如果source为空，可以将airline转为source？？？
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

    public boolean isUseMemberPrice() {
        return useMemberPrice;
    }

    public void setUseMemberPrice(boolean useMemberPrice) {
        this.useMemberPrice = useMemberPrice;
    }
}
