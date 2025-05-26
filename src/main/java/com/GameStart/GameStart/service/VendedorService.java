package com.GameStart.GameStart.service;

import java.util.List;
import com.GameStart.GameStart.model.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;

import com.GameStart.GameStart.repository.VendedorRepository;

public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;
    public List<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }

    public Vendedor findById(long id) {
        return vendedorRepository.findById(id).get();
    }

    public Vendedor save(Vendedor soporte) {
        return vendedorRepository.save(soporte);
    }

    public void delete(Long id) {
        vendedorRepository.deleteById(id);
    }
}
