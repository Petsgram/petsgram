package com.petsgram.mspets.models;

import org.springframework.data.annotation.Id;

public class Pet {

    @Id
    private String username;
    private String name;
    private PetType type;
    private String birthdate;
    private String breed;
    private String usernameOwner;
    private String image;

    public Pet(String username, String name, PetType type, String birthdate, String breed, String usernameOwner, String image) {
        this.username = username;
        this.name = name;
        this.type = type;
        this.birthdate = birthdate;
        this.breed = breed;
        this.usernameOwner = usernameOwner;
        this.image = image;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
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

    public void setImage(String fileName) {
        this.image = fileName;
    }

    public String getImage() {
        return image;
    }
}
