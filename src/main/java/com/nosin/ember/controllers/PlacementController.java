package com.nosin.ember.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "placement")
public class PlacementController {

    @RequestMapping(value = "places")
    private String processPlacementForm(Model model) {
        model.addAttribute("title", "Ember: Placement");
        return "placement/places";
    }
}
