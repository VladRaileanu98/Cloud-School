package com.example.day4_springpractice.controller;

import com.example.day4_springpractice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class OrderControllerHTML {
    private final OrderService orderService;
    @GetMapping("/order/all")
    public String getOrders(Model model){
        model.addAttribute("orders", orderService.getOrders());
        return "orders";
    }
}
