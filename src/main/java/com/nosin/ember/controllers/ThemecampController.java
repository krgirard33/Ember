package com.nosin.ember.controllers;

import com.nosin.ember.models.Themecamp;
import com.nosin.ember.models.data.ThemecampDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "themecamp")
public class ThemecampController {

    @Autowired
    private ThemecampDao themecampDao;

    @RequestMapping(value = "tcamps")
    private String viewThemecampsForm(Model model) {
        model.addAttribute("title", "Ember: Themecamps");
        model.addAttribute("camps", themecampDao.findAll());

        return "themecamp/tcamps";
    }

    @RequestMapping(value = "addthemecamp", method = RequestMethod.GET)
    public String addThemecampForm(Model model) {
        model.addAttribute("title", "Ember: Add Themecamp");
        model.addAttribute(new Themecamp());
        return "themecamp/addthemecamp";
    }

    @RequestMapping(value = "addthemecamp", method = RequestMethod.POST)
    public String addThemecampForm(Model model, @ModelAttribute @Valid Themecamp themecamp, Errors errors) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Ember: Add Themecamp");
            model.addAttribute("error", "ERROR!");
            return "redirect:themecamp/addthemecamp";
        }

        themecampDao.save(themecamp);
        return "themecamp/tcamps";
    }


}
