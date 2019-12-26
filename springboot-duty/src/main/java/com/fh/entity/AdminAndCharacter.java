package com.fh.entity;

public class AdminAndCharacter {
    private int id;
    private String adminId;
    private String characterId;

    public AdminAndCharacter() {
    }

    public AdminAndCharacter(int id, String adminId, String characterId) {
        this.id = id;
        this.adminId = adminId;
        this.characterId = characterId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }
}
