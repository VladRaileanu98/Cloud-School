package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.model.Orders;
import com.example.day4_springpractice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public List<Orders> getOrder(){
        return orderService.getOrders();
    }

    @PostMapping
    public Orders saveOrder(@RequestBody Orders order){
        return orderService.saveOrder(order);
    }

    @PutMapping
    public Orders updateOrder(@RequestBody Orders order){
        return orderService.updateOrder(order);
    }

    @DeleteMapping
    public void deleteOrder(@RequestBody Orders order){
        orderService.deleteOrder(order);
    }

}
