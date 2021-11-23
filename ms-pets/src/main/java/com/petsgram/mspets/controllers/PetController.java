package com.petsgram.mspets.controllers;

import com.petsgram.mspets.exceptions.PetNotfoundException;
import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.repositories.PetRepository;

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

    @DeleteMapping("/pets/{username}")
    public String deletePet(@PathVariable String username){
        Pet pet = petRepository.findById(username).orElse(null);;
        if(pet == null){
            throw new PetNotfoundException("Mascota no encontrada con el username: " + username);
        }
        petRepository.delete(pet);
        
        return "La mascota se ha eliminado";
    }
}
