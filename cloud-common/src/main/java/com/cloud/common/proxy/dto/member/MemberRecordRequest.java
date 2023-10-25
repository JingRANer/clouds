package com.cloud.common.proxy.dto.member;

import lombok.Data;

@Data
public class MemberRecordRequest {

    /**
     * userId
     */
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String certNo;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 活动渠道
     */
    private String source;

    /**
     * 等级类型
     */
    private String classType;
}
