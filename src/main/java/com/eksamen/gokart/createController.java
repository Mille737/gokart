package com.eksamen.gokart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class createController {
    @RequestMapping(value = "/create")
    public String create() {
        return "create";
    }
}
