package com.cloud.order.repository.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudAirOrder implements Serializable {
    /**
    * è‡ªå¢žid
    */
    private Long id;

    /**
    * èˆªæ—…å­è®¢å•å·
    */
    private String orderNo;

    /**
    * èˆªå¸å­è®¢å•å·
    */
    private String airlineSubOrderNo;

    /**
    * æ“ä½œäººç”¨æˆ·ID
    */
    private String userId;

    /**
    * èˆªå¸äºŒå­—ç 
    */
    private String airline;

    /**
    * è®¢å•çŠ¶æ€
    */
    private String status;

    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createTime;

    /**
    * æ›´æ–°æ—¶é—´
    */
    private Date updateTime;

    /**
    * å®¡æ ¸æ—¶é—´
    */
    private Date auditTime;

    /**
    * è®¢å•æ”¯ä»˜æˆªæ­¢æ—¶é—´
    */
    private Date expiredTime;

    /**
    * è°ƒç”¨æ¸ é“æŽ¥å£æˆåŠŸæ—¶é—´
    */
    private Date doneTime;

    /**
    * è”ç³»äººå§“å
    */
    private String contactName;

    /**
    * è”ç³»ç”µè¯
    */
    private String contactPhone;

    /**
    * é”™è¯¯ç 
    */
    private Integer errCode;

    /**
    * é”™è¯¯åŽŸå› 
    */
    private String errMsg;

    /**
    * å–æ¶ˆè®¢å•æ—¶é—´
    */
    private Date cancelTime;

    /**
    * å–æ¶ˆåŽŸå› ï¼Œç”¨æˆ·ä¸»åŠ¨å–æ¶ˆé€‰æ‹©çš„åŽŸå› ã€‚ æˆ–è€…æœªæ”¯ä»˜è‡ªåŠ¨å–æ¶ˆåŽŸå› ä¸ºï¼šâ€œè¶…æ—¶è‡ªåŠ¨å–æ¶ˆâ€
    */
    private String cancelReason;

    /**
    * è®¢å•æ€»ç¥¨ä»·
    */
    private Long totalPrice;

    /**
    * è®¢å•æ€»ç¨Žé¢
    */
    private Long totalTax;

    /**
    * ç”¨æˆ·æäº¤é‡‘é¢ï¼Œç”¨äºŽé€€ç¥¨åœºæ™¯ï¼Œè®°å½•ç”¨æˆ·å½“æ—¶ç”³è¯·é‡‘é¢ã€‚
    */
    private Long applyTotalPrice;

    /**
    * ä¸Žè®¢å•ç±»åž‹æœ‰å…³
    */
    private Long totalCommission;

    /**
    * è®¢å•æ€»äº¤æ˜“é‡‘é¢
    */
    private Long totalCharge;

    /**
    * è®¢å•ç±»åž‹ã€‚ 
    */
    private String orderType;

    /**
    * é”€å”®æ¸ é“ CZï¼ŒASMSç­‰
    */
    private String source;

    /**
    * é€€ç¥¨ç±»åž‹  0ï¼šè‡ªæ„¿ 1ï¼šéžè‡ªæ„¿
    */
    private Integer irrType;

    /**
    * é€€ç¥¨åŽŸå› 
    */
    private String irrReason;

    /**
    * é€€ç¥¨ææ–™å­˜å‚¨æ–‡ä»¶key
    */
    private String irrFileKeys;

    /**
    * åŽŸå§‹è®¢å•å·ã€‚å½“å½“å‰è®¢å•æ˜¯CHANGEæˆ–REFUNDæ—¶ï¼Œéœ€è¦å…³è”åŽŸè®¢å•å·ã€‚ 
    */
    private String oriOrderNo;

    /**
    * èˆªæ—…å¤§è®¢å•å·
    */
    private String superOrderNo;

    /**
    * æ”¯ä»˜æ¸ é“
    */
    private Integer payChannel;

    /**
    * é¢„è®¢è®°å½•ç¼–å·ï¼ˆé’ˆå¯¹ç¾Žç¨‹æ‹¼å•æƒ…å†µè®°å½•pnrï¼‰
    */
    private String pnr;

    /**
    * åŽŸè®¢å•å·ã€‚å½“å½“å‰è®¢å•æ˜¯CHANGEæˆ–REFUNDæ—¶ï¼Œéœ€è¦å…³è”åŽŸè®¢å•å·ã€‚ 
    */
    private String oriStatus;

    /**
    * è”ç³»ç”µè¯ç¼–ç 
    */
    private String contactPhoneCode;

    /**
    * è”ç³»äººå§“åç¼–ç 
    */
    private String contactNameCode;

    private static final long serialVersionUID = 1L;
}