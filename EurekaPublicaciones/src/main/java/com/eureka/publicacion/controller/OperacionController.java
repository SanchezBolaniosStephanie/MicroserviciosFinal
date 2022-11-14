package com.eureka.publicacion.controller;

import com.eureka.publicacion.entity.Publicacion;
import com.eureka.publicacion.modelo.PublicacionDto;
import com.eureka.publicacion.modelo.ResponsePost;
import com.eureka.publicacion.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("red/v1/posts")
public class OperacionController {
    @Autowired
    private PostServiceImpl postServiceImpl;

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponsePost registraPost(@RequestBody PublicacionDto publicacionDto){
        return postServiceImpl.postear(publicacionDto);
    }

    @GetMapping("/consultar")
    @ResponseStatus(HttpStatus.OK)
    public List<Publicacion> consultaPost(){
        return postServiceImpl.consultaPost();
    }
}
