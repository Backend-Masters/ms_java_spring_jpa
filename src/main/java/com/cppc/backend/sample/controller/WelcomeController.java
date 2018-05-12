package com.cppc.backend.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcome(){
        System.out.println("ddd");
        return "index.html";
    }
}
