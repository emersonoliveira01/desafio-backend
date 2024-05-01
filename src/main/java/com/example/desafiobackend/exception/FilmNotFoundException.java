package com.example.desafiobackend.exception;

public class FilmNotFoundException extends RuntimeException {

    public FilmNotFoundException(String msg) {
        super(msg);
    }
}
