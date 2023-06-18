package com.epam.mjc.exceptions;

public class StudentNotFoundException extends IllegalArgumentException {
    
    public StudentNotFoundException(Long id) {
        super("Could not find student with ID " + id);
    }
}
