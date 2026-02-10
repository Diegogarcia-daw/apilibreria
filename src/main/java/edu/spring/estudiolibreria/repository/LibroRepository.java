package edu.spring.estudiolibreria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.estudiolibreria.model.Autor;
import edu.spring.estudiolibreria.model.Libro;
import edu.spring.estudiolibreria.model.Enum.Estado;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    List<Libro> findByAutorAndEstado(Autor autor, Estado estado);

    long countByEstado(Estado estado);

    List<Libro> findByAnopublicacionBetween(Integer anostart, Integer anoend);
    
    List<Libro> findTop5ByOrderByEstadisticasVecesPrestadoDesc();
}
