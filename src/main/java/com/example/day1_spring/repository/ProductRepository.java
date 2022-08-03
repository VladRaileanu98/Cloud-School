package com.example.day1_spring.repository;

import com.example.day1_spring.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Products, Integer> {

    public Products getById(String productId);
    public void delete(Products product);
}
