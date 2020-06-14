package com.sandesh.kinmel.model;

import java.io.Serializable;
import java.util.List;

public class BaseFilter extends Filter implements Serializable {
    private List<BaseFilterDetail> baseFilterDetails;

    public List<BaseFilterDetail> getBaseFilterDetails() {
        return baseFilterDetails;
    }

    public void setBaseFilterDetails(List<BaseFilterDetail> baseFilterDetails) {
        this.baseFilterDetails = baseFilterDetails;
    }
}
