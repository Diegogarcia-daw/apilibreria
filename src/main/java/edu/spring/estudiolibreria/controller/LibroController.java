package edu.spring.estudiolibreria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.spring.estudiolibreria.service.LibroService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/libros")  
public class LibroController {


    @Autowired
    private LibroService libroService;

    
    @GetMapping
    public String listarLibros(Model model) {
        model.addAttribute("mislibros", libroService.obtenerTodos());
        System.out.println("LIBROS ENCONTRADOS: " + libroService.obtenerTodos().size());
        return "libros-lista";
    }
    
}
