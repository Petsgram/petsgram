package com.petsgram.mspets.controllers;

import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.repositories.PetRepository;
import com.petsgram.mspets.services.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @Autowired
    private PetService petService;

    @DeleteMapping("/pets/{username}")
    public String deletePet(@PathVariable String username){
        Pet pet = petService.findByUsername(username);

        if(pet == null){
            throw new RuntimeException("Mascota no encontrada");
        }

        petService.deletePet(username);

        return "Mascota eliminada";
    }
}
