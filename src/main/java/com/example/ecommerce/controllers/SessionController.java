package com.example.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class SessionController {

    @GetMapping
    public String login(){
        return "login";
    }

    @PostMapping
    public String logear(){
        return "index";
    }

    @PostMapping("/logout")
    public String logout(){
        return "index";
    }

    @PostMapping("/register")
    public String register(){
        return "index";
    }

    @PostMapping("/refresh")
    public String refresh(){
        return "index";
    }
}
