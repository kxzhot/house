package com.fh.entity;

public class Duty {
    private int dutyId;
    private String dutyUrl;
    private String dutyDescribe;

    public Duty() {
    }

    public Duty(int dutyId, String dutyUrl, String dutyDescribe) {
        this.dutyId = dutyId;
        this.dutyUrl = dutyUrl;
        this.dutyDescribe = dutyDescribe;
    }

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    public String getDutyUrl() {
        return dutyUrl;
    }

    public void setDutyUrl(String dutyUrl) {
        this.dutyUrl = dutyUrl;
    }

    public String getDutyDescribe() {
        return dutyDescribe;
    }

    public void setDutyDescribe(String dutyDescribe) {
        this.dutyDescribe = dutyDescribe;
    }
}
