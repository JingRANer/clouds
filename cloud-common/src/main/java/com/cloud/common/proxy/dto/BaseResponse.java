package com.cloud.common.proxy.dto;

import java.io.Serializable;

/**
 * @author lyxbai
 */
public class BaseResponse implements Serializable{

    private static final long serialVersionUID = 7840508491194397285L;

    private int errCode;
    private String errMsg;

    public BaseResponse() {
        this.errCode = 0;
        this.errMsg = "成功";
    }

    public BaseResponse(long errCode, String errMsg) {
        this.errCode = (int) errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public void setErrCode(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
