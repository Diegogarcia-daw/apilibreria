package edu.spring.estudiolibreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.estudiolibreria.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
