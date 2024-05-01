package com.example.desafiobackend.fixture;

import com.example.desafiobackend.external.model.Film;

public class FilmFixture {
    public static Film film() {
        Film film = new Film();
        film.setTitle("A Ameaça Fantasma");
        film.setDescription("descricao");
        film.setVersion(1);
        return film;
    }
}
