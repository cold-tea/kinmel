package com.sandesh.kinmel.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

//@ControllerAdvice
public class GlobalExHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String globalException(RuntimeException ex) {
        return "Global exception occurred: \n" + Arrays.toString(ex.getStackTrace());
    }
}
