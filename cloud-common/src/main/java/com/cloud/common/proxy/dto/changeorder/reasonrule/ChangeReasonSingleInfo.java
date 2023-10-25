package com.cloud.common.proxy.dto.changeorder.reasonrule;

import lombok.Data;

import java.io.Serializable;

/**
 * 改期原因详细信息
 *
 * @className ChangeReasonSingleInfo
 * @description: 改期原因详细信息
 * @author yangsl
 * @date 2022/4/1 13:58
 */
@Data
public class ChangeReasonSingleInfo implements Serializable {
    private static final long serialVersionUID = 4071288824984985421L;

    /**
     * 原因描述
     */
    private String refundDesc;
    /**
     * 原因key
     */
    private String refundReasonKey;
    /**
     * 是否展示文字填写
     */
    private boolean showTextBox;
    /**
     * 默认文案
     */
    private String textBoxDesc;
    /**
     * 是否展示证明材料
     */
    private String showEvidentiaryMaterial;
    /**
     * 是否展示重要提示
     */
    private boolean showImportPrompt;
    /**
     * 重要提示
     */
    private String importPrompt;
    /**
     * 改期是否展示文字填写
     */
    private String showTextBoxChange;
}
