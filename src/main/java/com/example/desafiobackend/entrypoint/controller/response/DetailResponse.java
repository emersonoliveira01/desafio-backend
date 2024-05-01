package com.example.desafiobackend.entrypoint.controller.response;

import lombok.Data;

@Data
public class DetailResponse {

    private Long id;
    private String DateCreate;
    private String duration;
    private String director;
    private String producer;
    private FilmResponse film;
}
