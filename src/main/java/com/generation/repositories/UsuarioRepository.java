package com.generation.repositories;

import com.generation.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { //JpaRepository<Objeto, Tipo_dato_PK>
    /** las interface solo definen los metodos*/
    /** Querys y usar metodo que se conectan a la base de datos*/
}

/** Objeto o Entidad (DTO, BEANS, POJO) Auto, atributos, constructores,
 * setter y getter
 * JSP, Controlador, Service y Repository,
 * GUARDAR
 */
