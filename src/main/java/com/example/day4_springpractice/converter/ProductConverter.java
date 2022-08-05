package com.example.day4_springpractice.converter;

import com.example.day4_springpractice.dto.ProductDTO;
import com.example.day4_springpractice.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class ProductConverter {
    public ProductDTO convertEntityToDto(Product product){
        ModelMapper modelMapper = new ModelMapper();
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }

    public Product convertDtoToEntity(ProductDTO productDTO){
        ModelMapper modelMapper = new ModelMapper();
        Product product = modelMapper.map(productDTO, Product.class);
        return product;
    }
}
