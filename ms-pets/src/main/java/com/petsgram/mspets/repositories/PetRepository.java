package com.petsgram.mspets.repositories;

import com.petsgram.mspets.models.Pet;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository <Pet, String> {
    
}
