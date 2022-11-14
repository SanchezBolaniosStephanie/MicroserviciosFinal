package com.eureka.amigos.entity;

import com.eureka.amigos.modelo.AmigoDto;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "amigo")
public class Amigo implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private String id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "id_amigo")
    private String idAmigo;

    @Column(name = "id_usuario")
    private String idUsuario;

    public static Amigo from(AmigoDto amigoDto){
        Amigo amigo = new Amigo();
        amigo.setFecha(amigoDto.getFecha());
        amigo.setIdAmigo(amigoDto.getIdAmigo());
        amigo.setIdUsuario(amigoDto.getIdUsuario());
        return amigo;
    }


    public AmigoDto TO(){
        AmigoDto amigoDto = new AmigoDto();
        amigoDto.setId(getId());
        amigoDto.setFecha(getFecha());
        amigoDto.setIdAmigo(getIdAmigo());
        amigoDto.setIdUsuario(getIdUsuario());
        return amigoDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(String idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
