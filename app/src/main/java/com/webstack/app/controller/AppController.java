package com.webstack.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/health")
    public String getHealth(){
        return "Healthy";
    }
}
