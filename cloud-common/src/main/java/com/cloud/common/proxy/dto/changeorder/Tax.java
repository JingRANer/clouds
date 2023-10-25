package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class Tax implements Serializable {

    private static final long serialVersionUID = 7387701291576091978L;

    /**
     * 税额
     */
    private String amount;

    /**
     * 水肿名称
     */
    private String name;

    /**
     * 税种代码
     */
    private String code;

    /**
     * 币种
     */
    private String currency;
}
