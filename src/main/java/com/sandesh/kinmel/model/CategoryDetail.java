package com.sandesh.kinmel.model;

import java.io.Serializable;

public class CategoryDetail implements Serializable {
    private CategoryDetailId categoryDetailId;
    private String description;
    private String code;
    private char enabled;
    private Category category;

    public CategoryDetail() {}
    public CategoryDetail(CategoryDetailId categoryDetailId, String description, String code, char enabled) {
        this.categoryDetailId = categoryDetailId;
        this.description = description;
        this.code = code;
        this.enabled = enabled;
    }

    public CategoryDetailId getCategoryDetailId() {
        return categoryDetailId;
    }

    public void setCategoryDetailId(CategoryDetailId categoryDetailId) {
        this.categoryDetailId = categoryDetailId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CategoryDetail{" +
                "categoryDetailId=" + categoryDetailId +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
