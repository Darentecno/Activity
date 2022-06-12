package com.aplicacion.claserepaso.services;

import org.springframework.http.ResponseEntity;

public interface InterfazCalculadoraServices {

    ResponseEntity obtenerMultiplicacion(String num1, String num2);
}
