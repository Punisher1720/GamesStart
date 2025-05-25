package com.GameStart.GameStart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GameStart.GameStart.model.Soporte;
import com.GameStart.GameStart.repository.SoporteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SoporteService {
    @Autowired
    private SoporteRepository soporteRepository;
    public List<Soporte> findAll() {
        return soporteRepository.findAll();
    }

    public Soporte findById(long id) {
        return soporteRepository.findById(id).get();
    }

    public Soporte save(Soporte soporte) {
        return soporteRepository.save(soporte);
    }

    public void delete(Long id) {
        soporteRepository.deleteById(id);
    }
}
