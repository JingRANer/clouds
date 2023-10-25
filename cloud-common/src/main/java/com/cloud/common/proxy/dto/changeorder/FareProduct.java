package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class FareProduct implements Serializable {

    private static final long serialVersionUID = -5268076679858096811L;

    /**
     * 产品代码
     */
    private String code;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品描述
     */
    private String desc;

    /**
     * 产品类型
     */
    private String type;
}
