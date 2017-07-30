package org.myapp.jboss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MainController {

    @Value("${application.message}")
    private String message;

    @GetMapping("/")
    public String welcome(Model model) {
        System.out.println("came in");
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        System.out.println("testing");
        return "welcome";
    }
}
