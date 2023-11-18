package com.example.parcialfinal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudianteDto {
    private String nombre;
    private String apellido;
    private int edad;
}