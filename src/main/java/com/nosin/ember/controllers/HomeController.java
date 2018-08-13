package com.nosin.ember.controllers;

import com.nosin.ember.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = {"", "/index"})
    public String index(Model model) {

        model.addAttribute("title", "Ember: Home");

        return "index";
    }
}
