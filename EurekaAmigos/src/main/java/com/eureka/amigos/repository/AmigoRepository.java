package com.eureka.amigos.repository;

import com.eureka.amigos.entity.Amigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmigoRepository extends JpaRepository<Amigo, String> {
    //@Query(nativeQuery = false, value="SELECT id, fecha, id_amigo, id_usuario FROM amigo WHERE id_usuario = ?1")
    List<Amigo> findAll();
}
