package com.eureka.usuarios.service;


import com.eureka.usuarios.entity.Usuario;
import com.eureka.usuarios.modelo.ResponseRegistro;
import com.eureka.usuarios.modelo.UsuarioDto;
import com.eureka.usuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperacionServiceImpl implements OperacionService{
    private UsuarioRepository usuarioRepository;

    public OperacionServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public String getValidacion() {
        return "Version v1 de microservicio de usuarios";
    }

    @Override
    public ResponseRegistro registro(UsuarioDto usuario) {
        ResponseRegistro response = new ResponseRegistro();
        try{
            Usuario ususarioEntity = usuarioRepository.saveAndFlush(Usuario.from(usuario));
            response.setFolio(ususarioEntity.getId());
            response.setMensaje("Se registro el usuario");
        }catch(Exception e){
            response.setFolio(null);
            response.setMensaje(e.getStackTrace().toString());
        }
        return response;
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        //return usuarioRepository.findByIdUser(id).orElseThrow(() -> UsuarioNoEncontrado.from("Usuario no encontrado", id));
        usuarioRepository.findAll().forEach(usuario -> usuarios.add(usuario));
        return usuarios;
    }
}