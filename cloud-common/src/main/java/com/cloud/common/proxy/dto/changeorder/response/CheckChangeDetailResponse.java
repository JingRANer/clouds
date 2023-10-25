package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.ChangeJourneySegment;
import com.umetrip.air.order.service.dto.changeorder.Contact;
import com.umetrip.air.order.service.dto.changeorder.Offer;
import com.umetrip.air.order.service.dto.changeorder.PassengerInfo;
import com.umetrip.air.order.service.dto.changeorder.Priority;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class CheckChangeDetailResponse implements Serializable {

    private static final long serialVersionUID = 3909783889649024152L;

    /**
     * 缓存id
     */
    private String sessionId;

    /**
     * 联系人信息
     */
    private Contact contact;

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
     * 改期时，旅客提交的附件
     */
    private List<String> changeSubmitFiles;

    /**
     * 用户选择的乘机人信息中是否包含联系人
     */
    private Boolean containContact;

    /**
     * 原订单是否包含儿童乘客
     */
    private Boolean containChild;

    /**
     * 改期前的航班信息
     */
    private List<ChangeJourneySegment> oriChangeJourneySegmentList;

    /**
     * 改期后的航班信息
     */
    private List<ChangeJourneySegment> targetChangeJourneySegmentList;

    /**
     * 该行程下的offer列表
     */
    private Offer offer;

    /**
     * 改期前的中转信息
     */
    private List<Priority> oriTransferPriorityList;

    /**
     * 改期后的中转信息
     */
    private List<Priority> targetTransferPriorityList;

    /**
     * 改期前行程类型
     */
    private String journeyType;

    /**
     * 渠道
     */
    private String source;


    /**
     * 改期前订单号
     */
    private String oriOrderNo;

    /**
     * 是否是非自愿爬虫改期
     */
    private boolean isSpiderChange;

    /**
     * 爬虫需要获取手机验证码
     */
    private boolean needVerificationCode;
}
