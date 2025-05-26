package com.GameStart.GameStart.service;

import com.GameStart.GameStart.model.Descuento;
import com.GameStart.GameStart.Repository.DescuentoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DescuentoService {
    @Autowired
    private DescuentoRepository descuentoRepository;

    public DescuentoService(){
    }

    public List<Descuento> findAll() {
        return this.descuentoRepository.findAll();
    }

    public Descuento findById(Long cod_descuento) {
        return (Descuento)this.descuentoRepository.findById(cod_descuento).get();
    }

    public Descuento save(Descuento descuento) {
        return (Descuento)this.descuentoRepository.save(descuento);
    }

    public void deleteById(Long cod_descuento) {
        this.descuentoRepository.deleteById(cod_descuento);
    }

    
}
