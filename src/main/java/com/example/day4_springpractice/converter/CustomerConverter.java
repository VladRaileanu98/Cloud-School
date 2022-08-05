package com.example.day4_springpractice.converter;

import com.example.day4_springpractice.dto.CustomerDTO;
import com.example.day4_springpractice.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    public CustomerDTO convertEntityToDto(Customer customer){
        ModelMapper modelMapper = new ModelMapper();
        CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
        return customerDTO;
    }

    public Customer convertDtoToEntity(CustomerDTO customerDTO){
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        return customer;
    }
}
