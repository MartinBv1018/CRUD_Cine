package com.softura.peliculas.resource;

import com.softura.peliculas.model.peliculas;
import com.softura.peliculas.sevices.peliculasServices;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Martin
 */
@RestController
@RequestMapping("/api/peliculas/")
public class peliculasResource {

    @Autowired
    private peliculasServices peliculasServices;

    @PostMapping("/guardar")
    private ResponseEntity<peliculas> guardar(@RequestBody peliculas peliculas) {
        peliculas nueva = peliculasServices.create(peliculas);
        try {
            return ResponseEntity.created(new URI("/api/peliculas" + nueva.getId())).body(nueva);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/mostrar")
    private ResponseEntity<List<peliculas>> listarPeliculas(@RequestBody peliculas peliculas) {
        return ResponseEntity.ok(peliculasServices.getAllPeliculas());
    }

    @DeleteMapping("/eliminar")
    private ResponseEntity<Void> eliminar(@RequestBody peliculas peliculas) {
        peliculasServices.delete(peliculas);
        return ResponseEntity.ok().build();
    }


}
