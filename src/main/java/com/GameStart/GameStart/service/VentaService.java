package com.GameStart.GameStart.service;

import java.util.List;
import java.util.Optional;

import com.GameStart.GameStart.model.Venta;
import com.GameStart.GameStart.Repository.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    public void eliminarVenta(Integer id) {
        ventaRepository.deleteById(id);
    }
    
    public void guardarVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    public Optional<Venta> buscarVentaPorId(Integer id) {
        return ventaRepository.findById(id);
    }

    public void deleteById(Integer id) {
        ventaRepository.deleteById(id);
    }

    

}

