package com.GameStart.GameStart.controller;


import com.GameStart.GameStart.model.Pago;
import com.GameStart.GameStart.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/pago/v1")

public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping("ListarPagos")
    public ResponseEntity<List<Pago>> listarPagos() {
        List<Pago> pagos = pagoService.findAll();
        if (pagos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pagos);
    }

    @PostMapping
    public ResponseEntity<Pago> guardar(@RequestBody Pago pago) {
        Pago nuevoPago = pagoService.guardar(pago);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPago);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pago> buscar(@PathVariable Long id) {
    try {
        Pago pago = pagoService.findById(id);
        return ResponseEntity.ok(pago);
    } catch (Exception e) {
        return ResponseEntity.notFound().build();
    }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pago> actualizar(@PathVariable Long id, @RequestBody Pago pago) {
        try {
            Pago pagoActualizado = pagoService.findById(id, pago);
            return ResponseEntity.ok(pagoActualizado);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        try {
            pagoService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
