package com.sunflowerclinicmassage.website.controllers;

import com.sunflowerclinicmassage.website.data.ModalityData;
import com.sunflowerclinicmassage.website.data.ProspectRepository;
import com.sunflowerclinicmassage.website.models.Prospect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private ProspectRepository prospectRepository;

    private ModalityData modalityData = new ModalityData();

    @GetMapping("")
    public String index(Model model) {
        modalityData.addModalities();
        model.addAttribute("modalities", modalityData.getAll());
        model.addAttribute(new Prospect());
        model.addAttribute("prospects", prospectRepository.findAll());
        return "index";
    }

    @PostMapping("")
    public String processNewProspect(@ModelAttribute @Valid Prospect newProspect,
                                     Errors errors, Model model) {
        if(errors.hasErrors()) {
            return "";
        }
        prospectRepository.save(newProspect);
        return "";

    }

    @GetMapping("services")
    public String services() {return "services"; }

    @GetMapping("login")
    public String login() {return "login";}

    @GetMapping("register")
    public String register() {return "register";}
}


