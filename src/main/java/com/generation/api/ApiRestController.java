package com.generation.api;

import com.generation.models.Auto;
import com.generation.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")// la buena practica recomienda que la ruta debe ser con minuscula
public class ApiRestController {

    // se hace de esta manera para acceder a los metodos ya que sin
    // @Autowired se accede a los atributos de la clase que eso es una intancia
    @Autowired// inyeccion de dependencias
    AutoService autoService;// para utilizar los metodos de otra clase

    //localhost:8080/api/obtener/autos
    @RequestMapping("/obtener/autos")
    public List<Auto> obtenerListAutos(){// Se importa el objeto auto porque no pertenece a este package
        List<Auto> listaAutos = autoService.findAll();//finAll() me retorna una lista
        return listaAutos;
    }

    // JavaScript Object Notation (JSON) es un formato basado en texto estándar
    // para representa datos estructurados en la sintaxis de objetos de JavaScript.
}
