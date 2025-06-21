package com.example.upfsda_security_monitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping(path = "/")
    public String goToHomePage() {
        return "redirect:/upfsdaMonitoring/login";
    }
}
