package com.example.parcialfinal.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialfinal.application.CreacionEstudianteService;
import com.example.parcialfinal.domain.Estudiante;
import com.example.parcialfinal.domain.EstudianteDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class CreacionEstudianteController {


private final CreacionEstudianteService estudianteservice;

@PostMapping("/crear")
public Estudiante crearEstudiante(@RequestBody EstudianteDto estudianteDto){

    log.info("Creando Estudiantes");
    return estudianteservice.crearEstudiante(estudianteDto);

    }
    
}
