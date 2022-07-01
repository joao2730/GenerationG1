package com.generation.services;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class AutoService {
    @Autowired
    AutoRepository autoRepository;

    //guardar un auto
    public void guardarAuto(@Valid Auto auto) {
        autoRepository.save(auto);
    }
    /** obtener una lista de autos */
    public List<Auto> findAll() {

        return autoRepository.findAll();
    }

    public Auto buscarId(Long id) {
        return autoRepository.findById(id).get();//.get especifica el tipo de dato que necesitamos
    }

    public void eliminarPorId(Long id) {
        autoRepository.deleteAllById(Collections.singleton(id));
    }

    public List<Auto> buscarMarca(String marca) {
        //llamado a un metodo propio
        //return autoRepository.buscarMarca(marca);//Query tradicional
        return autoRepository.findAllByAutoMarca(marca);//Query por servicio
    }

    //Paginacion
    //variable estatica, cantidad de datos a mostrar por pagina
    private static final int LOTE = 5;

    //deprecado = new PageRequest(...);{deprecado = descontinuado}
    public Page<Auto> paginarAutos(int numeroPagina){
        PageRequest pageRequest = PageRequest.of(numeroPagina, LOTE, Sort.Direction.ASC,"marca");
        Page<Auto> autos = autoRepository.findAll(pageRequest);

        return autoRepository.findAll(pageRequest);
    }

}
