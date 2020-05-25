package com.sandesh.kinmel.model;

import com.sandesh.kinmel.annotation.UniqueEmail;
import com.sandesh.kinmel.annotation.UniqueUsername;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(min = 5 , max = 10, message = "{error.username.size}")
    //@UniqueUsername
    private String username;
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{3,}$",
            message = "{error.password.pattern}")
    private String password;
    private char enabled;


    @Pattern(regexp = "[a-zA-Z]{2,40}", message = "{error.only.alphabets}")
    private String firstName;
    @Pattern(regexp = "[a-zA-Z]{2,40}", message = "{error.only.alphabets}")
    private String lastName;
    @Email(message = "{error.email.format}")
    @UniqueEmail
    private String email;
    @Size
    private String phone;
    @Size(min = 10, max = 10, message = "{error.mobile.size}")
    private String mobile;
    private String address;
    private Date registerDate;

    private List<Authority> authorities;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getEnabled() {
        return enabled;
    }

    public void setEnabled(char enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
