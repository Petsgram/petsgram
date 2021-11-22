package com.petsgram.mspets.models;

public enum PetType {
    CAT("cat"), DOG("dog"), BIRD("bird"), FISH("fish"), OTHER("other");

    private String name;

    PetType(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }
}
