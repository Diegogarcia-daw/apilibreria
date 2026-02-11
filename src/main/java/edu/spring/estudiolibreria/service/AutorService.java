package edu.spring.estudiolibreria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.estudiolibreria.model.Autor;
import edu.spring.estudiolibreria.repository.AutorRepository;

@Service
public class AutorService {


    @Autowired
    private AutorRepository autorRepository;


    @Transactional
    public List<Autor> obtenerTodos(){
        return autorRepository.findAll();
    
    }

    @Transactional
    public Optional<Autor> obtenerPorId(Integer id) {
        return autorRepository.findById(id);
    }
}
