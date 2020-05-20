package com.sandesh.kinmel.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = UniqueUsernameValidator.class)
@Retention(RUNTIME)
@Target({ FIELD })
public @interface UniqueUsername {
    public String message() default "User already exists!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};
}
