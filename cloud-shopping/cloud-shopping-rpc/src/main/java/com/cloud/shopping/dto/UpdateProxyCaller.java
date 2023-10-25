package com.cloud.shopping.dto;

/**
 * 通过proxy接口更新缓存的调用者
 */
public enum UpdateProxyCaller {
    /**
     * 查询发起的更新
     */
    SEARCH,
    /**
     * seamless库存异常变化发起的更新
     */
    SEAMLESS,
    /**
     * 定时任务发起的更新
     */
    JOB,
    /**
     * 管理端发起的更新
     */
    MANAGER,
    /**
     * 用户发起的更新
     */
    USER,
    /**
     * 预定发起的更新
     */
    CHECKORDER,
    /**
     * 爬虫
     */
    SPIDER,
    /**
     * 出票
     */
    ISSUE,
    /**
     * 预订
     */
    ORDERBOOK,
    /**
     * 预订发起的异步更新临近天
     */
    CHECKASYNCUPDATE,
    /**
     * 订阅航线刷新定时任务发起的更新
     */
    AIRLINESINGLEJOB,

    /**
     * 共享航班价格低于主航班价格事调用的更新
     */
    MARKETPRICE,

    /**
     * 计划时间变更
     */
    SCHEDULETIMECHG,
    /**
     * 热门航线刷新
     */
    POPULARROUTESJOB,
    /**
     * 人工热门航线刷新
     */
    POPULARROUTESMANUALJOB;
}
