package com.cloud.register.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {

    /**
     * æ—…å®¢id
     */
    private List<FrequentPassenger> frequentPassengers;

    /**
     * æ—…å®¢å§“åï¼ŒåŠ å¯†
     */
    private String name;

    private String userId;

    /**
     * æ€§åˆ«ï¼ŒFå¥³ï¼ŒMç”·
     */
    private String gender;

    /**
     * ä¹˜å®¢ç±»åž‹AæˆäººCå„¿ç«¥Iå©´å„¿
     */
    private String type;

    /**
     * è¯ä»¶ç±»åž‹ï¼Œ0èº«ä»½è¯2æŠ¤ç…§3å…¶ä»–5æˆ·å£æœ¬7å°èƒžè¯8å›žä¹¡è¯9æ¸¯æ¾³å°èº«ä»½è¯
     */
    private Integer certType;

    /**
     * è¯ä»¶å·ï¼ŒåŠ å¯†
     */
    private String certNo;

    /**
     * å¹´é¾„
     */
    private Integer age;

    /**
     * å‡ºç”Ÿæ—¥æœŸï¼Œyyyy-MM-dd
     */
    private String birthday;

    /**
     * æ‰‹æœºå·ï¼ŒåŠ å¯†
     */
    private String mobile;


    /**
     * ç™»é™†å¯†ç 
     */
    private String password;

    /**
     * å›½ç±ä¿¡æ¯
     */
    private String nationality;

    /**
     * è¯ä»¶æœ‰æ•ˆæœŸ
     */
    private String certExpiryDate;

    /**
     * ç”¨æˆ·ID
     */
    private String umeUserId;

    /**
     * ä¸­æ–‡å§“ åŠ å¯†
     */
    private String cnSurName;

    /**
     * ä¸­æ–‡å åŠ å¯†
     */
    private String cnGivenName;

    /**
     * æ‹¼éŸ³å§“ åŠ å¯†
     */
    private String surName;

    /**
     * æ‹¼éŸ³å åŠ å¯†
     */
    private String givenName;

    /**
     * æŠ¤ç…§ç­¾å‘å›½äºŒå­—ç 
     */
    private String authorizeNationalityCode;

    /**
     * æ—…å®¢å§“åç¼–ç 
     */
    private String nameCode;

    /**
     * è¯ä»¶å·ç ç¼–ç 
     */
    private String certNoCode;

    /**
     * æ‰‹æœºå·ç¼–ç 
     */
    private String mobileCode;

    /**
     * ä¸­æ–‡å§“ç¼–ç 
     */
    private String cnSurNameCode;

    /**
     * ä¸­æ–‡åç¼–ç 
     */
    private String cnGivenNameCode;

    /**
     * æ‹¼éŸ³å§“ç¼–ç 
     */
    private String surNameCode;

    /**
     * æ‹¼éŸ³åç¼–ç 
     */
    private String givenNameCode;

    /**
     * è§’è‰² ä¹˜å®¢ å·¥ä½œäººå‘˜
     */
    private String role;

    private Date createTime;

    private Date updateTime;
    private String token;
}
