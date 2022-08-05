package com.example.day4_springpractice.service;

import com.example.day4_springpractice.model.Orders;
import com.example.day4_springpractice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Orders> getOrders(){
        return orderRepository.findAll();
    }

    public Orders saveOrder(Orders order){
        return orderRepository.save(order);
    }
    public Orders updateOrder(Orders order){
        return orderRepository.save(order);
    }
    public void deleteOrder(Orders order){
        orderRepository.delete(order);
    }
}
