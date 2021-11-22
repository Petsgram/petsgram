package com.petsgram.mspets.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Pet {

    @Id
    private String username;
    private String name;
    private PetType type;
    private Date birthdate;
    private String breed;
    private String usernameOwner;

    public Pet(String username, String name, PetType type, Date birthdate, String breed, String usernameOwner) {
        this.username = username;
        this.name = name;
        this.type = type;
        this.birthdate = birthdate;
        this.breed = breed;
        this.usernameOwner = usernameOwner;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getUsernameOwner() {
        return usernameOwner;
    }

    public void setUsernameOwner(String usernameOwner) {
        this.usernameOwner = usernameOwner;
    }
}
