package com.fh.entity;

public class CharacterAndDuty {
    private int id;
    private int characterId;
    private int dutyId;

    public CharacterAndDuty() {
    }

    public CharacterAndDuty(int id, int characterId, int dutyId) {
        this.id = id;
        this.characterId = characterId;
        this.dutyId = dutyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }
}
