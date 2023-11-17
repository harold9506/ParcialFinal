package com.example.parcialfinal.excepcion;

public class EstudianteNoSeEncuentraException extends RuntimeException {

    public EstudianteNoSeEncuentraException() {
        super("El estudiante no se encuentra en nuestros registros");
    }
}
