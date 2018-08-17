package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "volunteer")
public class VolunteerController {

    @RequestMapping(value = "volreg")
    private String processVolunteerForm(Model model) {
        model.addAttribute("title", "Ember: Volunteer Reg");
        return "volunteer/volreg";
    }
}
