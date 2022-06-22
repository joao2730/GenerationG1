package com.generation.services;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Logica de negocio, o validaciones del sistema*/
@Service
public class UsuarioService {

    /** llamar a Repository (inyeccion de dependencias)*/
    @Autowired
    UsuarioRepository usuarioRepository;

    public void saveUsuario(Usuario usuario) {
    }




}
