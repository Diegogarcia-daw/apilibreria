package edu.spring.estudiolibreria.model;

import edu.spring.estudiolibreria.model.Enum.Estado;
import edu.spring.estudiolibreria.model.vo.DetallesFisicos;
import edu.spring.estudiolibreria.model.vo.Estadisticas;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;


@Entity
@Table (name="Libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "isbn", nullable = false)
    private String ISBN;
    @Column(name = "anopublicacion", nullable = false)
    private Integer anopublicacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "numeroPaginas", column = @Column(name = "numero_paginas")),
        @AttributeOverride(name = "peso", column = @Column(name = "peso")),
        @AttributeOverride(name = "dimensiones", column = @Column(name = "dimensiones"))
    })
    private DetallesFisicos detallesFisicos;
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "vecesPrestado", column = @Column(name = "veces_prestado")),
        @AttributeOverride(name = "ultimaFecha", column = @Column(name = "ultima_fecha"))
    })
    private Estadisticas estadisticas;

    @ManyToOne
    private Autor autor;



    public Libro() {
    }

    public Libro(Integer id, String titulo, String ISBN, Integer anopublicacion, Estado estado,
            DetallesFisicos detallesFisicos, Estadisticas estadisticas, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.anopublicacion = anopublicacion;
        this.estado = estado;
        this.detallesFisicos = detallesFisicos;
        this.estadisticas = estadisticas;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public Integer getAnopublicacion() {
        return anopublicacion;
    }

    public void setAnopublicacion(Integer anopublicacion) {
        this.anopublicacion = anopublicacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public DetallesFisicos getDetallesFisicos() {
        return detallesFisicos;
    }

    public void setDetallesFisicos(DetallesFisicos detallesFisicos) {
        this.detallesFisicos = detallesFisicos;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    
}
