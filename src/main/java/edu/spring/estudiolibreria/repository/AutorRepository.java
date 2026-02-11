package edu.spring.estudiolibreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.estudiolibreria.model.Autor;
import java.util.List;
import java.util.Optional;



public interface AutorRepository extends JpaRepository<Autor, Integer> {

    Optional<Autor> findById(Integer id);

    List<Autor> findAll();
}
