package com.flutter;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String string) {
        super("Product not found with id " + string);
    }
}

