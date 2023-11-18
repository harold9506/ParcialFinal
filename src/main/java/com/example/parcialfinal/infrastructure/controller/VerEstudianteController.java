package com.example.parcialfinal.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcialfinal.application.VerEstudiantesService;
import com.example.parcialfinal.domain.Estudiante;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class VerEstudianteController {

    private final VerEstudiantesService estudianteService;

    @GetMapping("/{id}/obtener")
    public Estudiante obtenerEstudiante(@PathVariable("id") Long id){
        log.info("Obteniendo estudiantes");
        return estudianteService.obtenerEstudiante(id);

    }

    @GetMapping("/obtenertodos")
    public List<Estudiante> obtenerEstudiantes(){
        log.info("Obteniendo todos");
        return estudianteService.obtenerEstudiantes();
    }
    
}
