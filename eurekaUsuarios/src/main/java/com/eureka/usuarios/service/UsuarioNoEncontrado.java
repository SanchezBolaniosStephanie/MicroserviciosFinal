package com.eureka.usuarios.service;

public class UsuarioNoEncontrado extends RuntimeException{
    private final String id;

    public UsuarioNoEncontrado(String message, String id) {
        super(message);
        this.id = id;
    }

    public static UsuarioNoEncontrado from(String message, String id) {
        return new UsuarioNoEncontrado(message, id);
    }

    public String getId() {
        return id;
    }
}
