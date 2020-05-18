package com.sandesh.kinmel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @GetMapping(value = "/home")
    public String goHome() {
        return "index";
    }
}
