package com.example.day4_springpractice.service;

import com.example.day4_springpractice.controller.OrderController;
import com.example.day4_springpractice.converter.OrderConverter;
import com.example.day4_springpractice.dto.OrderDTO;
import com.example.day4_springpractice.model.Orders;
import com.example.day4_springpractice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    //DTO
    @Autowired
    OrderConverter orderConverter;
    //save order seervice for DTO
    public OrderDTO saveOrder(OrderDTO orderDTO){
        Orders order = orderConverter .convertDtoToEntity(orderDTO);
        order = orderRepository.save(order);
        return orderConverter.convertEntityToDto(order);
    }

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
