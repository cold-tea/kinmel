package com.sandesh.kinmel.controller;

import com.sandesh.kinmel.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AttributeAdvice {

    @ModelAttribute
    public void newUser(Model model) {
        model.addAttribute(new User());
    }
}
