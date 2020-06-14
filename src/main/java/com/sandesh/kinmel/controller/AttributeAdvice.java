package com.sandesh.kinmel.controller;

import com.sandesh.kinmel.model.User;
import com.sandesh.kinmel.service.BaseFilterService;
import com.sandesh.kinmel.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class AttributeAdvice {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BaseFilterService baseFilterService;

    @ModelAttribute
    public void newUser(Model model) {
        model.addAttribute(new User());
    }

    @ModelAttribute
    public void categories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
    }

    @ModelAttribute
    public void baseFilters(Model model) {
        model.addAttribute("baseFilters", baseFilterService.getAllBaseFilters());
    }
}
