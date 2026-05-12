package com.example.ecommerce.controllers;

import com.example.ecommerce.dtos.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SessionController {

    private String secretKey;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String logear(LoginForm form){ return "index"; }

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
