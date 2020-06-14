package com.sandesh.kinmel.annotation;

import com.sandesh.kinmel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator  implements ConstraintValidator <UniqueEmail, String>  {


    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email == null || !(userService.getUserCountByEmail(email) > 0);
    }
}
