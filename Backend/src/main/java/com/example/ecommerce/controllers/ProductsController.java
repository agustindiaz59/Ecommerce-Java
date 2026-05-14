package com.example.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String listAllProducts(){
        return "products";
    }

    @GetMapping("/{id}")
    public String product(
            @PathVariable  String id,
            Model model
    ){
        model.addAttribute(id, "abc");
        return "productDetails";
    }

    @GetMapping("/cart")
    public String cart(
    ){

        return "cart";
    }

}
