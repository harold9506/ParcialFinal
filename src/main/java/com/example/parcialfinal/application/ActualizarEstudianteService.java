package com.example.parcialfinal.application;

import com.example.parcialfinal.application.mapper.EstudianteMapper;
import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.domain.EstudianteDto;
import com.example.parcialfinal.excepcion.EstudianteNoSeEncuentraException;
import com.example.parcialfinal.infrastructure.repository.EstudianteRepositorio;
import com.example.parcialfinal.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActualizarEstudianteService {

    private final EstudianteRepositorio estudianteRepositorio;

    public Estudiante actualizarEstudiante(Long id, EstudianteDto estudianteDto) {

        EstudianteEntity estudianteEntity = estudianteRepositorio.findById(id) // si encuentra el estudiante en la BD
                .orElseThrow(() -> new EstudianteNoSeEncuentraException("El estudiante no se encuentra en nuestros registros"));    // si no encuentra el estudiante en la BD

        estudianteEntity.setNombre(estudianteDto.getNombre());
        estudianteEntity.setApellido(estudianteDto.getApellido());
        estudianteEntity.setEdad(estudianteDto.getEdad());

        return EstudianteMapper.INSTANCE.mapToDomain(estudianteRepositorio.save(estudianteEntity));
    }
}
