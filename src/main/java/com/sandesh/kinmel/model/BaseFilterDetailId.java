package com.sandesh.kinmel.model;

import java.io.Serializable;

public class BaseFilterDetailId implements Serializable {
    private String name;
    private String baseName;

    public BaseFilterDetailId () {}
    public BaseFilterDetailId(String name, String baseName) {
        this.name = name;
        this.baseName = baseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Override
    public String toString() {
        return "BaseFilterDetailId{" +
                "name='" + name + '\'' +
                ", baseName='" + baseName + '\'' +
                '}';
    }
}
