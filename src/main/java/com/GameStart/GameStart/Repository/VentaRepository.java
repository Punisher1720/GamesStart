package com.GameStart.GameStart.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.GameStart.GameStart.model.Venta;

import jakarta.transaction.Transactional;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

    @Query("SELECT v FROM Venta v")
    List<Venta> findAll();

    @Query("SELECT v FROM Venta v WHERE v.cod_venta = ?1")
    Venta findByCodVenta(String cod_venta);

    @Query("SELECT v FROM Venta v WHERE v.nombre_venta = ?1")
    List<Venta> findByNombreVenta(String nombre_venta);

    @Modifying
    @Transactional
    @Query("DELETE FROM Venta v WHERE v.cod_venta = ?1")
    void deleteByCodVenta(@Param("cod_venta") Integer cod_venta);

    @Query("UPDATE Venta v set v.nombre_venta = :nombre_venta, v.precio_venta = :precio_venta where v.cod_venta = :cod_venta")
    void updateVenta(@Param("cod_venta") Integer cod_venta, 
                   @Param("nombre_venta") String nombre_venta, 
                   @Param("precio_venta") Integer precio_venta);
}
