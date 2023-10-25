package com.cloud.common.proxy.dto.pay;

import java.io.Serializable;

/**
 * Created by lyxbai on 2018/12/19.
 * @author lyxbai
 */
public class RefundCallbackResponse implements Serializable {

    private static final long serialVersionUID = -7297053051852852288L;

    public RefundCallbackResponse(long errCode, String errMsg) {
        this.resultCode =(int) errCode;
        this.message = errMsg;
    }

    public RefundCallbackResponse() {
        this.resultCode = 0;
        this.message = "成功";
    }

    /**
     * 返回码 0代表正确，其他代表错误
     */
    private int resultCode;

    /**
     * 错误提示信息
     */
    private String message;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
