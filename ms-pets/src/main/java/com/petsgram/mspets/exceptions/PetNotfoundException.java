package com.petsgram.mspets.exceptions;

public class PetNotFoundException extends RuntimeException{
    public PetNotFoundException(String message) {
        super(message);        
    }
}


