package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author dcy
 * @ClassName CreateAddOrderRequest.java
 * @Description TODO
 * @createTime 2022年06月07日 17:18
 */
@Data
public class CreateAddOrderRequest implements Serializable {

    private static final long serialVersionUID = -8474518354629152153L;

    /**
     * 主商户订单号
     * 用于附属商户关联信息
     */
    private String orderNo;
    /**
     * 航旅用户ID
     */
    private String userId;
    /**
     *下单必要参数
     * 由附属商户推荐服务返回
     */
    private String data;
    /**
     * 产品单价金额
     * 用于计算总费用，配合乘机人列表使用
     */
    private String price;
    /**
     * 产品订单总价
     */
    private String amount;
    /**
     * 乘机人
     */
    private List<PassengerInfo> passengerInfoList;
    /**
     * 联系人
     */
    private Contact contact;
}
