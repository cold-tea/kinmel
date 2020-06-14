package com.sandesh.kinmel.model;

import java.io.Serializable;

public class BaseFilterDetail implements Serializable {

    private BaseFilterDetailId baseFilterDetailId;
    private String code;
    private char enabled;
    private BaseFilter baseFilter;

    public BaseFilterDetail() {
    }
    public BaseFilterDetail(BaseFilterDetailId filterId, String code, char enabled) {
        this.baseFilterDetailId = filterId;
        this.code = code;
        this.enabled = enabled;
    }

    public BaseFilterDetailId getBaseFilterDetailId() {
        return baseFilterDetailId;
    }

    public void setBaseFilterDetailId(BaseFilterDetailId baseFilterDetailId) {
        this.baseFilterDetailId = baseFilterDetailId;
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

    public BaseFilter getBaseFilter() {
        return baseFilter;
    }

    public void setBaseFilter(BaseFilter baseFilter) {
        this.baseFilter = baseFilter;
    }

    @Override
    public String toString() {
        return "BaseFilterDetail{" +
                "baseFilterDetailId=" + baseFilterDetailId +
                ", code='" + code + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
