package com.eksamen.gokart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class readController {
    @RequestMapping(value = "/read")
    public String read() {
        return "read";
    }
}
