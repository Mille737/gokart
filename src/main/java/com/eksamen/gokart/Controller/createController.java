package com.eksamen.gokart.Controller;

import com.eksamen.gokart.Model.Booking;
import com.eksamen.gokart.Model.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class createController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }
    @RequestMapping(value = "/create")
    public String create() {
        return "create";
    }

    @PostMapping("/")
    public String checkCreateBooking(@Valid Kunde kunde, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "create";
        }

        System.out.println("det virker!" + kunde.getNavn());
        return "redirect:/results";
    }
}
