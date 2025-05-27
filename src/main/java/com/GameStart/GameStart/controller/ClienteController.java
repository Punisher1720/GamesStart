package com.GameStart.GameStart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GameStart.GameStart.model.Cliente;
import com.GameStart.GameStart.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> clientes  = clienteService.findAll();
        if (clientes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente cliente) {
        Cliente productoMuevo = clienteService.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoMuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Integer id) {
        try {
            Cliente cliente = clienteService.findById(id);
            return ResponseEntity.ok(cliente);
        } catch ( Exception e ) {
            return  ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable Integer id, @RequestBody Cliente cliente) {
        try {
            Cliente cli = clienteService.findById(id);
            cli.setId_cliente(id);
            cli.setNombre_cliente(cliente.getNombre_cliente());
            cli.setCorreo_cliente(cliente.getCorreo_cliente());
            cli.setTelefono(cliente.getTelefono());

            clienteService.save(cli);
            return ResponseEntity.ok(cliente);
        } catch ( Exception e ) {
            return  ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        try {
            clienteService.delete(id);
            return ResponseEntity.noContent().build();
        } catch ( Exception e ) {
            return  ResponseEntity.notFound().build();
        }
    }

}