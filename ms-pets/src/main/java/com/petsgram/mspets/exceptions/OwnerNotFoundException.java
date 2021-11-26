package com.petsgram.mspets.exceptions;

public class OwnerNotFoundException extends RuntimeException{
    public OwnerNotFoundException(String message) {
        super(message);        
    }
}
