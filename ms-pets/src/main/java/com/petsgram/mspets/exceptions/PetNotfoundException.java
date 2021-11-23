package com.petsgram.mspets.exceptions;

public class PetNotfoundException extends RuntimeException{
    public PetNotfoundException(String message) {
        super(message);        
    }
}
