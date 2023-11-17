package com.example.parcialfinal.domain;

import lombok.AllArgsConstructor;
import lombok.Data; // @Data

@Data // incluye los getters, setters, toString.
@AllArgsConstructor // crea todos los constructores.
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
