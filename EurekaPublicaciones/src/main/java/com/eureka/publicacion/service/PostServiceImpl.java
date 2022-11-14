package com.eureka.publicacion.service;

import com.eureka.publicacion.entity.Publicacion;
import com.eureka.publicacion.modelo.PublicacionDto;
import com.eureka.publicacion.modelo.ResponsePost;
import com.eureka.publicacion.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PublicacionRepository publicacionRepository;

    public PostServiceImpl(PublicacionRepository publicacionRepository){
        this.publicacionRepository = publicacionRepository;
    }
    @Override
    public ResponsePost postear(PublicacionDto publicacionDto) {
        ResponsePost responsePost = new ResponsePost();
        try {
            Publicacion publicacionEntity =  publicacionRepository.saveAndFlush(Publicacion.from(publicacionDto));
            responsePost.setFolio(publicacionEntity.getId());
            responsePost.setMensaje("Se creo la publicacion");
        }catch(Exception e){
            responsePost.setFolio(null);
            responsePost.setMensaje(e.getMessage());
        }
        return responsePost;
    }

    @Override
    public List<Publicacion> consultaPost() {
        List<Publicacion> listPosts = new ArrayList<Publicacion>();
        publicacionRepository.findAll().forEach(post -> listPosts.add((Publicacion) post));
        return listPosts;
    }
}
