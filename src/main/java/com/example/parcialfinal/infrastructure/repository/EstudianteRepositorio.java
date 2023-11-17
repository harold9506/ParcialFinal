package com.example.parcialfinal.infrastructure.repository;

import com.example.parcialfinal.infrastructure.repository.model.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository<EstudianteEntity, Long> = TODOS LOS CRUD

@Repository
public interface EstudianteRepositorio extends JpaRepository<EstudianteEntity, Long> {
}
