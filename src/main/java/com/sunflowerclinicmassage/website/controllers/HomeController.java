package com.sunflowerclinicmassage.website.controllers;

import com.sunflowerclinicmassage.website.data.ModalityData;
import com.sunflowerclinicmassage.website.data.ProspectRepository;
import com.sunflowerclinicmassage.website.models.InfoRequestEmail;
import com.sunflowerclinicmassage.website.models.Prospect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private InfoRequestEmail infoRequestEmail;

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

    @PostMapping("index")
    public String processNewProspect(@ModelAttribute @Valid Prospect newProspect,
                                     Errors errors, Model model) throws MessagingException {

        if(errors.hasErrors()) {
            return "";
        }
        prospectRepository.save(newProspect);
        String to = "sunflowerclinicmassage@gmail.com";
        String from = newProspect.getEmail();
        String requester = newProspect.getName();
        String subject = "Information Request for " + newProspect.getName();
        String body = requester + " would like more information.\n\nPhone Number: " + newProspect.getPhoneNumber() + "\nEmail: " + newProspect.getEmail();

        infoRequestEmail.sendRequestEmail(to, from, subject, body);
        return "redirect:";

    }

    @GetMapping("services")
    public String services() {return "services"; }

    @GetMapping("login")
    public String login() {return "login";}

    @GetMapping("register")
    public String register() {return "register";}
}


