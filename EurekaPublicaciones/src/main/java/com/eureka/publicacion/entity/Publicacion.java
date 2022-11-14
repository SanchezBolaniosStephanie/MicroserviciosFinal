package com.eureka.publicacion.entity;

import com.eureka.publicacion.modelo.PublicacionDto;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private String id;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "puntos")
    private int puntos;

    @Column(name = "id_usuario")
    private String idUSuario;

    public static Publicacion from(PublicacionDto publicacionDto){
        Publicacion publicacion = new Publicacion();
        publicacion.setMensaje(publicacionDto.getMensaje());
        publicacion.setPuntos(publicacionDto.getPuntos());
        publicacion.setIdUSuario(publicacionDto.getIdUsuario());
        return  publicacion;
    }

    public PublicacionDto to(){
        PublicacionDto publicacionDto =  new PublicacionDto();
        publicacionDto.setId(getId());
        publicacionDto.setMensaje(getMensaje());
        publicacionDto.setPuntos(getPuntos());
        publicacionDto.setIdUsuario(getIdUSuario());
        return publicacionDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getIdUSuario() {
        return idUSuario;
    }

    public void setIdUSuario(String idUSuario) {
        this.idUSuario = idUSuario;
    }
}
