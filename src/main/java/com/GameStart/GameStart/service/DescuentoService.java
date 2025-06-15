package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Descuento;
import com.GameStart.GameStart.Repository.DescuentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DescuentoService {
    
    @Autowired
    private DescuentoRepository descuentoRepository;

    public List<Descuento> findAll() {
        return descuentoRepository.findAll();
    }

    public Descuento guardar(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    public void eliminar(long id) {
        descuentoRepository.deleteById((int) id);
    }

    public java.util.Optional<Descuento> buscarPorId(long id) {
        return descuentoRepository.findById((int) id);
    }
}
