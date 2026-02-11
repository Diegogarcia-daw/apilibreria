package edu.spring.estudiolibreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.estudiolibreria.model.Libro;
import edu.spring.estudiolibreria.model.Enum.Estado;
import edu.spring.estudiolibreria.repository.LibroRepository;

import java.time.LocalDateTime;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Transactional
    public void prestarLibro(Integer id) {
        Libro libro = libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado"));

        if (libro.getEstado() != Estado.DISPONIBLE) {
            throw new RuntimeException("El libro no está disponible para préstamo porque ya está prestado o no está disponible.");
        }

        libro.setEstado(Estado.PRESTADO);


        Integer vecesPrestado = libro.getEstadisticas().getVecesPrestado();
        libro.getEstadisticas().setVecesPrestado(vecesPrestado + 1);

        libroRepository.save(libro);
    }


    @Transactional
    public void devolverLibro(Integer id) {
        Libro libro = libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado con ID: " + id));

        if (libro.getEstado() != Estado.PRESTADO) {
            throw new RuntimeException("El libro no está prestado, no se puede devolver.");
        }

        libro.setEstado(Estado.DISPONIBLE);

        libro.getEstadisticas().setUltimaFecha(LocalDateTime.now());
        
        libroRepository.save(libro);

    }

    @Transactional
    public void desactivarLibro(Integer id){
        Libro libro = libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado con ID: " + id));

        libro.setEstado(Estado.INACTIVO);

        libroRepository.save(libro);
    }

}
