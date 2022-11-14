package com.eureka.usuarios.service;


import com.eureka.usuarios.entity.Usuario;
import com.eureka.usuarios.modelo.ResponseRegistro;
import com.eureka.usuarios.modelo.UsuarioDto;

import java.util.List;

public interface OperacionService {

    String getValidacion();
    ResponseRegistro registro(UsuarioDto usuario);
    List<Usuario> obtenerUsuarios();
}
