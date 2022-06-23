package com.generation.controllers;

import com.generation.models.Licencia;
import com.generation.models.Usuario;
import com.generation.services.LicenciaService;
import com.generation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("licencia")
public class LicenciaController {

    @Autowired
    LicenciaService licenciaService;

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping("")
    public String despliegue(Model model){
        Licencia licencia = new Licencia();
        //licencia.setEstado("activo");
        model.addAttribute("licencia", licencia);
        //lista de usuario
        List<Usuario> listaUsuario = usuarioService.findAll();
        model.addAttribute("listaUsuarios", listaUsuario);

        // enviar lista de licencia al jsp
        List<Licencia> listaLicencia = licenciaService.findAll();
        model.addAttribute("listaLicencias", listaLicencia);

        return "licencia.jsp";
    }

    @PostMapping("/guardar")
    public String guardarLicencia(@Valid @ModelAttribute("licencia") Licencia licencia){

        licenciaService.save(licencia);
        return "redirect:/licencia";
    }

}
