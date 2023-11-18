package com.example.parcialfinal.excepcion;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({EstudianteNoSeEncuentraException.class})
    public ResponseEntity<ApiError> handleEstudianteNoSeEncuentraExeptio(EstudianteNoSeEncuentraException estudianteNoSeEncuentraException){
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(ApiError.builder().mensajeError(estudianteNoSeEncuentraException.getMessage()).build());
    }
    
}
