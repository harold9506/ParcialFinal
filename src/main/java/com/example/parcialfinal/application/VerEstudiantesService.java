package com.example.parcialfinal.application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.parcialfinal.application.mapper.EstudianteMapper;
import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.excepcion.EstudianteNoSeEncuentraException;
import com.example.parcialfinal.infrastructure.repository.EstudianteRepositorio;
import com.example.parcialfinal.infrastructure.repository.model.EstudianteEntity;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class VerEstudiantesService {

    private final EstudianteRepositorio estudianteRepositorio;

    public Estudiante obtenerEstudiante(Long id){

        EstudianteEntity estudianteEntity = estudianteRepositorio.findById(id) // si encuentra el estudiante en la BD
                .orElseThrow(() -> new EstudianteNoSeEncuentraException("El estudiante no se encuentra en nuestros registros"));    // si no encuentra el estudiante en la BD
            
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteEntity);
    }

public List <Estudiante> obtenerEstudiantes(){
    List <EstudianteEntity> estudianteEntites = estudianteRepositorio.findAll();

    return estudianteEntites.stream()
        .map(entity -> EstudianteMapper.INSTANCE.mapToDomain(entity))
        .collect(Collectors.toList());
}
    
}
