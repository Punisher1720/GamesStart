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
import com.GameStart.GameStart.model.Vendedor;
import com.GameStart.GameStart.service.VendedorService;

@RestController
@RequestMapping("/api/v1/vendedores")
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar() {
        List<Vendedor> vendedor  = vendedorService.findAll();
        if (vendedor.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vendedor);
    }

    @PostMapping
    public ResponseEntity<Vendedor> guardar(@RequestBody Vendedor vendedor) {
        Vendedor productoMuevo = vendedorService.save(vendedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoMuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> buscar(@PathVariable Integer id) {
        try {
            Vendedor vendedor = vendedorService.findById(id);
            return ResponseEntity.ok(vendedor);
        } catch ( Exception e ) {
            return  ResponseEntity.notFound().build();
        }
    }


}
