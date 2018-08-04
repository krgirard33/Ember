package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.nosin.ember.models.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {
    @RequestMapping(value = "")
    /**@ResponseBody
    public String index() {
        return "Hello Spring";
    }**/
    public String index(Model model) {

            model.addAttribute("title", "User Signup");

            return "index";
    }

    @RequestMapping(value = "helloworld")
    @ResponseBody
    public String helloworld() {
        return "Hello World the other";
    }
}
