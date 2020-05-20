package com.sandesh.kinmel.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExHandler {

    @ExceptionHandler(RuntimeException.class)
    public String globalException(RuntimeException ex, Model model) {
        ex.printStackTrace();
        model.addAttribute("message", ex.getMessage());
        return "error";
    }
}
