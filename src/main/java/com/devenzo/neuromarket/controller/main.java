package com.devenzo.neuromarket.controller;

import com.devenzo.neuromarket.model.Brand;
import com.devenzo.neuromarket.model.Influencer;
import com.devenzo.neuromarket.repository.BrandRepository;
import com.devenzo.neuromarket.repository.InfluencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class main {
    @Autowired
    private InfluencerRepository influencerRepo;

    @Autowired
    private BrandRepository brandRepo;

    @GetMapping("/")
    public String hello() {return "hello user";}

    @GetMapping("/celeb/all")
    public List<Influencer> getAllInfluencer() {
        return influencerRepo.findAll();
    }

    @GetMapping("/celeb/{id}")
    public Optional<Influencer> getInfluencer(@PathVariable("id") int id) {
        return influencerRepo.findById(id);
    }

    @GetMapping("/brand/all")
    public List<Brand> getAllBrand() {
        return brandRepo.findAll();
    }

    @GetMapping("/brand/{id}")
    public Optional<Brand> getBrand(@PathVariable("id") int id) {
        return brandRepo.findById(id);
    }
}
