package com.example.controller;

import com.example.model.Band;
import com.example.repository.BandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bands")
public class BandController {

    private final BandRepository bandRepository;

    public BandController(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    // Create Band
    @PostMapping
    public Band createBand(@RequestBody Band band) {
        return bandRepository.save(band);
    }

    // Get All Bands
    @GetMapping
    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    // Get Band By Id
    @GetMapping("/{id}")
    public Band getBandById(@PathVariable int id) {
        return bandRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Band not found"));
    }

    // Delete Band
    @DeleteMapping("/{id}")
    public String deleteBand(@PathVariable int id) {
        bandRepository.deleteById(id);
        return "Band deleted successfully";
    }
}
