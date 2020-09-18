package com.anthony.shatdingspringbootmybatisgenerator.entity;

import java.io.Serializable;

public class CallDetails implements Serializable {
    private String sessionKey;

    private Long beginTime;

    private Byte side;

    private Short sideIndex;

    private Byte sessionAct;

    private String reslutText;

    private Integer elapsedTime;

    private static final long serialVersionUID = 1L;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Byte getSide() {
        return side;
    }

    public void setSide(Byte side) {
        this.side = side;
    }

    public Short getSideIndex() {
        return sideIndex;
    }

    public void setSideIndex(Short sideIndex) {
        this.sideIndex = sideIndex;
    }

    public Byte getSessionAct() {
        return sessionAct;
    }

    public void setSessionAct(Byte sessionAct) {
        this.sessionAct = sessionAct;
    }

    public String getReslutText() {
        return reslutText;
    }

    public void setReslutText(String reslutText) {
        this.reslutText = reslutText == null ? null : reslutText.trim();
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sessionKey=").append(sessionKey);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", side=").append(side);
        sb.append(", sideIndex=").append(sideIndex);
        sb.append(", sessionAct=").append(sessionAct);
        sb.append(", reslutText=").append(reslutText);
        sb.append(", elapsedTime=").append(elapsedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}