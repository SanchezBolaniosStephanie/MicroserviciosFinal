package com.eureka.amigos.service;

import com.eureka.amigos.entity.Amigo;
import com.eureka.amigos.modelo.AmigoDto;
import com.eureka.amigos.modelo.ResponseRegAmigo;

import java.util.List;

public interface SolicitudService {

    ResponseRegAmigo registrarUsuario(AmigoDto amigoDto);
    List<Amigo> obtenerAmigos(String id);
}
