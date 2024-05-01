package com.example.desafiobackend.fixture;

import com.example.desafiobackend.entrypoint.controller.response.SagaResponse;

import java.util.List;
public class SagaResponseFixture {
    public static SagaResponse sagaResponse() {
        SagaResponse sagaResponse = new SagaResponse();
        sagaResponse.setId(1L);
        sagaResponse.setName("Star Wars");
        sagaResponse.setFilms(List.of());
        return sagaResponse;
    }
}
