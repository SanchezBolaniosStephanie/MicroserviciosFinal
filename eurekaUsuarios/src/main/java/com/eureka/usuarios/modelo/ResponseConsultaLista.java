package com.eureka.usuarios.modelo;

import com.eureka.usuarios.entity.Usuario;

import java.util.List;

public class ResponseConsultaLista {

    private List<Usuario> usuarios;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
