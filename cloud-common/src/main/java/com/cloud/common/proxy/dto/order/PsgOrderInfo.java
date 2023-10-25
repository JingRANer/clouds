package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class PsgOrderInfo implements Serializable {

    private static final long serialVersionUID = 2699103678984984515L;

    /**
     * 乘机人姓名
     * @mock 测试
     */
    private String passengerName;

    /**
     * 乘机人信息列表
     */
    private List<TypeDescAndNumber> typeDescAndNumberList;
}

