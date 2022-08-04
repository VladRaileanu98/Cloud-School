package com.example.day1_spring.repository;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

    public Orders getById(Orders orderId);
    public List<Orders> findAll();


}
