package com.generation.services;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Logica de negocio, o validaciones del sistema
 */
@Service
public class UsuarioService {

    /**
     * llamar a Repository (inyeccion de dependencias)
     */
    @Autowired
    UsuarioRepository usuarioRepository;

    //obteniendo la lista de usuarios
    public List<Usuario> findAll() {
        //retornar la lista de usuarios
        return usuarioRepository.findAll();
    }

    public boolean saveUsuario(Usuario usuario) {
        boolean error = true;
        //validaciones de insercion(crear o registrar usuario)
        //1.- Validar si email existe en la base datos
        Usuario exiteUsuario = UsuarioRepository.findByEmail(usuario.getEmail());

        //Si no existe el usuario lo creamos
        if (exiteUsuario == null) {

            //2.- encriptar el password
            //123456 => $laskdjlkasdjasakqjwdadsjkn -> esto es lo que hace el bcrypt
            String passEncriptado = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
            usuario.setPassword(passEncriptado);

            usuarioRepository.save(usuario);
            return false;
        }

        //no existe, retornamos un boolean true
        else {
            return true;//error en la creacion, ya existe
        }


    }


    public boolean validarUsuario(String email, String password) {
        boolean error = true;
        //verificar email
        Usuario existeUsuario = UsuarioRepository.findByEmail(email);
        if (existeUsuario == null) {//no existe el usuario, error de ingreso
            error = true;
        } else {
            //verificar password contra password base datos desencriptada
            if (BCrypt.checkpw(password, existeUsuario.getPassword())) {
                  //password iguales, email y password igual a la base de datos
                error = false;
            }else {
                //password distintos, error
                error = true;
            }
        }
        return false;
    }
}
