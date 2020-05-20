package com.sandesh.kinmel.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sandesh.kinmel.model.Status;
import com.sandesh.kinmel.model.User;
import com.sandesh.kinmel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class LoginController {

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
            System.out.println("Some service error: " + Objects.requireNonNull(responseEntity.getBody()).getMessage());
            return "redirect:/login?regUserExists";
        } else {
            System.out.println("Some service error: " + Objects.requireNonNull(responseEntity.getBody()).getExMessage());
            return "redirect:/login?regfailed";
        }

    }
}
