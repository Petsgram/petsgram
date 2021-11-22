package com.petsgram.mspets.services;
import com.petsgram.mspets.models.Pet;

public interface PetService {

    public void deletePet(String username);
    public Pet findByUsername(String username);
}
