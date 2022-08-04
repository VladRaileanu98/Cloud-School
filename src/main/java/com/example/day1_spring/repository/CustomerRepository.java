package com.example.day1_spring.repository;

import com.example.day1_spring.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public interface CustomerRepository  extends CrudRepository<Customers, Integer> {
    public Customers getById(Customers customerId);
}
