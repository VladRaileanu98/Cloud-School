package com.example.day4_springpractice.controller;


import com.example.day4_springpractice.converter.CustomerConverter;
import com.example.day4_springpractice.dto.CustomerDTO;
import com.example.day4_springpractice.model.Customer;
import com.example.day4_springpractice.service.CustomerService;
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
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;

    //DTO
    @Autowired
    private CustomerConverter customerConverter;

    //save Customer method using DTO:
    @RequestMapping(method = {POST}, path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO saveCustomer(@Validated @RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }
    //DTO

    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getCustomers();
    }

    @GetMapping("/username")
    public List<Customer> findByUsername(String username){
        return customerService.findByUsername(username);
    }

    @GetMapping("/city")
    public List<Customer> findByCity(String city){
        return customerService.findByCity(city);
    }
    @GetMapping("/country")
    public List<Customer> findByCountry(String country){
        return customerService.findByCountry(country);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }
}
