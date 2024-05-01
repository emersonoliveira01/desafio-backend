package com.example.desafiobackend.entrypoint.controller.response;

import lombok.Data;

@Data
public class FilmResponse {
    private Long id;
    private String description;
    private String title;
    private Integer version;
    private DetailResponse detail;
}
