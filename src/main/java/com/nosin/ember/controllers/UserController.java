package com.nosin.ember.controllers;

import com.nosin.ember.models.User;
import com.nosin.ember.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private UserDao userDao;


    @RequestMapping(value="login", method = RequestMethod.GET)
    public String processLoginForm(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        model.addAttribute("title", "Ember: Login");
        model.addAttribute("username", newUser.getUsername());
        return "user/login";
    }

    @RequestMapping(value = "adduser")
    public String adduser(Model model) {

        model.addAttribute("title", "Ember: User Registration");

        return "user/adduser";
    }

    @RequestMapping(value = "adduser", method = RequestMethod.POST)
    public String adduser(Model model, @ModelAttribute User user, String verify) {
        if(verify.equals(user.getPassword())) {
            model.addAttribute("user", user);
            return "user/index";
        } else {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("title", "Ember: User Registration");
            model.addAttribute("message", "Passwords do not match");
            return "user/add";
        }
    }

}
