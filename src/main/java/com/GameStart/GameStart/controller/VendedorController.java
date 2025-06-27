package com.GameStart.GameStart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GameStart.GameStart.model.Vendedor;
import com.GameStart.GameStart.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("api/vendedor/v1/")
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping("ListarVendedores")
    public List<Vendedor> listarVendedores() {
        return vendedorRepository.findAll();
    }

    @GetMapping("ListarVendedoresPorId/{id}")
    public Vendedor listarVendedoresPorId(Long id) {
        return vendedorRepository.findById(id).orElse(null);
    }
   
}
