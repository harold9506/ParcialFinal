package com.example.parcialfinal.excepcion;

public class EstudianteNoSeEncuentraException extends RuntimeException {

    public EstudianteNoSeEncuentraException(String mensajeError) {
        super(mensajeError);
    }
}
