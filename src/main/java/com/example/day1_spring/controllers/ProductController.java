package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Orders;
import com.example.day1_spring.model.Products;
import com.example.day1_spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;
    //showall
    @GetMapping("/all")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }

    //getBYid
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Products getById(@PathVariable(value="id") @RequestBody Products product){
        productService.getById(product);
        return product;
    }

    //insert/save
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Products saveOrder(@RequestBody Products product){
        Products productResponse = (Products) productService.saveProduct(product);
        return productResponse;
    }

    //update
    @PutMapping("/update")
    public Products update(@RequestBody Products product){
        productService.updateProduct(product);
        return product;
    }

    //delete
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String  delete(@PathVariable(value="id") @RequestBody Products product){
        productService.delete(product);
        return "Successfully deleted single record with id="+product.getId();
    }

}
