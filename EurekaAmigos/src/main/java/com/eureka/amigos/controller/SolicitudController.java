package com.eureka.amigos.controller;


import com.eureka.amigos.entity.Amigo;
import com.eureka.amigos.modelo.AmigoDto;
import com.eureka.amigos.modelo.ResponseRegAmigo;
import com.eureka.amigos.service.SolicitudAmigoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import java.util.List;

@RestController
@RequestMapping("red-smigos/v1")
public class SolicitudController {
    @Autowired
    private SolicitudAmigoImpl solicitudAmigoImpl;

    @PostMapping("/registroAmigo")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseRegAmigo registrarAmigo(@RequestBody AmigoDto amigo){
    return solicitudAmigoImpl.registrarUsuario(amigo);
    }

    @GetMapping("/consultaAmigos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Amigo> buscarAmigos(@PathParam("id") String id){
        return solicitudAmigoImpl.obtenerAmigos(id);
    }

}
