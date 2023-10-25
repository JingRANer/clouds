package com.cloud.common.proxy.dto.couponsale;

import com.umetrip.air.order.service.dto.order.PassengerBean;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2022/6/27
 */
@Data
public class CreateCouponExchangeOrderRequest implements Serializable {

    private static final long serialVersionUID = -1202677195761524672L;
    /**
     * 用户id
     */
    private String userId;

    /**
     * 乘客信息列表
     */
    private List<PassengerBean> passengerInfoList;

    /**
     * 应支付金额
     */
    private String charge;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人手机号
     */
    private String contactMobile;

    /**
     * 兑换码
     */
    private String exchangeCode;

    /**
     * 优惠券码
     */
    private String couponCode;

    /**
     * 客户端版本号
     */
    private String appVersionNumber;

}
