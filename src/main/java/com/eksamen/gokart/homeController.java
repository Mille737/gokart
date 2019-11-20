package com.eksamen.gokart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping (value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping (value = "/home")
    public String homeLogo() {
        return "home";
    }
}
