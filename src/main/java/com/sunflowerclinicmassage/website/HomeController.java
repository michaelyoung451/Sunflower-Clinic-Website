package com.sunflowerclinicmassage.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Main")
    public String Main() {
        return "Main";
    }
}
