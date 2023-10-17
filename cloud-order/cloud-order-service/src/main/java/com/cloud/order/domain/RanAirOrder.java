package com.cloud.order.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class RanAirOrder implements Serializable {
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
    * é‡è¯•æ¬¡æ•°
    */
    private Integer retryCount;

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
    * 0ï¼šä¸æ”¯æŒäºŒæ¬¡ç”³é€€æŽ¥å£ 1ï¼šå¯ä»¥æäº¤äºŒæ¬¡ç”³é€€
    */
    private Integer secondRefund;

    /**
    * åŽŸè®¢å•å·ã€‚å½“å½“å‰è®¢å•æ˜¯CHANGEæˆ–REFUNDæ—¶ï¼Œéœ€è¦å…³è”åŽŸè®¢å•å·ã€‚ 
    */
    private String oriStatus;

    /**
    * æ˜¯å¦æ”¯æŒå†æ¬¡æäº¤(0 ä¸å¯åœ¨æ­¤å•æäº¤å†æ¬¡é€€ç¥¨;1 å¯ä»¥å†æ­¤å•æäº¤å†æ¬¡é€€ç¥¨)
    */
    private Integer supportResubmit;

    /**
    * æ ‡è¯†æ˜¯å¦ä¸ºåˆå¹¶æ”¯ä»˜è®¢å•(0:ä¸ä¸ºåˆå¹¶æ”¯ä»˜è®¢å•;1:æ˜¯åˆå¹¶æ”¯ä»˜è®¢å•)
    */
    private Integer combo;

    /**
    * ä½¿ç”¨æ¸ é“ ç”¨äºŽåŒºåˆ†appï¼Œå¾®ä¿¡å°ç¨‹åºç­‰æ¥æºå€¼ä¸ºâ€œappâ€æˆ–â€œwxâ€
    */
    private String sourceFrom;

    /**
    * è®¢å•æ¥æºä¿¡æ¯
    */
    private String orderSource;

    /**
    * é¢å¤–é¢„ç•™å­—æ®µâ€”1
    */
    private String extraField1;

    /**
    * é¢å¤–é¢„ç•™å­—æ®µâ€”2
    */
    private String extraField2;

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