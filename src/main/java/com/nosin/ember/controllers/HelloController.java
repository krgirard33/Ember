package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello Spring";
    }

    @RequestMapping(value = "helloworld")
    @ResponseBody
    public String helloworld() {
        return "Hello World";
    }
}
