package com.cloud.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * æœåŠ¡è¡¨
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudAirService implements Serializable {
    /**
    * è‡ªå¢žid
    */
    private Long id;

    /**
    * æœåŠ¡id
    */
    private String serviceId;

    /**
    * æœåŠ¡ç±»åž‹ï¼Œ1ä¸ºæœºç¥¨
    */
    private Integer serviceType;

    private String servicePassengerType;

    /**
    * ç¥¨ä»·
    */
    private Long price;

    /**
    * æ‰‹ç»­è´¹
    */
    private Long commission;

    /**
    * æ€»è´¹ç”¨
    */
    private Long charge;

    /**
    * ç‡ƒæ²¹ç¨Ž
    */
    private Long fuelTax;

    /**
    * æœºå»ºè´¹
    */
    private Long airportTax;

    /**
    * ç¥¨å·ï¼Œå¤šä¸ªç”¨","åˆ†éš”
    */
    private String tktNo;

    /**
    * åŽŸç¥¨å·ï¼Œå¯èƒ½æœ‰å¤šä¸ªï¼Œç”¨â€œï¼Œâ€é€—å·åˆ†éš”
    */
    private String oriTktNo;

    /**
    * æœåŠ¡çŠ¶æ€ï¼š OK å·²é¢„è®¢å åº§ SERVICEABLE å·²å‡ºç¥¨ UNSERVICEABLE è®¢ç¥¨å¤±è´¥ RFING é€€ç¥¨ä¸­ RERFING å†æ¬¡é€€ç¥¨ä¸­ CHGBOOK æ”¹æœŸå·²ä¸‹å• CHGING æ”¹æœŸä¸­ USED å·²ä½¿ç”¨ RF å·²é€€ç¥¨ CHG å·²æ”¹æœŸ CHGFAIL æ”¹æœŸå¤±è´¥ RF_AUDIT_FAILED é€€ç¥¨å®¡æ ¸å¤±è´¥ CHANGECANCEL æ”¹æœŸå·²å–æ¶ˆ CHANGECREATEFAIL æ”¹æœŸä¸‹å•å¤±è´¥ 
    */
    private String serviceStatus;

    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createTime;

    private Date updateTime;

    private Date issueTime;

    /**
    * æœåŠ¡è¯´æ˜Ž
    */
    private String serviceRemark;

    /**
    * èˆªæ—…è®¢å•å·ã€‚ä¸Žumetrip_air_orderè¡¨ä¸­ordernoå…³è”
    */
    private String orderNo;

    /**
    * èˆªæ—…id
    */
    private String passengerId;

    /**
    * è¿ä»·ç±»åˆ«ï¼šOWå•ç¨‹ RTå¾€è¿”
    */
    private String priceType;

    /**
    * åœ¨å‘èµ·é€€æ”¹ä¹‹å‰çš„serviceçŠ¶æ€
    */
    private String oriServiceStatus;

    /**
    * ç”¨æˆ·ID
    */
    private String userId;

    /**
    * äº§å“çš„åŽŸå§‹ä»·æ ¼
    */
    private BigDecimal originalPrice;

    /**
    * æ˜¯å¦æµ®åŠ¨ default 0 1æ ‡è¯†æ­¤æœåŠ¡åŒ…å«çš„èˆªæ®µä¸ºæµ®åŠ¨äº§å“
    */
    private Integer floatingProduct;

    private static final long serialVersionUID = 1L;
}