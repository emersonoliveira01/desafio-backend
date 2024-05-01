package com.example.desafiobackend.entrypoint.controller.response;

import lombok.Data;

import java.util.List;

@Data
public class SagaResponse {
    private Long id;
    private String name;
    private List<FilmResponse> films;
}
