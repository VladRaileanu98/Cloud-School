package com.example.day4_springpractice.repository;

import com.example.day4_springpractice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();
    List<Customer> findByUsername(String username);
    List<Customer> findByCity(String city);
    List<Customer> findByCountry(String country);
}
