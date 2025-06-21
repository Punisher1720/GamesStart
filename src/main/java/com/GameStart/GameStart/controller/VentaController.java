package com.GameStart.GameStart.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import com.GameStart.GameStart.model.Venta;
import com.GameStart.GameStart.service.VentaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/venta/v1/")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Venta>> listarVentas() {
        List<Venta> ventas = ventaService.findAll();
        if (ventas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ventas);
    }

    @GetMapping("/buscarporid/{id}")
    public ResponseEntity<Venta> obtenerVentaPorId(@PathVariable long id) {
        Optional<Venta> venta = ventaService.findById(id);
        return venta.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarVenta(@PathVariable long id) {
        Optional<Venta> venta = ventaService.findById(id);
        if (venta.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        ventaService.deleteById((int) id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/GuardarVentas")
    public ResponseEntity<Void> save(@RequestBody Venta nuevaventa) {
        if (nuevaventa == null) {
            return ResponseEntity.badRequest().build();
        }
        ventaService.guardarVenta(nuevaventa);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/actualizar/{id}")
    public ResponseEntity<Venta> actualizarVenta(@PathVariable long id, @RequestBody Venta venta) {
        Optional<Venta> ventaExistente = ventaService.findById(id);
        if (ventaExistente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        ventaService.actualizar(id, venta);
        return ResponseEntity.ok(venta);
    }

    @GetMapping 
    public String healt() {
        return "Service is running";
    }
   
    
}
