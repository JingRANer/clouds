package com.cloud.common.proxy.dto.reshopping;

import com.umetrip.air.order.service.dto.BaseResponse;
import com.umetrip.air.order.service.dto.change.ContactInfo;
import com.umetrip.air.order.service.dto.change.FlightDetailInfo;
import com.umetrip.air.order.service.dto.passenger.PassengerInfo;
import lombok.Data;

import java.util.List;

/**
 * 行程确认返回
 * @author zcy
 * @Date 2022-01-06
 */
@Data
public class FlightDetailConfirmResp extends BaseResponse {

    /**
     * 改期前行程信息
     */
    private List<FlightDetailInfo> flightDetailOldList;

    /**
     * 改期后行程信息
     */
    private List<FlightDetailInfo> flightDetailNewList;

    /**
     * 联系人信息
     */
    private ContactInfo contact;

    /**
     * 乘机人信息
     */
    private List<PassengerInfo> passengerInfoList;

    /**
     * 改期原因
     */
    private String changeReason;

    /**
     * 改期类型
     */
    private String changeType;

    /**
     * 改期上传的文件列表
     */
    private List<String> changeSubmitFile;

    /**
     * 改期总金额
     */
    private String totalCharge;

    /**
     * 成人乘客数
     */
    private int adultPassengerNum;

    /**
     * 儿童乘客数
     */
    private int childPassengerNum;

    /**
     * 改期价格细节
     */
    private ChangeMoneyDetail changeMoneyDetail;

    /**
     * 是否乘机人包含联系人 false不包含。true包含
     */
    private boolean contains;

    /**
     * 原订单是否包含儿童乘客
     */
    private Boolean containChild;

    /**
     * 本次改期流程唯一标识
     */
    private String sessionId;


    public FlightDetailConfirmResp() {
        super();
    }

    public FlightDetailConfirmResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

}