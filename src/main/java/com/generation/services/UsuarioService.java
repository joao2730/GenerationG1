package com.generation.services;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Logica de negocio, o validaciones del sistema*/
@Service
public class UsuarioService {

    /** llamar a Repository (inyeccion de dependencias)*/
    @Autowired
    UsuarioRepository usuarioRepository;

    //obteniendo la lista de usuarios
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public void saveUsuario(Usuario usuario) {
    }




}
