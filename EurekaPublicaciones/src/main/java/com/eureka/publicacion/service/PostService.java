package com.eureka.publicacion.service;

import com.eureka.publicacion.entity.Publicacion;
import com.eureka.publicacion.modelo.PublicacionDto;
import com.eureka.publicacion.modelo.ResponsePost;

import java.util.List;

public interface PostService {

    ResponsePost postear(PublicacionDto publicacionDto);
    List<Publicacion> consultaPost();

}
