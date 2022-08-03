package com.example.day1_spring.repository;

import com.example.day1_spring.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository  extends CrudRepository<Customers, Integer> {
    public Customers getById(String customerId);
}
