package com.eureka.amigos.service;

import com.eureka.amigos.entity.Amigo;
import com.eureka.amigos.modelo.AmigoDto;
import com.eureka.amigos.modelo.ResponseRegAmigo;
import com.eureka.amigos.repository.AmigoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudAmigoImpl implements SolicitudService{
    private AmigoRepository amigoRepository;

    public SolicitudAmigoImpl(AmigoRepository amigoRepository){
        this.amigoRepository = amigoRepository;
    }

    @Override
    public ResponseRegAmigo registrarUsuario(AmigoDto amigoDto) {
        ResponseRegAmigo responseRegAmigo = new ResponseRegAmigo();
        try {
            Amigo amigoEntity = amigoRepository.saveAndFlush(Amigo.from(amigoDto));
            responseRegAmigo.setFolio(amigoEntity.getId());
            responseRegAmigo.setMensaje("Se ha agregado el amigo");
        }catch(Exception e){
            responseRegAmigo.setFolio(null);
            responseRegAmigo.setMensaje(e.getStackTrace().toString());
        }
        return responseRegAmigo;
    }

    @Override
    public List<Amigo> obtenerAmigos(String id) {
        List<Amigo> listaAmigos = new ArrayList<Amigo>();
        amigoRepository.findAll().forEach(amigo -> listaAmigos.add(amigo));
        return listaAmigos;
    }
}
