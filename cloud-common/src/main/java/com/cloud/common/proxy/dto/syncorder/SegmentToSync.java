package com.cloud.common.proxy.dto.syncorder;

import lombok.Data;

import java.io.Serializable;

@Data
public class SegmentToSync implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 航段id
     */
    private String segmentId;
    /**
     * 航段状态
     */
    private String segmentStatus;
    /**
     * 票号
     */
    private String segmentTktNo;
}
