package com.cloud.common.proxy.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author zy
 * @date 2020/3/20
 */
@Data
public class WeexParams implements Serializable {
    private static final long serialVersionUID = -7836997894765646912L;
    private String weexName;
    private String jsBundleEntry;
    private String weexId;
    private String weexUrl;
    private String webUrl;
    private int configureId;

    private String serviceName;
    private String commonJsEntry;
    private String minVersion;
}
