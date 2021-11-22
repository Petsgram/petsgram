package com.petsgram.mspets.controllers;

import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.repositories.PetRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        super();
        this.petRepository = petRepository;
    }

    @PostMapping("/pets")
    Pet newPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
}
