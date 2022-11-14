package com.eureka.usuarios.entity;

import com.eureka.usuarios.modelo.UsuarioDto;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellido_paterno;
    @Column(name = "rol")
    private int rol;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "fecha_reg")
    private String fecha_reg;

    public static Usuario from(UsuarioDto usuarioDto){
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDto.getNombre());
        usuario.setApellido_paterno(usuarioDto.getApellido_paterno());
        usuario.setRol(usuarioDto.getRol());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setPassword(usuarioDto.getPassword());
        usuario.setFecha_reg(usuarioDto.getFecha_reg());
        return  usuario;
    }

    public UsuarioDto to(){
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(getId());
        usuarioDto.setNombre(getNombre());
        usuarioDto.setApellido_paterno(getApellido_paterno());
        usuarioDto.setRol(getRol());
        usuarioDto.setEmail(getEmail());
        usuarioDto.setPassword(getPassword());
        usuarioDto.setFecha_reg(getFecha_reg());
        return usuarioDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }
}
