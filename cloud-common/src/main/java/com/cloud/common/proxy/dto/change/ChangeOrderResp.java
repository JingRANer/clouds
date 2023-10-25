package com.cloud.common.proxy.dto.change;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

/**
 * @author zcy
 * @Date 2021-05-31
 */
@Data
public class ChangeOrderResp  extends BaseResponse {
    private static final long serialVersionUID = -7133907768486369863L;


    public ChangeOrderResp(){
        super();
    }

    public ChangeOrderResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    /**
     * 返回的对象
     */
    private Object object;

    /**
     * tip提示信息
     */
    private String tips;

    /**
     * sessionId
     */
    private String sessionId;

    /**
     * 风险提示信息
     */
    private String reminder;
//
//    /**
//     * 下单后的订单状态
//     */
//    private String orderStatus;
//
//    /**
//     * 下单数据源
//     */
//    private String source;
//
//

    /**
     * 收银台需要的参数
     */
    private String bizContent;

    /**
     * 收银台需要的签名信息
     */
    private String signature;

//    /**
//     * 收银台需要的参数
//     */
//    private String payIfo;
//    /**
//     * 改期订单号
//     */
//    private String changeOrderNo;
    /**
     * 改期订单状态
     * 如果是预订成功则可以发起支付
     */
    private String orderStatus;

    private Long tipsCode;

    public ChangeOrderResp(long errCode, String errMsg, long tipsCode,  String tips) {
        super(errCode, errMsg);
        this.tips = tips;
        this.tipsCode = tipsCode;
    }
}
