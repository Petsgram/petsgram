package com.petsgram.mspets.controllers;

import com.petsgram.mspets.exceptions.PetNotfoundException;

import java.util.List;

import com.petsgram.mspets.exceptions.OwnerNotfoundException;
import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.repositories.PetRepository;


import org.springframework.web.bind.annotation.*;

@RestController
public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
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
            throw new PetNotFoundException("Mascota no encontrada con el username: " + username);
        }
        petRepository.delete(pet);
        
        return "La mascota se ha eliminado";
    }
    @PutMapping("/pets")
    Pet updatePet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    @GetMapping("/pets/{username}")
    public Pet getPet(@PathVariable String username){
        Pet pet = petRepository.findById(username).orElse(null);

        if (pet == null){
            throw new PetNotFoundException("Mascota no encontrada");
        }
        return pet;
    
    }

    @GetMapping("/pets/{usernameOwner}")
    public Pet getMyPet(@Pathvariable String usernameOwner){
        List<Pet> pets = petRepository.findByUsernameOwner(usernameOwner).orElse(null);

        if (pets == null ){
            throw new OwnerNotFoundException("No se encontró propietario con el usuario"+ usernameOwner);
        }
        return pets;

    }



    

}
