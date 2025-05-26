package com.GameStart.GameStart.controller;


import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("GameStart/v1/juego")
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    //Filtro por nombre, género o precio
    @GetMapping("/filtrar")
    public List<Juego> filtrarJuegos(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String genero,
            @RequestParam(required = false) Integer precio
    ) {
        List<Juego> juegos = juegoService.findAll();
        return juegos.stream()
                .filter(j -> (nombre == null || j.getNombre_juego().equalsIgnoreCase(nombre)))
                .filter(j -> (genero == null || j.getGenero_juego().equalsIgnoreCase(genero)))
                .filter(j -> (precio == null || j.getPrecio_juego().equals(precio)))
                .toList();
    }

    // Agregar un juego
    @PostMapping
    public Juego agregarJuego(@RequestBody Juego juego) {
        return juegoService.save(juego);
    }

    // Actualizar un juego
    @PutMapping("/{id}")
    public Juego actualizarJuego(@PathVariable("id") Integer id, @RequestBody Juego juego) {
        juego.setCod_juego(id);
        return juegoService.save(juego);
    }

    // Eliminar un juego
    @DeleteMapping("/{id}")
    public void eliminarJuego(@PathVariable("id") Integer id) {
        juegoService.deleteById(id.longValue());
    }
}
