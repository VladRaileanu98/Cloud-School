package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Orders;
import com.example.day1_spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService ordersService;

    @GetMapping("/orders/all")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }
}

