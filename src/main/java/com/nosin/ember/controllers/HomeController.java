package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Ember: User Login");

        return "index";
    }
}
