package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/10 14:08
 */
@Data
public class CheckinPriority implements Serializable {
    private static final long serialVersionUID = 3322166110272627548L;
    /**
     * 权益名称
     */
    private String info;
    /**
     * 权益详情
     */
    private String description;

}
