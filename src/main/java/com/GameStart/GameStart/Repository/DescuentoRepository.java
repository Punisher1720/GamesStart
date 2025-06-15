package com.GameStart.GameStart.Repository;

import com.GameStart.GameStart.model.Descuento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface DescuentoRepository extends CrudRepository<Descuento, Integer> {
 
    @Query("SELECT d FROM Descuento d")
    List<Descuento> findAll();
    
    @Query("SELECT d FROM Descuento d WHERE d.cod_descuento = ?1")
    Descuento findByCodDescuento(String cod_descuento);

    @Query("SELECT d FROM Descuento d WHERE d.nombre_descuento = ?1")
    List<Descuento> findByNombreDescuento(String nombre_descuento);

    @Modifying
    @Transactional
    @Query("DELETE FROM Descuento d WHERE d.cod_descuento = ?1")
    void deleteByCodDescuento(String cod_descuento);


}
