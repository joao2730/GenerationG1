package com.generation.repositories;

import com.generation.models.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {

    //JPQL
    //usamos objeto
    @Query("SELECT a FROM Auto a WHERE a.marca = ?1")
    List<Auto> findAllByAutoMarca(String marca);
    //List<Auto> getAutoWhereMarca(String marca)

    //Query comun
    //es una forma de hacer 2 consultas a la vez
    //@Query(value ="select * from auto a where a.marca = ?1 and a.modelo = ?2")
    @Query(value = "SELECT * FROM autos a WHERE a.marca = ?1", nativeQuery = true)
    List<Auto> buscarMarca(String marca);

    //filtro por alguan columnas de la tabla
    @Query(value="SELECT a.marca, a.color FROM autos a WHERE a.marca = ?1 and a.color=?2",nativeQuery = true)
    List<Object[]> buscarMarcaColor(String marca, String color);

}
