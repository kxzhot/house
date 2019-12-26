package com.fh.entity;

public class Admin {
    private int adminId;
    private String adminAccount;
    private String adminPassword;
    private int positionId;

    public Admin() {
    }

    public Admin(int adminId, String adminAccount, String adminPassword, int positionId) {
        this.adminId = adminId;
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
        this.positionId = positionId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
