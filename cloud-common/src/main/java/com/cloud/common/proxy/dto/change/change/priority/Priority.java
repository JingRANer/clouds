package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/10 14:07
 * <p>
 * 品牌权益信息
 */
@Data
public class Priority implements Serializable {

    private static final long serialVersionUID = -6461022543730073793L;
    /**
     * 座位权益
     */
    private SeatPriority seat;
    /**
     * 登机权益
     */
    private CheckinPriority checkin;
    /**
     * 贵宾室权益
     */
    private VipcupPriority vipcup;
    /**
     * 托运行李权益
     */
    private BaggagePriority baggage;
    /**
     * 手提行李权益
     */
    private BaggageCarryonPriority baggagecarryon;
    /**
     * 餐食权益
     */
    private MealPriority meal;
    /**
     * 增值权益
     */
    private AddedPriority added;
    /**
     * 客舱权益
     */
    private CabinPriority cabin;
    /**
     * 地面权益
     */
    private GroundPriority ground;
    /**
     * 里程权益
     */
    private MileagePriority mileage;
    /**
     * 定级航段权益
     */
    private LegPriority leg;

}
