package com.softura.peliculas.model;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 *
 * @author Martin
 */

@Entity
@Table(name = "Clasificaciones")
public class clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClasificacion;

    @Column(name = "Clasificacion")
    private String clasificacion;

//Constructor
    public clasificacion(Long idClasificacion, String clasificacion) {

        this.idClasificacion = idClasificacion;
        this.clasificacion = clasificacion;
    }

//ID 
    public Long getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Long idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

//Nombre
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion() {
        this.clasificacion = clasificacion;
    }

}
