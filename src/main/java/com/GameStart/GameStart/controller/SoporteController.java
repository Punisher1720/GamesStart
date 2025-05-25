package com.GameStart.GameStart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GameStart.GameStart.model.Soporte;
import com.GameStart.GameStart.service.SoporteService;

@RestController
@RequestMapping("/api/v1/tickets")
public class SoporteController {
@Autowired
    private SoporteService soporteService;

    @GetMapping
    public ResponseEntity<List<Soporte>> listar() {
        List<Soporte> soporte  = soporteService.findAll();
        if (soporte.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(soporte);
    }

    @PostMapping
    public ResponseEntity<Soporte> guardar(@RequestBody Soporte soporte) {
        Soporte productoMuevo = soporteService.save(soporte);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoMuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Soporte> buscar(@PathVariable Integer id) {
        try {
            Soporte soporte = soporteService.findById(id);
            return ResponseEntity.ok(soporte);
        } catch ( Exception e ) {
            return  ResponseEntity.notFound().build();
        }
    }
}
