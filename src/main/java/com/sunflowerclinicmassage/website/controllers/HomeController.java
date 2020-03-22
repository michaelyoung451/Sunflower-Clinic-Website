package com.sunflowerclinicmassage.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("services")
    public String services() {return "services"; }
}


