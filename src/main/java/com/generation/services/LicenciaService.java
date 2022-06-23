package com.generation.services;

import com.generation.models.Licencia;
import com.generation.repositories.LicenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenciaService {
    @Autowired
    LicenciaRepository licenciaRepository;
    public void save(Licencia licencia) {

        //almacenar en base de datos la licencia
        licenciaRepository.save(licencia);
    }

    public List<Licencia> findAll() {
        return licenciaRepository.findAll();
    }
}
