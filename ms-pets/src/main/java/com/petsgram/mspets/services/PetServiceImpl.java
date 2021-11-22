package com.petsgram.mspets.services;

import com.petsgram.mspets.repositories.PetRepository;

import com.petsgram.mspets.models.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService{

    @Autowired
    private PetRepository petsRepository;

    public Pet findByUsername(String username){
        Pet pet = petsRepository.findByUsername(username);
        return pet;
    }

    @Override
    public void deletePet(String username){
        petsRepository.deleteByUsername(username);
    }
}
