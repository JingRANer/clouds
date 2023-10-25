package com.cloud.common.proxy.dto.syncorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ServiceToSync implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 服务id
     */
    private String serviceId;
    /**
     * 服务状态
     */
    private String serviceStatus;
    /**
     * 航段
     */
    private List<SegmentToSync> segmentList;
    /**
     * 票号
     */
    private String serviceTktNo;
}
