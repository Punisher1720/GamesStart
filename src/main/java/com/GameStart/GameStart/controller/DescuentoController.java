package com.GameStart.GameStart.controller;

import com.GameStart.GameStart.model.Descuento;
import com.GameStart.GameStart.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("GameStart/v1/descuento")
public class DescuentoController {

    @Autowired
    private DescuentoService descuentoService;

    // Listar todos los descuentos
    @GetMapping
    public List<Descuento> listarDescuentos() {
        return descuentoService.findAll();
    }

    // Agregar un descuento
    @PostMapping
    public Descuento agregarDescuento(@RequestBody Descuento descuento) {
        return descuentoService.save(descuento);
    }

    // Actualizar un descuento
    @PutMapping("/{id}")
    public Descuento actualizarDescuento(@PathVariable("id") Long id, @RequestBody Descuento descuento) {
        descuento.setCod_descuento(id.intValue());
        return descuentoService.save(descuento);
    }

    // Eliminar un descuento
    @DeleteMapping("/{id}")
    public void eliminarDescuento(@PathVariable("id") Long id) {
        descuentoService.deleteById(id);
    }
}