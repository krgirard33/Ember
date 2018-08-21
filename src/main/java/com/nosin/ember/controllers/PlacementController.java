package com.nosin.ember.controllers;


import com.nosin.ember.models.Placement;
import com.nosin.ember.models.data.PlacementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "placement")
public class PlacementController {

    @Autowired
    private PlacementDao placementDao;

    @RequestMapping(value = "places", method = RequestMethod.GET)
    private String processPlacementForm(Model model) {
        model.addAttribute("title", "Ember: Places");
        model.addAttribute("places", placementDao.findAll());
        return "placement/places";
    }

    @RequestMapping(value = "addplacement", method = RequestMethod.GET)
    public String addPlace(Model model) {
        model.addAttribute("title", "Ember: Add Placement");
        model.addAttribute(new Placement());
        return "placement/addplacement";
    }

    @RequestMapping(value = "addplacement", method = RequestMethod.POST)
    public String addPlace(Model model, @ModelAttribute @Valid Placement placement, Errors errors) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Ember: Add Placement");
            model.addAttribute("error", "ERROR!");
            return "redirect:placement/addplacement";
        }

        placementDao.save(placement);
        return "placement/places";
    }
}
