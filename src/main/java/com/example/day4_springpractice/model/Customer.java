package com.example.day4_springpractice.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String username;
    @NotNull
    private String city;
    @NotNull
    private String country;
}
