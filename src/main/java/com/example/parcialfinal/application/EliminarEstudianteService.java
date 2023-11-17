package com.example.parcialfinal.application;

import org.springframework.stereotype.Service;

import com.example.parcialfinal.excepcion.EstudianteNoSeEncuentraException;
import com.example.parcialfinal.infrastructure.repository.EstudianteRepositorio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EliminarEstudianteService {

    private final EstudianteRepositorio estudianteRepositorio;

    public void EliminarEstudiante(Long id){

        if (!estudianteRepositorio.existsById(id)) throw new EstudianteNoSeEncuentraException();
        estudianteRepositorio.deleteById(id);
    }


    
}
