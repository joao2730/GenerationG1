package com.generation.controllers;

import com.generation.models.Auto;
import com.generation.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/auto")
public class AutoController {// http://localhost:8080/auto
    @Autowired //insercion de dependencias
    AutoService autoService;

    @RequestMapping("")
    public String inicio(@ModelAttribute("auto") Auto auto){

        return "auto.jsp";
    }

    @RequestMapping("/guardar")
    public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto,
             BindingResult resultado, Model model) {
        //El BindingResult va seguido del valid, este valida lo que esta en el jsp

        if (resultado.hasErrors()) {
            model.addAttribute("msgError", "Datos erroneos");
            return "auto.jsp";
        } else {
            //enviamos el objeto a persistir en base datos
            autoService.guardarAuto(auto);

            //obtener una lista de autos
            List<Auto> listaAutos = autoService.findAll();
            //pasamos la lista de autos
            model.addAttribute("autosCapturados", listaAutos);
            return "mostrarAuto.jsp";//los datos retornaran al jsp
        }
    }

    //Solo mostrar el listado de autos
    @RequestMapping("/mostrar")//url que mostrara los datos ya ingresados
    public String mostrar(Model model) {
        //obtener una lista de autos
        List<Auto> listaAutos = autoService.findAll();
        //pasamos la lista de autos al jsp
        model.addAttribute("autosCapturados", listaAutos);
        return "mostrarAuto.jsp";
    }

    @RequestMapping("/editar/{id}")//url que mostrara para modificar
    public String editar(@PathVariable("id") Long id, Model model) {
        System.out.println("el id es: "+id);
        Auto auto = autoService.buscarId(id);
        model.addAttribute("auto", auto);//pasar el objeto completo al jsp

        return "editarAuto.jsp";//redireccionar a otra url o path

    }

    //localHost:8080/auto/actualizar/{id} -> //actualizar para la persistencia en la id
    @PostMapping("/actualizar/{id}")//url que mostrara al modificar
    public String actualizarAuto(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto,
                              BindingResult resultado, Model model) {
        System.out.println("el id al actualizar es: "+ id);

        if (resultado.hasErrors()) {
            model.addAttribute("msgError", "Datos erroneos");
            return "auto.jsp";
        } else {
            auto.setId(id); //agregar el id al objeto

            //enviamos el objeto a persistir en base datos
            autoService.guardarAuto(auto);

            //obtener una lista de autos
            List<Auto> listaAutos = autoService.findAll();
            //pasamos la lista de autos
            model.addAttribute("autosCapturados", listaAutos);
            return "mostrarAuto.jsp";
        }
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id")Long id){

        autoService.eliminarPorId(id);

        return "redirect:/auto/mostrar";
    }


}

