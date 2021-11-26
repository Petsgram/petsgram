package com.petsgram.mspets.controllers;

import com.petsgram.mspets.exceptions.OwnerNotFoundException;
import com.petsgram.mspets.exceptions.PetNotFoundException;
import com.petsgram.mspets.models.Pet;
import com.petsgram.mspets.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String deletePet(@PathVariable String username) {
        Pet pet = petRepository.findById(username).orElse(null);
        if (pet == null) throw new PetNotFoundException("Mascota no encontrada con el username: " + username);
        petRepository.delete(pet);
        return "La mascota se ha eliminado";
    }

    @PutMapping("/pets")
    Pet updatePet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    @GetMapping("/pets/{username}")
    public Pet getPet(@PathVariable String username) {
        Pet pet = petRepository.findById(username).orElse(null);
        if (pet == null) throw new PetNotFoundException("Mascota no encontrada");
        return pet;
    }

    @GetMapping("/pets/my/{usernameOwner}")
    public List<Pet> getMyPet(@PathVariable String usernameOwner) {
        List<Pet> pets = petRepository.findByUsernameOwner(usernameOwner);
        if (pets == null)
            throw new OwnerNotFoundException("No se encontró propietario con el usuario: " + usernameOwner);
        return pets;
    }
}