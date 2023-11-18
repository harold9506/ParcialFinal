package com.example.parcialfinal.application;

import org.springframework.stereotype.Service;

import com.example.parcialfinal.excepcion.EstudianteNoSeEncuentraException;
import com.example.parcialfinal.infrastructure.repository.EstudianteRepositorio;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EliminarEstudianteService {

    private final EstudianteRepositorio estudianteRepositorio;

    public void EliminarEstudiante(Long id){

            estudianteRepositorio.deleteById(id);
            log.info("Eliminado con exito");
            throw new EstudianteNoSeEncuentraException("El estudiante no se encuentra en nuestros registros");
        
    }


    
}
