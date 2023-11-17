package com.example.parcialfinal.infrastructure.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // todos los constructores
@NoArgsConstructor // incluye un constructor vacío
@Entity(name = "estudiante")
public class EstudianteEntity {

    @Id // la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrementable
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "edad")
    private int edad;
}
