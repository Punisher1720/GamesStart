package com.GameStart.GameStart.controller;

import java.util.List;

import com.GameStart.GameStart.model.Descuento;
import com.GameStart.GameStart.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/descuento")
public class DescuentoController {

    @Autowired
    private DescuentoService descuentoService;

    @GetMapping
    public List<Descuento> listarDescuentos() {
        return descuentoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Descuento> obtenerDescuentoPorId(@PathVariable long id) {
        return descuentoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crear")
    public ResponseEntity<Descuento> crearDescuento(@RequestBody Descuento descuento) {
        Descuento nuevoDescuento = descuentoService.guardar(descuento);
        return ResponseEntity.ok(nuevoDescuento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Descuento> actualizarDescuento(@PathVariable long id, @RequestBody Descuento descuento) {
        return descuentoService.buscarPorId(id)
                .map(existe -> {
                    descuento.setId((int) id);
                    Descuento descuentoActualizado = descuentoService.guardar(descuento);
                    return ResponseEntity.ok(descuentoActualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDescuento(@PathVariable long id) {
        if (descuentoService.buscarPorId(id).isPresent()) {
            descuentoService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}