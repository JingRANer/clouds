package com.cloud.shopping.dao;

import lombok.Data;

/**
 * author: jingran
 * Desc:
 * ClassName: PriorityPO
 * create: 2024-08-08 14:42
 **/

@Data
public class PriorityPO {
    private PriorityDetailPO seat;
    private PriorityDetailPO checkin;
    private PriorityDetailPO vipcup;
    private BaggagePriorityPO baggage;
    private BaggagePriorityPO baggagecarryon;
    private PriorityDetailPO meal;
    private PriorityDetailPO added;
    private PriorityDetailPO cabin;
    private PriorityDetailPO ground;
    private PriorityDetailPO mileage;
    private PriorityDetailPO leg;
}
