package com.example.day4_springpractice.service;

import com.example.day4_springpractice.converter.ProductConverter;
import com.example.day4_springpractice.dto.ProductDTO;
import com.example.day4_springpractice.model.Product;
import com.example.day4_springpractice.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //DTO
    @Autowired
    ProductConverter productConverter;

    //save product service for DTO
    public ProductDTO saveProduct(ProductDTO productDTO){
        Product product = productConverter.convertDtoToEntity(productDTO);
        product = productRepository.save(product);
        return productConverter.convertEntityToDto(product);
    }
    //DTO

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Product product){productRepository.delete(product);}
}
