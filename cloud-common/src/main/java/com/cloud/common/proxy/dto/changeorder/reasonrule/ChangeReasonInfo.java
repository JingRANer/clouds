package com.cloud.common.proxy.dto.changeorder.reasonrule;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 改期原因信息
 *
 * @className ChangeReasonInfo
 * @description: 改期原因信息
 * @author yangsl
 * @date 2022/4/1 13:53
 */
@Data
public class ChangeReasonInfo implements Serializable {
    private static final long serialVersionUID = -7350997121239904524L;

    /**
     * 改期类型
     */
    private String changeType;
    /**
     * 改期类型描述
     */
    private String changeTypeDesc;
    /**
     * 改期须知
     */
    private String changeNotice;
    /**
     * 支持非自愿改期
     */
    private boolean supportInvoluntaryChange;
    /**
     * 改期原因描述
     */
    private List<ChangeReasonSingleInfo> changeReasonSingleInfos;
    /**
     * 默认文案
     */
    private ChangeReasonDefaultDesc defaultDesc;
}
