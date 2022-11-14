package com.eureka.usuarios.modelo;

public class ResponseRegistro {

    private String folio;
    private String mensaje;


    public ResponseRegistro(){}

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}