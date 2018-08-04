package com.nosin.ember.controllers;

import com.nosin.ember.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="user")
public class UserController {

    @RequestMapping(value = "adduser")
    public String adduser(Model model) {

        model.addAttribute("title", "User Signup");

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
            model.addAttribute("title", "User Registration");
            model.addAttribute("message", "Passwords do not match");
            return "user/add";
        }
    }

}
