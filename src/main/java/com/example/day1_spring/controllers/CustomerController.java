package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.service.CustomerService;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //showAll
    @GetMapping("/all")
    public List<Customers> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //getbyid
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String  getById(@PathVariable(value="id") @RequestBody Customers customer){
        customerService.getById(customer);
        return "Successfully got single record with id="+customer.getId()+ customerService.getById(customer);
    }

    //insert
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Customers saveCustomer(@RequestBody Customers customer){
        Customers customerResponse = (Customers)customerService.saveCustomer(customer);
        return customerResponse;
    }

    //update
    @PutMapping("/update")
    public Customers update(@RequestBody Customers customer){
        customerService.updateCustomer(customer);
        return customer;
    }

    //delete
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String  delete(@PathVariable(value="id") @RequestBody Customers customer){
        customerService.delete(customer);
        return "Successfully deleted single record with id="+customer.getId();
    }
}
