package com.softura.peliculas.model;

import javax.persistence.*;
import javax.annotation.Generated;

/**
 *
 * @author Martin
 */
@Entity
@Table(name = "m_pelicula")
public class peliculas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPelicula;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Imagen")
    private String imagen;

    @Column(name = "Duracion(min)")
    private int duracion;

    @Column(name = "idClasificacion")
    private int idClasificacion;

// Constructor
    public peliculas(Long idPelicula, String nombre, String imagen, int duracion, int idClasificacion) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.imagen = imagen;
        this.duracion = duracion;
        this.idClasificacion = idClasificacion;

    }

// Id
    public Long getId() {
        return idPelicula;
    }

    public void setId(Long idPelicula) {
        this.idPelicula = idPelicula;
    }
// Nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

// Imagen / URL
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

// Duracion
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

// Clasificacion 
    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

}
