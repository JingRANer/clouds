package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class Taxes implements Serializable {

    private static final long serialVersionUID = -2084665705699154546L;

    /**
     * 总税额
     */
    private String totalAmount;

    /**
     * 税信息列表
     */
    private List<Tax> taxList;
}
