package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.converter.ProductConverter;
import com.example.day4_springpractice.dto.ProductDTO;
import com.example.day4_springpractice.model.Product;
import com.example.day4_springpractice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    //DTO
    @Autowired
    private ProductConverter productConverter;

    //save Product method using DTO:
    @RequestMapping(method = {POST}, path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDTO saveProduct(@Validated @RequestBody ProductDTO productDTO){
        return productService.saveProduct(productDTO);
    }
    //DTO

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }


    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody Product product){ productService.deleteProduct(product);}
}
