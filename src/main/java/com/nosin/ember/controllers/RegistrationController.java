package com.nosin.ember.controllers;

import com.nosin.ember.models.Placement;
import com.nosin.ember.models.Registration;
import com.nosin.ember.models.Themecamp;
import com.nosin.ember.models.data.PlacementDao;
import com.nosin.ember.models.data.ThemecampDao;
import com.nosin.ember.models.data.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
@RequestMapping(value="registration")
public class RegistrationController {

    @Autowired
    RegistrationDao registrationDao;

    @Autowired
    PlacementDao placementDao;

    @Autowired
    ThemecampDao themecampDao;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String regitration(Model model) {
        model.addAttribute("title", "Ember: Register");
        model.addAttribute(new Registration());
        model.addAttribute("places", placementDao.findAll());
        model.addAttribute("camps", themecampDao.findAll());
        return "registration/register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String addAttendee(@ModelAttribute @Valid Registration newRegistration,
                              Errors errors, @RequestParam int placementId,
                              @RequestParam int themecampId, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Ember: Register");
            model.addAttribute(new Registration());
            model.addAttribute("places", placementDao.findAll());
            model.addAttribute("camps", themecampDao.findAll());
            return "registration/register";
        }

        Placement placement = placementDao.findById(placementId);
        Themecamp themecamp = themecampDao.findById(themecampId);
        newRegistration.setPlacement(placementId);
        newRegistration.setThemecamp(themecampId);
        RegistrationDao.save(newRegistration);
        return "registration/saved";

    }

    @RequestMapping(value = "searcht")
    public String search(Model model) {
        model.addAttribute("title", "Ember: Ticket Search");
        return "registration/searcht";
    }

}
