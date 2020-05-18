package com.sandesh.kinmel.model;

import java.io.Serializable;

public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String role;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
