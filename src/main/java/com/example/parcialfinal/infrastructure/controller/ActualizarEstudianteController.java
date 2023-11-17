package com.example.parcialfinal.infrastructure.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialfinal.application.ActualizarEstudianteService;
import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.domain.EstudianteDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")

public class ActualizarEstudianteController {

    private final ActualizarEstudianteService estudianteService;

    @PutMapping("/{id}/actualizar")
    public Estudiante actulizarEstudiante(@PathVariable("id") Long id,@RequestBody EstudianteDto estudianteDto){
        log.info("Actualizando estudiante");
        return estudianteService.actualizarEstudiante(id, estudianteDto);
    }
    
}
