package com.example.day1_spring.service;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.model.Orders;
import com.example.day1_spring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;
    //showAll
    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    //getbyid
    @Transactional
    public Orders getById(Orders order){
        return orderRepository.findById(order.getId()).get();
    }

    //insert
    @Transactional
    public Orders saveOrder(Orders order){
        Orders orderResponse = orderRepository.save(order);
        return orderResponse;
    }

    //update
    @Transactional
    public Orders updateOrder(Orders order){
        Orders orderResponse =  orderRepository.save(order);
        return orderResponse;
    }

    //delete
    @Transactional
    public void delete(Orders order){
        orderRepository.delete(order);
    }
}
