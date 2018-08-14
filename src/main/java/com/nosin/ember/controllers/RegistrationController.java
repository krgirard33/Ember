package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="registration")
public class RegistrationController {

    @RequestMapping(value = "register")
    public String regitration(Model model) {
        model.addAttribute("title", "Ember: Register");
        return "registration/register";
    }

    @RequestMapping(value = "searcht")
    public String search(Model model) {
        model.addAttribute("title", "Ember: Ticket Search");
        return "registration/searcht";
    }

}
