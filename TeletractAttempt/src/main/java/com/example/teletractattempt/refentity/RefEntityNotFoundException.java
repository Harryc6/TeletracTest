package com.example.teletractattempt.refentity;

public class RefEntityNotFoundException extends RuntimeException {

    public RefEntityNotFoundException(Long id) {
        super("Could not find reference entity " + id);
    }

}
