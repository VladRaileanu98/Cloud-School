package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.model.Customer;
import com.example.day4_springpractice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerControllerHTML {
    private final CustomerService customerService;
    //get all customers
    @GetMapping("/customer/all")
    public String getCustomers(Model model){
        model.addAttribute("customerAll", customerService.getCustomers());
        return "customers";
    }
    //get customer by id
    @GetMapping("/customer/by-id/{id}")
    public String getCustomersById(Model model, @PathVariable int id){
        model.addAttribute("customerById", customerService.getCustomers().get(id));
        return "customers";
    }
    //get customer by Username

    @GetMapping("/customer/by-username/{username}")
    public String getCustomersById(Model model, @PathVariable String username){
        model.addAttribute("customerByUsername", customerService.findByUsername(username));
        return "customers";
    }

    @GetMapping("/customer/by-city/{city}")
    public String getCustomerByCity(Model model, @PathVariable String city){
        model.addAttribute("customerByCity", customerService.findByCity(city));
        return "customers";
    }

    @GetMapping("/customer/by-country/{country}")
    public String getCustomerByCountry(Model model, @PathVariable String country){
        model.addAttribute("customerByCountry", customerService.findByCountry(country));
        return "customers";
    }


}
