package com.example.parcialfinal.application;

import org.springframework.stereotype.Service;

import com.example.parcialfinal.application.mapper.EstudianteMapper;
import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.domain.EstudianteDto;
import com.example.parcialfinal.infrastructure.repository.EstudianteRepositorio;
import com.example.parcialfinal.infrastructure.repository.model.EstudianteEntity;

import lombok.RequiredArgsConstructor;

/*
 * Aquí va la lógica para crear un estudiante (y guardarlo a la BD)
 */

@Service
@RequiredArgsConstructor // Crea un constructor para cualquier "final"
public class CreacionEstudianteService {

    private final EstudianteRepositorio estudianteRepositorio; //

    public Estudiante crearEstudiante(EstudianteDto estudianteDto) {

        // Convierte estudiante a estudianteEntity para poder guardarlo en la BD.
        EstudianteEntity estudianteEntity = EstudianteMapper.INSTANCE.mapToEntity(estudianteDto);
        EstudianteEntity estudianteGuardado = estudianteRepositorio.save(estudianteEntity); // guarda el estudiante a la BD.
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteGuardado);
    }
}
