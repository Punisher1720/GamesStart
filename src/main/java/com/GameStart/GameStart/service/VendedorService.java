package com.GameStart.GameStart.service;

import org.springframework.stereotype.Service;
import com.GameStart.GameStart.Repository.VendedorRepository;
import com.GameStart.GameStart.model.Vendedor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class VendedorService {
    
    @Autowired
    private VendedorRepository vendedorRepository;

    public List<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }

    public Vendedor findById(Long id) {
        return vendedorRepository.findById(id).orElse(null);
    }
    

}
