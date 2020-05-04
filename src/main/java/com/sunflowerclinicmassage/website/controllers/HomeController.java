package com.sunflowerclinicmassage.website.controllers;

import com.sunflowerclinicmassage.website.data.ModalityData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("modalities", ModalityData.getAll());
        return "index";
    }

    @GetMapping("services")
    public String services() {return "services"; }

    @GetMapping("login")
    public String login() {return "login";}

    @GetMapping("register")
    public String register() {return "register";}
}


