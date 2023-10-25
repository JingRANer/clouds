package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/10 14:09
 */
@Data
public class VipcupPriority implements Serializable {
    private static final long serialVersionUID = 6879765469154599651L;
    /**
     * 权益名称
     */
    private String info;
    /**
     * 权益详情
     */
    private String description;

}
