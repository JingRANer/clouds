package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class StatusChain implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 状态链时间
     */
    private String chainTime;

    /**
     * 状态连事件
     */
    private String chainEvent;

    /**
     * 排序时间
     */
    private String  sortTime;
}
