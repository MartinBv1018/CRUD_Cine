package com.softura.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.softura.peliculas.model.peliculas;
/**
 *
 * @author Martin
 */

public interface peliculasRepository extends JpaRepository<peliculas, Long> {
    
}
