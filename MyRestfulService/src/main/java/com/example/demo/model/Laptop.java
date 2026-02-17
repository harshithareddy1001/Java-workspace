package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor      // generates no-arg constructor
@AllArgsConstructor     // generates all-arg constructor
public class Laptop {

    private int id;
    private String brand;
    private String model;
    private double price;
}