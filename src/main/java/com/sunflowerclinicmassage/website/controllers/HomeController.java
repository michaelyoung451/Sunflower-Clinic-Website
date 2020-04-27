package com.sunflowerclinicmassage.website.controllers;

import com.sunflowerclinicmassage.website.models.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private Schedule schedule;

    @GetMapping("")
    public String index(Model model) {

        return "index";
    }

    @GetMapping("services")
    public String services() {return "services"; }
}


