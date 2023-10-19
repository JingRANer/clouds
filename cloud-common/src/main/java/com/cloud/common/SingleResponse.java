package com.cloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SingleResponse<T> {

    private T data;

    private long errCode;

    private String errMsg;

    public static SingleResponse buildSuccess() {
        return new SingleResponse(null, CloudErrorEnum.SUCCESS.getErrCode(), CloudErrorEnum.SUCCESS.getErrMsg());

    }


    public static SingleResponse buildFailure(CloudErrorEnum errorEnum) {
        return new SingleResponse(null, errorEnum.getErrCode(), errorEnum.getErrMsg());
    }


    public boolean isSuccess(){
        return this.errCode == CloudErrorEnum.SUCCESS.getErrCode();
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse singleResponse = SingleResponse.buildSuccess();
        singleResponse.setData(data);
        return singleResponse;
    }
}
