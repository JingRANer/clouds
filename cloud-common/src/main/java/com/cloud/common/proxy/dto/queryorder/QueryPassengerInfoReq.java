package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2022/9/27
 */
@Data
public class QueryPassengerInfoReq implements Serializable {


    private static final long serialVersionUID = 4958692398730001002L;

    /**
     * 用户id
     */
    private String userId;
    /**
     * 密码
     */
    private String password;
    /**
     * 订单号
     */
    private String orderNo;


}
