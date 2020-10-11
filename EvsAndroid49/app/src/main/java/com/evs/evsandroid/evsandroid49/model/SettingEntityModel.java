package com.evs.evsandroid.evsandroid49.model;

/**
 * Created by AQIB JAVED on 10/11/2020.
 */

public class SettingEntityModel {
    private int imageSrc;
    private String value;

    public SettingEntityModel(int imageSrc, String value) {
        this.imageSrc = imageSrc;
        this.value = value;
    }

    public SettingEntityModel() {
        this(0, null);
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public String getValue() {
        return value;
    }
}
