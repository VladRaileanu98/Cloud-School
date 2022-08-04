package com.example.day1_spring.service;

import com.example.day1_spring.model.Customers;
import com.example.day1_spring.repository.CustomerRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    //showAll
    public List<Customers> getAllCustomers(){
        List<Customers> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    //getbyid
    @Transactional
    public Customers getById(Customers customer){
        return customerRepository.findById(customer.getId()).get();
    }

    //insert
    @Transactional
    public Customers saveCustomer(Customers customer){
        Customers customerResponse = customerRepository.save(customer);
        return customerResponse;
    }

    //update
    @Transactional
    public Customers updateCustomer(Customers customer){
        Customers customerResponse =  customerRepository.save(customer);
        return customerResponse;
    }

    //delete
    @Transactional
    public void delete(Customers customer){
        customerRepository.delete(customer);
    }



    /*
    @Transactional
    public Customers getCustomersBy(int id){
        Optional<Customers> customerResponse = customerRepository.findById(id);
        return customerResponse.get();
    }
*/

}
