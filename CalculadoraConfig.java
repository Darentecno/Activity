package com.aplicacion.claserepaso.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "calculadora")
public class CalculadoraConfig {

    private String operacion;


    // al parecer los métodos set y get son obligatorios
    public String getOperacion(){
        return operacion;
    }

    public void setOperacion(String operacion){
        this.operacion = operacion;
    }

}
