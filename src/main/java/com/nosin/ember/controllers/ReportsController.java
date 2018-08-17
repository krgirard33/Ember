package com.nosin.ember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "reports")
public class ReportsController {

    @RequestMapping(value = "report")
    public String processReportForm(Model model) {
        model.addAttribute("title", "Ember: Reports");
        return "reports/report";
    }
}
