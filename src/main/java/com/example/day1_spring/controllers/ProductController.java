package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Products;
import com.example.day1_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/all")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
}
