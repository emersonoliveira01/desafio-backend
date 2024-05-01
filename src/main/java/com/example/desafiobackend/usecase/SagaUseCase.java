package com.example.desafiobackend.usecase;

import com.example.desafiobackend.entrypoint.controller.response.DetailResponse;
import com.example.desafiobackend.entrypoint.controller.response.FilmResponse;
import com.example.desafiobackend.entrypoint.controller.response.SagaResponse;
import com.example.desafiobackend.exception.DetailNotFoundException;
import com.example.desafiobackend.exception.FilmNotFoundException;
import com.example.desafiobackend.external.model.Detail;
import com.example.desafiobackend.external.model.Film;
import com.example.desafiobackend.external.model.Saga;
import com.example.desafiobackend.external.repository.DetailRepository;
import com.example.desafiobackend.external.repository.FilmRepository;
import com.example.desafiobackend.external.repository.SagaRepository;
import com.example.desafiobackend.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SagaUseCase {
    private final SagaRepository sagaRepository;
    private final FilmRepository filmRepository;
    private final DetailRepository detailRepository;
    public List<SagaResponse> getSaga() {
        List<Saga> starWars = sagaRepository.findAll();
        return Mapper.mapperList(starWars, SagaResponse.class);
    }
    public List<FilmResponse> getFilms() {
        List<Film> films = filmRepository.findAll();
        return Mapper.mapperList(films, FilmResponse.class);
    }
    public DetailResponse getDetail(Long filmID) {
        Optional<Detail> byId = detailRepository.findById(filmID);
        if (byId.isPresent()) {
            return Mapper.mapper(byId.get(), DetailResponse.class);
        }
        throw new DetailNotFoundException("Detalhe do filme não encontrado.");
    }
    public FilmResponse changeDescriptionFilm(Long id, String description) {

        Optional<Film> byId = filmRepository.findById(id);

        if (byId.isPresent()) {
            Film movie = byId.get();
            movie.setDescription(description);
            Integer version = incrementVersion(movie.getVersion());
            movie.setVersion(version);
            filmRepository.save(movie);
            return Mapper.mapper(movie, FilmResponse.class);
        }

        throw new FilmNotFoundException("Filme não encontrado.");
    }
    private Integer incrementVersion(Integer version) {
       return version + 1;
    }
}
