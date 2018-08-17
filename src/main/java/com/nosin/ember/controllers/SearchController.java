package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "search")
public class SearchController {


    @RequestMapping(value = "filters")
    public String processSearchForm(Model model) {
        model.addAttribute("title", "Ember: Search");
        return "search/filters";
    }
}
