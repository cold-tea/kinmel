package com.sandesh.kinmel.annotation;

import com.sandesh.kinmel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator <UniqueUsername, String> {

    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return username != null && !(userService.getUserCountByUsername(username) > 0);
    }
}
