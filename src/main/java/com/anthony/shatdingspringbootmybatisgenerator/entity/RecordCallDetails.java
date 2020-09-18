package com.anthony.shatdingspringbootmybatisgenerator.entity;

import java.io.Serializable;
import java.util.Date;

public class RecordCallDetails implements Serializable {
    private String sessionKey;

    private Byte sessionSource;

    private Date sessionBeginTime;

    private String externalNo;

    private String internalNo;

    private String seatNumber;

    private Byte direction;

    private String tenantId;

    private String groupId;

    private String taskId;

    private Byte sessionStatus;

    private Byte sessionReslut;

    private Long duration;

    private Byte failureCause;

    private String taskKey;

    private String recordUrl;

    private static final long serialVersionUID = 1L;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    public Byte getSessionSource() {
        return sessionSource;
    }

    public void setSessionSource(Byte sessionSource) {
        this.sessionSource = sessionSource;
    }

    public Date getSessionBeginTime() {
        return sessionBeginTime;
    }

    public void setSessionBeginTime(Date sessionBeginTime) {
        this.sessionBeginTime = sessionBeginTime;
    }

    public String getExternalNo() {
        return externalNo;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo == null ? null : externalNo.trim();
    }

    public String getInternalNo() {
        return internalNo;
    }

    public void setInternalNo(String internalNo) {
        this.internalNo = internalNo == null ? null : internalNo.trim();
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber == null ? null : seatNumber.trim();
    }

    public Byte getDirection() {
        return direction;
    }

    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Byte getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(Byte sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public Byte getSessionReslut() {
        return sessionReslut;
    }

    public void setSessionReslut(Byte sessionReslut) {
        this.sessionReslut = sessionReslut;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Byte getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(Byte failureCause) {
        this.failureCause = failureCause;
    }

    public String getTaskKey() {
        return taskKey;
    }

    public void setTaskKey(String taskKey) {
        this.taskKey = taskKey == null ? null : taskKey.trim();
    }

    public String getRecordUrl() {
        return recordUrl;
    }

    public void setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl == null ? null : recordUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sessionKey=").append(sessionKey);
        sb.append(", sessionSource=").append(sessionSource);
        sb.append(", sessionBeginTime=").append(sessionBeginTime);
        sb.append(", externalNo=").append(externalNo);
        sb.append(", internalNo=").append(internalNo);
        sb.append(", seatNumber=").append(seatNumber);
        sb.append(", direction=").append(direction);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", groupId=").append(groupId);
        sb.append(", taskId=").append(taskId);
        sb.append(", sessionStatus=").append(sessionStatus);
        sb.append(", sessionReslut=").append(sessionReslut);
        sb.append(", duration=").append(duration);
        sb.append(", failureCause=").append(failureCause);
        sb.append(", taskKey=").append(taskKey);
        sb.append(", recordUrl=").append(recordUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}