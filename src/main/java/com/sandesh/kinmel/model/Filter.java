package com.sandesh.kinmel.model;

import java.io.Serializable;

public abstract class Filter implements Serializable {

    private String name;
    private String code;
    private char enabled;

    public Filter() {}

    public Filter(String name, String code, char enabled) {
        this.name = name;
        this.code = code;
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public char getEnabled() {
        return enabled;
    }

    public void setEnabled(char enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
