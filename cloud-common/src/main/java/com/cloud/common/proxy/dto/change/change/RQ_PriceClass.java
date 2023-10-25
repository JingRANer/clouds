package com.cloud.common.proxy.dto.change.change;

import com.umetrip.air.order.service.dto.change.change.priority.Priority;
import lombok.Data;

import java.io.Serializable;

@Data
public class RQ_PriceClass implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2853205372655717859L;
    // 舱位
    private String cabin;
    // 索引
    private String fareIndex;
    // 改签类型，RTC为非自愿改期，Revalidation为自愿改期，Upgrade为换开
    private String solutionType;
    // 改签所需费用，前期如果费用不是0就忽略，第二期需要放开
    private double penalty;

    //票面价格
    private double baseAmount;

    /**
     * 当前舱位改签是否收费
     */
    private boolean isFree = true;

    /** reissueFee: 换开手续费 */
    private double reissueFee = 0;

    /** differFare: 差价 */
    private double differFare = 0;

    private String context;

    /**
     * 权益信息
     */
    private Priority priority;


}
