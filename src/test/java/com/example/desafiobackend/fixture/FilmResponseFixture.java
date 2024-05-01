package com.example.desafiobackend.fixture;

import com.example.desafiobackend.entrypoint.controller.response.FilmResponse;

public class FilmResponseFixture {
    public static FilmResponse filmResponse() {
        FilmResponse filmResponse = new FilmResponse();
        filmResponse.setTitle("A Ameaça Fantasma");
        filmResponse.setDescription("descricao");
        filmResponse.setVersion(1);
        return filmResponse;

    }
}
