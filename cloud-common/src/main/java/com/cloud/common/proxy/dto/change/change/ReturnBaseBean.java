package com.cloud.common.proxy.dto.change.change;

import java.io.Serializable;

/**
 *  ReturnBaseBean : 客票基础操作部分返回的基本类
 * @author xuejupo  jpxue@travelsky.com
 * create in 2017-2-8 下午1:45:36
 */

public class ReturnBaseBean<T extends Serializable> implements Serializable{

    @Override
    public String toString() {
        return "ReturnBaseBean [status=" + status + ", sessionIdFore=" + sessionIdFore + ", o=" + o + ", msg=" + msg
                + ", realMsg=" + realMsg + "]";
    }

    public final String getSessionIdFore() {
        return sessionIdFore;
    }

    public final void setSessionIdFore(String sessionIdFore) {
        this.sessionIdFore = sessionIdFore;
    }

    public final String getRealMsg() {
        return realMsg;
    }

    public final void setRealMsg(String realMsg) {
        this.realMsg = realMsg;
    }

    public ReturnBaseBean(T o){
        this.status = 1;
        this.o = o;
    }

    public ReturnBaseBean(){}

    public ReturnBaseBean(String msg, String realMsg){
        this.status = 0;
        this.msg = msg;
        this.realMsg = realMsg;
    }

    /** serialVersionUID:  */
    private static final long serialVersionUID = 1L;
    public final int getStatus() {
        return status;
    }
    public final Object getO() {
        return o;
    }
    public final String getMsg() {
        return msg;
    }

    public final void setStatus(int status) {
        this.status = status;
    }

    public final void setO(T o) {
        this.o = o;
    }
    public final void setMsg(String msg) {
        this.msg = msg;
    }
    /** status:  返回的状态，1为成功，0为失败*/
    private int status;
    /**
     * sessionId：返回给前端的sessionId
     */
    private String sessionIdFore;
    /** o:  如果成功，这里封装返回bean*/
    private  T o;
    /** msg:  如果失败，这里封装错误信息*/
    private String msg;
    /** realMsg:  这里封装失败的真实原因*/
    private String realMsg;

    private String airline;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
