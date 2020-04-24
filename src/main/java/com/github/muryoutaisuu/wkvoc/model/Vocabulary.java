package com.github.muryoutaisuu.wkvoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vocabulary {

    private final int id;
    private final String url;
    private final int level;
    private final String documenturl;
    private final String characters;
    private final String[] meanings;
    private final String[] readings;

    public Vocabulary(@JsonProperty("id") int id,
    @JsonProperty("url") String url,
    @JsonProperty("level") int level,
    @JsonProperty("documenturl") String documenturl,
    @JsonProperty("characters") String characters,
    @JsonProperty("meanings") String[] meanings,
    @JsonProperty("readings") String[] readings) {
        this.id = id;
        this.url = url;
        this.level = level;
        this.documenturl = documenturl;
        this.characters = characters;
        this.meanings = meanings;
        this.readings = readings;
    }

    public int getId() {
        return this.id;
    }


    public String getUrl() {
        return this.url;
    }


    public int getLevel() {
        return this.level;
    }


    public String getDocumenturl() {
        return this.documenturl;
    }


    public String getCharacters() {
        return this.characters;
    }


    public String[] getMeanings() {
        return this.meanings;
    }


    public String[] getReadings() {
        return this.readings;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", url='" + getUrl() + "'" +
            ", level='" + getLevel() + "'" +
            ", documenturl='" + getDocumenturl() + "'" +
            ", characters='" + getCharacters() + "'" +
            ", meanings='" + getMeanings() + "'" +
            ", readings='" + getReadings() + "'" +
            "}";
    }

}