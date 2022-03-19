package com.softura.peliculas.model;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 *
 * @author Martin
 */
@Entity
@Table(name = "cine")
public class cine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCine;

    @Column(name = "Nombre Cine")
    private String n_cine;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "municipio")
    private String municipio;

// Constructor
    public cine(Long idCine, String n_cine, String estado, String municipio) {
        this.idCine = idCine;
        this.n_cine = n_cine;
        this.estado = estado;
        this.municipio = municipio;
    }

// ID
    public Long getIdCine() {
        return idCine;
    }

    public void setIdCine(Long idCine) {
        this.idCine = idCine;
    }

// Nombre
    public String getN_Cine() {
        return n_cine;
    }

    public void setN_Cine(String n_cine) {
        this.n_cine = n_cine;
    }

// Estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
// Municipio

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
