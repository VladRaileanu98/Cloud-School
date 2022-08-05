package com.example.day4_springpractice.repository;

import com.example.day4_springpractice.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
    List<Orders> findAll();
}
