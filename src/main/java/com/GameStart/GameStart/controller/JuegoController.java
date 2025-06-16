package com.GameStart.GameStart.controller;


import com.GameStart.GameStart.model.Juego;
import com.GameStart.GameStart.service.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/juego/v1")
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    @GetMapping
    public ResponseEntity<List<Juego>> listarJuegos() {
        List<Juego> juegos = juegoService.findAll();
        if (juegos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(juegos);
    }

    @PostMapping
    public ResponseEntity<Juego> guardar(@RequestBody Juego juego) {
        Juego nuevoJuego = juegoService.guardar(juego);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoJuego);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Juego> buscar(@PathVariable long id) {
        return juegoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crear")
    public ResponseEntity<Juego> crearJuego(@RequestBody Juego juego) {
        Juego nuevoJuego = juegoService.guardar(juego);
        return ResponseEntity.ok(nuevoJuego);
    }    

    @PutMapping("/{id}")
    public ResponseEntity<Juego> actualizarJuego(@PathVariable long id, @RequestBody Juego juego) {
        return juegoService.buscarPorId(id)
                .map(existe -> {
                    juego.setId((int) id);
                    Juego juegoActualizado = juegoService.guardar(juego);
                    return ResponseEntity.ok(juegoActualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJuego(@PathVariable long id) {
        if (juegoService.buscarPorId(id).isPresent()) {
            juegoService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar/{cod_juego}")
    public ResponseEntity<Juego> buscarJuegoPorCodigo(@PathVariable String cod_juego) {
        return juegoService.buscarPorCodJuego(cod_juego)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
