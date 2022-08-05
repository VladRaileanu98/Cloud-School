package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.model.Product;
import com.example.day4_springpractice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductControllerHTML {
    private final ProductService productService;
    //get all
    @GetMapping("/product/all")
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        return "products";
    }
    //get by id
    @GetMapping("/product/by-id/{id}")
    public String getProductsById(Model model, @PathVariable int id){
        model.addAttribute("prod", productService.getProducts().get(id));
        return "products";
    }

}