package com.cloud.common.proxy.dto.queryorder;

import com.umetrip.air.order.service.dto.booking.Contact;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2022/9/27
 */
@Data
public class QueryPassengerInfoResp implements Serializable {

    private static final long serialVersionUID = 7371719693613975479L;

    /**
     * 乘客信息
     */
    private List<PassengerInfo> passengerInfos;

    /**
     * 联系人信息
     */
    private Contact contact;
}
