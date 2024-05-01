package com.example.desafiobackend.fixture;

import com.example.desafiobackend.external.model.Saga;

import java.util.List;

public class SagaFixture {
    public static Saga saga() {
        Saga saga = new Saga();
        saga.setId(1L);
        saga.setName("Star Wars");
        saga.setFilms(List.of());
        return saga;
    }
}
