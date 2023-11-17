package com.example.parcialfinal.application.mapper;

import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.infrastructure.repository.model.EstudianteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.parcialfinal.domain.EstudianteDto;

/*
 * CONVERTIDOR para los dos tipos de Estudiante
 */

@Mapper
public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);

    EstudianteEntity mapToEntity(EstudianteDto estudianteDto); // convierte Estudiante a EstudianteEntity

    Estudiante mapToDomain(EstudianteEntity estudianteEntity); // convierte EstudianteEntity a Estudiante
}
