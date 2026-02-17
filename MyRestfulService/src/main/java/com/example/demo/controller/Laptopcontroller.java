package com.example.demo.controller;

import com.example.demo.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptop")
public class Laptopcontroller {

    List<Laptop> laptops = new ArrayList<>();

    // Add Laptop
    @PostMapping("/add")
    public String addLaptop(@RequestBody Laptop laptop) {
        laptops.add(laptop);
        return "Laptop added successfully";
    }

    // Get all laptops
    @GetMapping("/all")
    public List<Laptop> getAllLaptops() {
        return laptops;
    }

    // Get one laptop by id
    @GetMapping("/find/{id}")
    public Laptop getLaptopById(@PathVariable int id) {
        return laptops.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Update laptop by id
    @PutMapping("/update/{id}")
    public String updateLaptop(@PathVariable int id, @RequestBody Laptop newLaptop) {
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                l.setBrand(newLaptop.getBrand());
                l.setModel(newLaptop.getModel());
                l.setPrice(newLaptop.getPrice());
                return "Laptop updated successfully";
            }
        }
        return "Laptop not found";
    }

    // Delete laptop by id
    @DeleteMapping("/delete/{id}")
    public String deleteLaptop(@PathVariable int id) {
        laptops.removeIf(l -> l.getId() == id);
        return "Laptop deleted successfully";
    }
}
