package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.BaseResponse;
import com.umetrip.air.order.service.dto.changeorder.reasonrule.ChangeReasonInfo;
import lombok.Data;

import java.util.List;

/**
 * 改期原因返回参数
 *
 * @className ChangeReasonResp
 * @description: 改期原因返回参数
 * @author yangsl
 * @date 2022/4/1 13:41
 */
@Data
public class ChangeReasonResp extends BaseResponse {

    private static final long serialVersionUID = 466120908465309586L;

    public ChangeReasonResp(){
        super();
    }

    public ChangeReasonResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    private List<ChangeReasonInfo> changeReasonInfoList;

    private String invChangeReason;

}
