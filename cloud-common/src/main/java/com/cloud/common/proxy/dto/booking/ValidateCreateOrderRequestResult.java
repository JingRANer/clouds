package com.cloud.common.proxy.dto.booking;


import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author lde
 * @create 2023/2/16
 */
@Data
public class ValidateCreateOrderRequestResult implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 是否通过校验
     */
    private Boolean pass;

    /**
     * 重复的订单信息
     */
    private List<RepeatOrderInfo> repeatOrderInfos;
    /**
     * 不支持证件类型
     */
    private List<UnableBookingCertInfo> unableBookingCertInfoList;
    /**
     * 是否支持继续下单标识
     */
    private Boolean supportBooking;
    /**
     * 标志拦截器
     */
    private String type;
    /**
     * 临近航班拦截时间
     * */
    private String timeout;
    /**
     * 成都航u舱身份证号54开头限制人员名字
     */
    private Set<String> unableBookingNameList;

}
