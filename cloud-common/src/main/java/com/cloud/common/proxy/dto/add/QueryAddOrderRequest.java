package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName QueryAddOrderRequest.java
 * @Description TODO
 * @createTime 2022年06月07日 19:00
 */
@Data
public class QueryAddOrderRequest implements Serializable {
    private static final long serialVersionUID = -5521410584432678303L;

    /**
     * 主商户订单号
     */
    private String orderNo;
}
