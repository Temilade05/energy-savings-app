package com.demtem.energysavings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebMainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
