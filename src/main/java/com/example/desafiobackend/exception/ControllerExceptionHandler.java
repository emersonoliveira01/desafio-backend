package com.example.desafiobackend.exception;

import com.example.desafiobackend.exception.entities.ErrorData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({DetailNotFoundException.class})
    public ResponseEntity<Object> handlerDetailNotFoundException(final DetailNotFoundException exception) {
        ErrorData errorData = ErrorData.of(HttpStatus.NOT_FOUND.name(), exception.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(errorData.getCode()).body(errorData);
    }

    @ExceptionHandler({FilmNotFoundException.class})
    public ResponseEntity<Object> handlerFilmNotFoundException(final FilmNotFoundException exception) {
        ErrorData errorData = ErrorData.of(HttpStatus.NOT_FOUND.name(), exception.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(errorData.getCode()).body(errorData);
    }
}
