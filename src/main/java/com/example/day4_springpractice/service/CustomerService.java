package com.example.day4_springpractice.service;

import com.example.day4_springpractice.model.Customer;
import com.example.day4_springpractice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public List<Customer> findByUsername(String username){
        return customerRepository.findByUsername(username);
    }
    public List<Customer> findByCity(String city){
        return customerRepository.findByCity(city);
    }
    public List<Customer> findByCountry(String country){
        return customerRepository.findByCountry(country);
    }
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer){
        customerRepository.delete(customer);
    }
}
