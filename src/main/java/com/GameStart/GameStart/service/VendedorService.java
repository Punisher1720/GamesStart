package com.GameStart.GameStart.service;

import java.util.List;
import com.GameStart.GameStart.model.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameStart.GameStart.repository.VendedorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;
    public List<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }

    public Vendedor findById(long id) {
        return vendedorRepository.findById(id).get();
    }

    public Vendedor save(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void delete(Long id) {
        vendedorRepository.deleteById(id);
    }
}
