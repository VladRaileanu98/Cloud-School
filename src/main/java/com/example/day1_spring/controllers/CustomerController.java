package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/customers")
public class CustomerController {
    //get all
    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    public List<Customers> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //getbyid
    @GetMapping("/get/{username}")
    public String getByUsername(@PathVariable(value="username") String username){
        return username;
    }
}
