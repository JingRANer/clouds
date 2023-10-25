package com.cloud.common.proxy.dto.changeorder.rulepriority;

import lombok.Data;

import java.io.Serializable;

/**
 * 行李规定详细信息
 *
 * @author yangsl
 * @date 2022/4/6 11:08
 * @version 1.0
 */
@Data
public class BaggageDetail implements Serializable {
    private static final long serialVersionUID = -6890119621886830688L;
    private String defaultDesc;
    /**
     * 托运行李信息
     */
    private BaggageInfo baggageInfo;
    /**
     * 手提行李信息
     */
    private BaggageInfo carryOnInfo;
}
