package com.example.day1_spring.service;

import com.example.day1_spring.model.Orders;
import com.example.day1_spring.model.Products;
import com.example.day1_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    //showalll;
    public List<Products> getAllProducts(){
        List<Products> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    //getbyID
    @Transactional
    public Products getById(Products product){
        return productRepository.findById(product.getId()).get();
    }

    //insert
    @Transactional
    public Products saveProduct(Products product){
        Products productResponse = productRepository.save(product);
        return productResponse;
    }

    //update
    @Transactional
    public Products updateProduct(Products product){
        Products productResponse =  productRepository.save(product);
        return productResponse;
    }

    //delete
    @Transactional
    public void delete(Products product){
        productRepository.delete(product);
    }
}
