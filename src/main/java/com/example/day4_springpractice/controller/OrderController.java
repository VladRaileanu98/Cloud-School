package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.converter.OrderConverter;
import com.example.day4_springpractice.dto.OrderDTO;
import com.example.day4_springpractice.model.Orders;
import com.example.day4_springpractice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    //DTO
    @Autowired
    private OrderConverter orderConverter;

    //save Order method using DTO:
    @RequestMapping(method = {POST}, path="/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public OrderDTO saveOrder(@Validated @RequestBody OrderDTO orderDTO){
        return orderService.saveOrder(orderDTO);
    }
    //DTO

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
