package com.petsgram.mspets.repositories;

import com.petsgram.mspets.models.Pet;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetRepository extends MongoRepository <Pet, String> {
    List<Pet> findByUsernameOwner (String usernameOwner);
}
