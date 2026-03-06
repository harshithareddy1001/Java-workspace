package com.example.controller;

import com.example.model.Band;
import com.example.model.Musician;
import com.example.repository.BandRepository;
import com.example.repository.MusicianRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicians")
public class MusicianController {

    private final MusicianRepository musicianRepository;
    private final BandRepository bandRepository;

    public MusicianController(MusicianRepository musicianRepository,
                              BandRepository bandRepository) {
        this.musicianRepository = musicianRepository;
        this.bandRepository = bandRepository;
    }

    // Create Musician and attach to Band
    @PostMapping("/band/{bandId}")
    public Musician addMusicianToBand(@PathVariable int bandId,
                                      @RequestBody Musician musician) {

        Band band = bandRepository.findById(bandId)
                .orElseThrow(() -> new RuntimeException("Band not found"));

        musician.setBand(band);

        return musicianRepository.save(musician);
    }

    // Get All Musicians
    @GetMapping
    public List<Musician> getAllMusicians() {
        return musicianRepository.findAll();
    }

    // Delete Musician
    @DeleteMapping("/{id}")
    public String deleteMusician(@PathVariable int id) {
        musicianRepository.deleteById(id);
        return "Musician deleted successfully";
    }
}
