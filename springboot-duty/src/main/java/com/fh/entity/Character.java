package com.fh.entity;

public class Character {
    private int characterId;
    private String characterName;

    public Character() {
    }

    public Character(int characterId, String characterName) {
        this.characterId = characterId;
        this.characterName = characterName;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
