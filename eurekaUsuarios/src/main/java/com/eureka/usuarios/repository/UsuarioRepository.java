package com.eureka.usuarios.repository;

import com.eureka.usuarios.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>
{
    //Optional<Usuario> findByIdUser(String id);
    List<Usuario> findAll();
}
