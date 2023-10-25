package com.cloud.common.proxy.dto.refund;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/10/25
 */
@Data
public class GetRefundFeeInfoResp extends BaseResponse {

    public GetRefundFeeInfoResp() {
    }

    public GetRefundFeeInfoResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }


    /**
     * 非自愿预估总退票费金额(需退总金额)
     */
    private String involuntaryPredictMoney;

    /**
     * 自愿预估总退票费金额(需退总金额)
     */
    private String voluntaryPredictMoney;

    /**
     * 非自愿预估退票费明细
     */
    private PredictMoneyDetail involuntaryMoneyDetail;

    /**
     * 自愿预估退票费明细
     */
    private PredictMoneyDetail voluntaryMoneyDetail;

    /**
     * 退改签规则
     */
    private String refundAndChangeRuler;

    /**
     * 航司销售渠道
     */
    private String source;

    /**
     * 航司
     */
    private String airline;

    /**
     * 用户所选乘机人和航段信息
     */
    private List<NeedRefundPassengerInfo> passengerAndSegmentInfoList;

    /**
     * 下一次退票费变化金额
     */
    private String nextRefundFee;

    /**
     * 下一次退票费变化时间点
     */
    private String nextRefundFeeDuration;

    /**
     * token缓存
     */
    private String token;

    /**
     * 总费用
     */
    private Long totalCharge;

    /**
     * 总票价
     */
    private Long totalPrice;

    /**
     * 总税费
     */
    private Long totalTax;

    /**
     * 总机建税费
     */
    private Long totalAirportTax;

    /**
     * 总燃油税费
     */
    private Long totalFuelTax;

    /**
     * 是否为改后退
     */
    private boolean afterChangeRefund;

    /**
     * 是否为改后退
     */
    private boolean afterNoSeatRefund;

    /**
     * 是否为中转退票
     */
    private boolean transferRefund;

    /**
     * 是否为使用券兑换机票后退票
     */
    private boolean afterUseCouponRefund;
    /**
     * 是否为浮动产品后退票
     */
    private boolean afterFloatingProduct;


}
