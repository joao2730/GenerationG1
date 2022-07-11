package com.generation.controllers;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/registro")
public class RegistroController {// http://localhost:8080/registro

    // Inyeccion de dependencias
    @Autowired
    UsuarioService usuarioService;

    //ruta para desplegar el jsp, ruta por default
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuario) {//estamos pasando un objeto vacio desde el controlador al jsp

        return "registro.jsp";//la pagina a desplegar
    }

    //la ruta para capturar los datos del formulario
    @PostMapping("/usuario/respaldo")//Es para recibir datos solo a traves del formulario y a traves de la url
    public String registroUsuario(@RequestParam(value = "gato") String nombre,
                                  @RequestParam(value = "apellido") String apellido,
                                  @RequestParam(value = "edad") String edad) {
        System.out.println("Parametro gato " + nombre);
        System.out.println("Parametro apellido " + apellido);
        System.out.println("Parametro edad " + edad);
        return "registro.jsp";//la pagina a desplegar
    }

    //BindingResult --> va siempre despues del @Valid
    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,//estamos pasando un objeto vacio desde el controlador al jsp
                                 BindingResult resultado,
                                 Model model) {

        if (resultado.hasErrors()) {//capturando si existe un error en el ingreso de datos desdeel jsp
            model.addAttribute("msgError", "Debe realizar el ingreso correcto de los datos");
            return "registro.jsp";
        } else {

            //capturamos el objeto con los atributos llenos
            System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getEdad());

            String variable = "";
            //Enviar el objeto al service
            boolean usuarioCreado = usuarioService.saveUsuario(usuario);

            if (usuarioCreado) {
                model.addAttribute("msgError", "El email ya esta registrado");
                return "registro.jsp";
            } else {
                return "login.jsp";
            }
        }
    }

    @RequestMapping("/usuario/ingreso")
    String ingresoUsuario(@RequestParam(value = "email") String email,
                          @RequestParam(value = "password") String password,
                          Model model, HttpSession session) {
        /** Validaciones a realizar */
        //Validar que los parametros no son null o vacios
        if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
            model.addAttribute("msgError", "El email ya esta registrado");
            return "login.jsp";
        }
        //si es true, indica que hay un error en la base datos
        boolean usuarioValidado = usuarioService.validarUsuario(email,password);

        if (usuarioValidado){
            model.addAttribute("msgError", "Error en el ingreso al sistema");
            return "login.jsp";
        }else{
            //no hay error, puede ingresar al sistema
            session.setAttribute("email", email);

            return "redirect:/home";
        }
    }

    @RequestMapping("/usuario/login")
    public String login() {
        return "login.jsp";
    }
}
