package com.sandesh.kinmel.model;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    @NotBlank(message = "{error.category.blank}")
    private String name;
    private String description;
    private String code;
    private char enabled;
    private List<CategoryDetail> categoryDetails;

    public Category() {
    }

    public Category(String name, String description, String code, char enabled) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<CategoryDetail> getCategoryDetails() {
        return categoryDetails;
    }

    public void setCategoryDetails(List<CategoryDetail> categoryDetails) {
        this.categoryDetails = categoryDetails;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
