package com.sandesh.kinmel.controller;

import com.sandesh.kinmel.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class BaseController {

    @GetMapping(value = {"/home", "/"})
    public String goHome(@SessionAttribute(value = "loggedUser") User user) {
        return "index";
    }
}
