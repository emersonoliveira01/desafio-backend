package com.example.desafiobackend.exception;

public class DetailNotFoundException extends RuntimeException {
    public DetailNotFoundException(String msg) {
        super(msg);
    }
}
