package com.cloud.order.repository.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudAirSegment implements Serializable {
    private Long id;

    /**
    * èˆªæ®µID
    */
    private String segmentId;

    /**
    * å¸‚åœºèˆªå¸
    */
    private String marketAirline;

    /**
    * æ‰¿è¿èˆªå¸
    */
    private String hostAirline;

    /**
    * èˆªç­å·
    */
    private String flightNo;

    /**
    * æ‰¿è¿èˆªç­å·
    */
    private String hostFlightNo;

    /**
    * å‡ºå‘åœ°ä¸‰å­—ç 
    */
    private String deptCode;

    /**
    * å‡ºå‘æœºåœºåç§°
    */
    private String deptAirportName;

    /**
    * åˆ°è¾¾åœ°ä¸‰å­—ç 
    */
    private String destCode;

    /**
    * åˆ°è¾¾æœºåœºåç§°
    */
    private String destAirportName;

    /**
    * è®¡åˆ’èµ·é£žæ—¥æœŸ
    */
    private String deptDate;

    /**
    * è®¡åˆ’èµ·é£žæ—¶é—´
    */
    private String deptTime;

    /**
    * èˆ±ä½ä»£ç 
    */
    private String cabin;

    /**
    * èˆ±ä½æŠ˜æ‰£
    */
    private String cabinDiscount;

    /**
    * å¾€è¿”ç¨‹æ ‡è¯† 0æ ‡è¯†åŽ»ç¨‹ 1æ ‡è¯†è¿”ç¨‹
    */
    private String roundTrip;

    /**
    * å‡ºå‘åœ°èˆªç«™æ¥¼
    */
    private String deptTerminal;

    /**
    * åˆ°è¾¾åœ°èˆªç«™æ¥¼
    */
    private String destTerminal;

    /**
    * é¤é£Ÿæè¿°
    */
    private String mealDesc;

    /**
    * ç¥¨å·
    */
    private String tktNo;

    /**
    * ç¥¨å·çš„èˆªæ®µåºå·
    */
    private String coupon;

    /**
    * å®¢ç¥¨çŠ¶æ€OPEN FOR USE,REFUNDED,EXCHANGED,USED/FLOWN
    */
    private String tktStatus;

    /**
    * ç»åœåŸŽå¸‚å
    */
    private String stopOverCityName;

    /**
    * ç»åœåœ°ä¸‰å­—ç 
    */
    private String stopOverCode;

    /**
    * ç»åœæ—¶é—´
    */
    private String stopOverTime;

    /**
    * ç»åœå…¶ä»–ä¿¡æ¯
    */
    private String stopOverContext;

    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createTime;

    /**
    * æ›´æ–°æ—¶é—´
    */
    private Date updateTime;

    /**
    * èˆªæ®µåºåˆ—å·1 2 åŒºåˆ†èˆªæ®µå…ˆåŽé¡ºåº
    */
    private String serialNumber;

    /**
    * æœåŠ¡id
    */
    private String serviceId;

    /**
    * å…è´¹è¡ŒæŽé¢åº¦
    */
    private String freeBaggage;

    private String destDate;

    private String destTime;

    private String classCode;

    private String oriSegmentId;

    private String oriTktNo;

    private String oriCoupon;

    private String cabinProduct;

    private String code;

    private String deptCityName;

    private String destCityName;

    /**
    * ä»·æ ¼
    */
    private Long price;

    /**
    * ç‡ƒæ²¹ç¨Ž
    */
    private Long fuelTax;

    /**
    * æœºåœºå»ºè®¾ç¨Ž
    */
    private Long airportTax;

    /**
    * åªåœ¨changeOrderæœ‰å¤šæ®µçš„æ—¶å€™ç”Ÿæ•ˆ
    */
    private String pnr;

    /**
    * ç”¨æˆ·ID
    */
    private String userId;

    private static final long serialVersionUID = 1L;
}