package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/10 14:08
 */
@Data
public class CheckinPriority implements Serializable {
    /**
     * 权益名称
     */
    private String info;
    /**
     * 权益详情
     */
    private String description;

}
