package com.devsuperior.dslist.services;

public class Exceptions {

    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
}
