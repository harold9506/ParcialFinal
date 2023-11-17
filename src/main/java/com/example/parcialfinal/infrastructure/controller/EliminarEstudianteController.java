package com.example.parcialfinal.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.parcialfinal.application.EliminarEstudianteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/estudiante")
@RequiredArgsConstructor
public class EliminarEstudianteController {

    private final EliminarEstudianteService estudianteService;

    @DeleteMapping("/{id}/eliminar")
    public void eliminarEstudiante(@PathVariable("id") Long id) {

        estudianteService.EliminarEstudiante(id);
        log.info("Eliminado con exito");
    }


    
}
