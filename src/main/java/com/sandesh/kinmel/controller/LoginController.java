package com.sandesh.kinmel.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sandesh.kinmel.model.Status;
import com.sandesh.kinmel.model.User;
import com.sandesh.kinmel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class LoginController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String showLogin(Model model ) {
        model.addAttribute("newUser", new User());
        return "login";
    }

    @PostMapping(value = "/register")
    public String register(@Valid @ModelAttribute("newUser") User user, BindingResult bindingResult) throws JsonProcessingException {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(e -> System.out.println(e.toString()));
            return "login";
        }
        user.setPassword(encoder.encode(user.getPassword()));

        ResponseEntity<Status> responseEntity = userService.saveUser(user);
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return "redirect:/login?register";
        } else if (responseEntity.getStatusCode() == HttpStatus.BAD_REQUEST) {
            System.out.println("Some service error: " + Objects.requireNonNull(responseEntity.getBody()).getExMessage());
            return "redirect:/login?regUserExists";
        } else {
            System.out.println("Some service error: " + Objects.requireNonNull(responseEntity.getBody()).getExMessage());
            return "redirect:/login?regfailed";
        }
    }

    @GetMapping(value = "/profile")
    public String showUserProfile() {
        return "profile";
    }
}
