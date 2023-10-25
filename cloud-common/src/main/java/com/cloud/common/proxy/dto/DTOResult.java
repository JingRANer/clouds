package com.cloud.common.proxy.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 */
@Data
public class DTOResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer errCode;

    private String errMsg;

    public DTOResult(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public DTOResult() {
        errCode = 0;
    }

    private T result;
}
