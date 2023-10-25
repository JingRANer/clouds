package com.cloud.common.proxy.dto.changeorder.rulepriority;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 退改签规则信息
 *
 * @author yangsl
 * @date 2022/4/6 13:13
 * @version 1.0
 */
@Data
public class RefundChangeRule implements Serializable {
    private static final long serialVersionUID = 3143437604492711479L;

    /**
     * 航司个性化或者通用化描述内容
     */
    private String rcDesc;
    /**
     * 底部的个性化描述
     */
    private String bottomDesc;
    /**
     * 存放退的详细规则
     */
    private List<RefundChangeRuleDetail> rList;
    /**
     * 存放改的详细规则
     */
    private List<RefundChangeRuleDetail> cList;
    /**
     * pageid
     */
    private String targetPageId;
    /**
     * 拼接跳转参数
     */
    private String parameter;
    /**
     * 跳转描述
     */
    private String oriDesc;

}
