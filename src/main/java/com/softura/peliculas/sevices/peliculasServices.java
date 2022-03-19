package com.softura.peliculas.sevices;

import com.softura.peliculas.model.peliculas;
import com.softura.peliculas.repository.peliculasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;

/**
 *
 * @author Martin
 */
public class peliculasServices {

    @Autowired
    private peliculasRepository peliculasRepository;

    public peliculas create(peliculas pelicula) {
        return peliculasRepository.save(pelicula);
    }

    public List<peliculas> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    public void delete(peliculas pelicula) {
        peliculasRepository.delete(pelicula);
    }

    public Optional<peliculas> create(Long idPelicula) {
        return peliculasRepository.findById(idPelicula);
    }

}
