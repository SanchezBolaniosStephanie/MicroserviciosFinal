package com.eureka.usuarios.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import com.eureka.usuarios.entity.Usuario;
import com.eureka.usuarios.modelo.ResponseRegistro;
import com.eureka.usuarios.modelo.UsuarioDto;
import com.eureka.usuarios.service.OperacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("red/v1/usuarios")
public class OperacionController {
    @Autowired
    private OperacionServiceImpl opServiceImpl;

    @GetMapping("/getVersion")
    @ResponseStatus(OK)
    public String getStatus(){
        return opServiceImpl.getValidacion();
    }

    @PostMapping("/registro")
    @ResponseStatus(CREATED)
    public ResponseRegistro registrarUsuario(@RequestBody UsuarioDto usuario){
        return opServiceImpl.registro(usuario);
    }

    @GetMapping("/consulta")
    @ResponseStatus(OK)
    public List<Usuario> consultaUsuario(){
        return opServiceImpl.obtenerUsuarios();
    }

}
