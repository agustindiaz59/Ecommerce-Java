package com.example.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/")
    public String inicio(){
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "adminDashboard";
    }


    //Funciones del apartado Dashboard

    @GetMapping("/products")
    public String products(){
        return "admin/products";
    }

    @GetMapping("/pedidos")
    public String pedidos(){
        return "admin/pedidos";
    }

    @GetMapping("/categorias")
    public String categorias(){
        return "admin/categorias";
    }

    @GetMapping("/ventas")
    public String ventas(){
        return "admin/ventas";
    }

    @GetMapping("/users")
    public String users(){
        return "admin/usuarios";
    }

}
