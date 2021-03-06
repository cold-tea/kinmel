package com.sandesh.kinmel.model;

import java.io.Serializable;

public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    private String role;
    private User user;

    public Authority() {}
    public Authority(String role) {
        this.role = role;
    }
    public Authority(String role, User user) {
        this (role);
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
