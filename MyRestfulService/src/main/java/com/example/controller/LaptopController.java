package com.example.controller;

import com.example.model.Laptop;
import com.example.service.LaptopService;
import com.example.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    LaptopService ls;

    // Add a new laptop
    @PostMapping("/add")
    public void add(@RequestBody Laptop lp) {
        ls.addLaptop(lp);
    }

    // Get list of laptops
    @GetMapping("/list")
    public List<Laptop> list() {
        return ls.listLaptop();
    }

    // Get a single laptop by ID
    @GetMapping("/findOne/{index}")
    public ResponseEntity<Laptop> findOne(@PathVariable int index) {
        Laptop lt = ls.findOneLaptop(index)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop id not found: " + index));
        return ResponseEntity.ok().body(lt);
    }

    // Update a laptop by ID
    @PutMapping("/update/{index}")
    public ResponseEntity<Laptop> update(@PathVariable int index, @RequestBody Laptop newLaptop) {
        Laptop lt = ls.updateLaptop(index, newLaptop)
                .orElseThrow(() -> new ResourceNotFoundException("Laptop id not found: " + index));
        return ResponseEntity.ok().body(lt);
    }

    // Delete a laptop by ID
    @DeleteMapping("/delete/{index}")
    public ResponseEntity<Void> delete(@PathVariable int index) {
        ls.deleteLaptop(index);
        return ResponseEntity.noContent().build(); // Return 204 No Content status
    }

    // Find laptops by brand
    @GetMapping("/findByBrand/{brand}")
    public List<Laptop> findByBrandName(@PathVariable String brand) {
        return ls.findByBrand(brand);
    }
}