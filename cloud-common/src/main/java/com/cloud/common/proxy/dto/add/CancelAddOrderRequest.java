package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName CancelAddOrderRequest.java
 * @Description TODO
 * @createTime 2022年06月07日 17:31
 */
@Data
public class CancelAddOrderRequest implements Serializable {

    private static final long serialVersionUID = -1743874950139603950L;

    /**
     * 附属商户订单号
     */
    private String addOrderNo;


}
