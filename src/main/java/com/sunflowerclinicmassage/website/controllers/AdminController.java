package com.sunflowerclinicmassage.website.controllers;

import com.sunflowerclinicmassage.website.data.ProspectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private ProspectRepository prospectRepository;

    @GetMapping("admin")
    public String prospects (Model model) {
        model.addAttribute("prospects", prospectRepository.findAll());
        return "/admin/index";
    }
}
