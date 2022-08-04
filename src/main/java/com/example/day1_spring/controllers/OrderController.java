package com.example.day1_spring.controllers;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.model.Orders;
import com.example.day1_spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService ordersService;
    //showAll
    @GetMapping("/all")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    //getById
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Orders  getById(@PathVariable(value="id") @RequestBody Orders order){
        ordersService.getById(order);
        return order;
    }

    //insert
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Orders saveOrder(@RequestBody Orders order){
        Orders orderResponse = (Orders)ordersService.saveOrder(order);
        return orderResponse;
    }

    //update
    @PutMapping("/update")
    public Orders update(@RequestBody Orders order){
        ordersService.updateOrder(order);
        return order;
    }

    //delete
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String  delete(@PathVariable(value="id") @RequestBody Orders order){
        ordersService.delete(order);
        return "Successfully deleted single record with id="+order.getId();
    }
}

