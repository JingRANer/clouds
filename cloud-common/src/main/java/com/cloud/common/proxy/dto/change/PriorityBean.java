package com.cloud.common.proxy.dto.change;

import lombok.Data;

import java.io.Serializable;

/**
 * @discription:权益信息
 */
@Data
public class PriorityBean implements Serializable {
    /**
     * 权益图片icon
     * @mock http://img.umetrip.com/fs/shopping/static/56,036c5e727d1620cd
     */
    private String priorityIcon;
    /**
     * 权益名称
     * @mock 公务舱座椅
     */
    private String priorityName;
}
