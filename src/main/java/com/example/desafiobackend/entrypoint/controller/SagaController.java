package com.example.desafiobackend.entrypoint.controller;

import com.example.desafiobackend.entrypoint.controller.response.DetailResponse;
import com.example.desafiobackend.entrypoint.controller.response.FilmResponse;
import com.example.desafiobackend.entrypoint.controller.response.SagaResponse;
import com.example.desafiobackend.usecase.SagaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SagaController {
    private final SagaUseCase sagaUseCase;
    @GetMapping("/saga")
    public ResponseEntity<List<SagaResponse>> getSaga() {
        return ResponseEntity.ok(sagaUseCase.getSaga());
    }
    @GetMapping("/films")
    public ResponseEntity<List<FilmResponse>> findAllFilm() {
        return ResponseEntity.ok(sagaUseCase.getFilms());
    }
    @GetMapping("/films/detail/{id}")
    public ResponseEntity<DetailResponse> getDetail(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(sagaUseCase.getDetail(id));
    }
    @PutMapping("/film/{id}")
    public ResponseEntity<FilmResponse> update(@PathVariable(value = "id") Long id,
                                               @RequestParam String description) {
        return ResponseEntity.ok(sagaUseCase.changeDescriptionFilm(id, description));
    }
}
