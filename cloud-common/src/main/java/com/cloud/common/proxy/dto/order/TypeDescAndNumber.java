package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class TypeDescAndNumber implements Serializable {

    private static final long serialVersionUID = -6358158145132641556L;

    /**
     * 类型描述
     * @mock 身份证
     */
    private String typeDesc;

    /**
     * 类型编号
     * @mock 12323231231
     */
    private String typeNumber;

    /**
     * 状态描述
     * @mock 退票中
     */
    private String statusDesc;

    /**
     * 状态颜色
     * @mock #45455F
     */
    private String statusColor;
}

