package com.eureka.publicacion.repository;

import com.eureka.publicacion.entity.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, String> {
    List<Publicacion> findAll();
}
