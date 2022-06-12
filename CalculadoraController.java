package com.aplicacion.claserepaso.controllers;

import com.aplicacion.claserepaso.config.CalculadoraConfig;
import com.aplicacion.claserepaso.services.InterfazCalculadoraServices;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping
public class CalculadoraController {

    InterfazCalculadoraServices interfazCalculadoraServices;
    private final CalculadoraConfig config;

    public CalculadoraController(CalculadoraConfig config, InterfazCalculadoraServices interfazCalculadoraServices){
        this.config = config;
        this.interfazCalculadoraServices = interfazCalculadoraServices;
    }

    @Value("${rosa}")
    String mensaje;

    @GetMapping("/suma")
    public ResponseEntity getSuma(@PathParam("") String numero1, @PathParam("") String numero2){
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 + num2;
        return ResponseEntity.ok(resultado + " " + mensaje);
    }

    @GetMapping("/resta/{numero1}/{numero2}")
    public ResponseEntity getResta(@PathVariable String numero1, @PathVariable String numero2){
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int resultado = num1 - num2;
        return ResponseEntity.ok(resultado + " " + config.getOperacion());
    }

    @GetMapping("/multiplicar/{num1}/{num2}")
    public ResponseEntity getMultiplicacion(@PathVariable String numero1, @PathVariable String numero2){

        return interfazCalculadoraServices.obtenerMultiplicacion(numero1,numero2);
    }



}
