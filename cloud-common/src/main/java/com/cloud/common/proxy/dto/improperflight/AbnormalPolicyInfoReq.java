package com.cloud.common.proxy.dto.improperflight;

import lombok.Data;

import java.util.List;

/**
 * 不正常退改政策
 * @author jingran
 */
@Data
public class AbnormalPolicyInfoReq {

    /**
     * 航线
     * @Mock PEK-SHA
     */
    private String airRoute;


    /**
     * 航司二字码
     * @Mock MU
     */
    private String airline;

    /**
     * 航班开始日期
     * @Mock 2021-09-26
     */
    private String deptDate;

    /**
     * 航班截止日期
     * @Mock 2021-09-26
     */
    private String destDate;

    /**
     * 出票开始日期
     * @Mock 2021-09-26
     */
    private String tktBeginDate;

    /**
     * 出票截止日期
     * @Mock 2021-09-26
     */
    private String tktOverDate;


    /**
     * 政策编号
     * @Mock anyString()
     */
    private String policyNo;

    /**
     * 机场三字码合集
     * @Mock ["PEK","SHA"]
     */
    private List<String> airportCodeList;

    /**
     * 机场政策适用范围
     * 0:到达；1：出发；2：经停；3：全部；
     * @Mock ["1","2"]
     */
    private List<String> policyType;

    /**
     * 疫情政策URL
     */
    private String policyUrl;
}
