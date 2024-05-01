package com.example.desafiobackend.entrypoint.controller;

import com.example.desafiobackend.entrypoint.controller.response.DetailResponse;
import com.example.desafiobackend.entrypoint.controller.response.FilmResponse;
import com.example.desafiobackend.entrypoint.controller.response.SagaResponse;
import com.example.desafiobackend.fixture.DetailResponseFixture;
import com.example.desafiobackend.fixture.FilmResponseFixture;
import com.example.desafiobackend.fixture.SagaFixture;
import com.example.desafiobackend.fixture.SagaResponseFixture;
import com.example.desafiobackend.usecase.SagaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SagaControllerTest {
    @InjectMocks
    private SagaController sagaController;
    @Mock
    private SagaUseCase sagaUseCase;

    @Test
    void getSaga() {
        when(sagaUseCase.getSaga()).thenReturn(List.of(SagaResponseFixture.sagaResponse()));
        ResponseEntity<List<SagaResponse>> saga = sagaController.getSaga();
        assertEquals(HttpStatus.OK, saga.getStatusCode());
    }

    @Test
    void findAllFilm() {
        when(sagaUseCase.getFilms()).thenReturn(List.of(FilmResponseFixture.filmResponse()));
        ResponseEntity<List<FilmResponse>> allFilm = sagaController.findAllFilm();
        assertEquals(HttpStatus.OK, allFilm.getStatusCode());
    }

    @Test
    void getDetail() {
        when(sagaUseCase.getDetail(anyLong())).thenReturn(DetailResponseFixture.detailResponse());
        ResponseEntity<DetailResponse> response = sagaController.getDetail(anyLong());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void update() {
        when(sagaUseCase.changeDescriptionFilm(anyLong(), anyString())).thenReturn(FilmResponseFixture.filmResponse());
        ResponseEntity<FilmResponse> response = sagaController.update(anyLong(), anyString());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}