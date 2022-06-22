package com.generation.controllers;

import com.generation.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //http://localhost:8080/
    @RequestMapping("/")// anotacion apra capturar las rutas
    public String index(Model model){
        model.addAttribute("apellidos", "Aranda Ortega");
        model.addAttribute("nombres", "Joao Paulo");
        model.addAttribute("edad", "28");

        //instancia de usuario
        Usuario usuario = new Usuario("Joao", "Aranda", 28, "Admin1234");
        //pasando el objeto a la vista (JSP)
        model.addAttribute("usuario", usuario);



        return "index.jsp";
    }
    //"${}-> esto es un placeholder"
}