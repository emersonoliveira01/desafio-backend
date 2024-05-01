package com.example.desafiobackend.usecase;

import com.example.desafiobackend.entrypoint.controller.response.DetailResponse;
import com.example.desafiobackend.entrypoint.controller.response.FilmResponse;
import com.example.desafiobackend.entrypoint.controller.response.SagaResponse;
import com.example.desafiobackend.external.model.Saga;
import com.example.desafiobackend.external.repository.DetailRepository;
import com.example.desafiobackend.external.repository.FilmRepository;
import com.example.desafiobackend.external.repository.SagaRepository;
import com.example.desafiobackend.fixture.DetailFixture;
import com.example.desafiobackend.fixture.FilmFixture;
import com.example.desafiobackend.fixture.SagaFixture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SagaUseCaseTest {
    @InjectMocks
    private SagaUseCase sagaUseCase;
    @Mock
    private SagaRepository sagaRepository;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private DetailRepository detailRepository;

    @Test
    void getSaga() {
        when(sagaRepository.findAll()).thenReturn(List.of(SagaFixture.saga()));
        List<SagaResponse> sagaResponses = sagaUseCase.getSaga();
        Assertions.assertNotNull(sagaResponses);
    }

    @Test
    void getFilms() {
        when(filmRepository.findAll()).thenReturn(List.of(FilmFixture.film()));
        List<FilmResponse> films = sagaUseCase.getFilms();
        Assertions.assertNotNull(films);
    }

    @Test
    void getDetail() {
        when(detailRepository.findById(anyLong())).thenReturn(Optional.of(DetailFixture.detail()));
        DetailResponse detail = sagaUseCase.getDetail(anyLong());
        Assertions.assertNotNull(detail);
    }

    @Test
    void changeDescriptionFilm() {
        when(filmRepository.findById(anyLong())).thenReturn(Optional.of(FilmFixture.film()));
        FilmResponse filmResponse = sagaUseCase.changeDescriptionFilm(anyLong(), "descricao");
        Assertions.assertNotNull(filmResponse);
    }
}