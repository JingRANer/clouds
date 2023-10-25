package com.cloud.common.proxy.dto.changeorder.reasonrule;

import lombok.Data;

import java.io.Serializable;

/**
 * 改期原因默认文案
 *
 * @className ChangeReasonDefaultDesc
 * @description: 改期原因默认文案
 * @author yangsl
 * @date 2022/4/1 13:58
 */
@Data
public class ChangeReasonDefaultDesc implements Serializable {
    private static final long serialVersionUID = 781622729830617100L;

    /**
     * 文案
     */
    private String desc;
    /**
     * 电话号
     */
    private String phone;
}
