package edu.spring.estudiolibreria.model.vo;

public class DetallesFisicos {
    private Integer numeroPaginas;
    private Integer peso;
    private Integer dimensiones;

    public DetallesFisicos(Integer numeroPaginas, Integer peso, Integer dimensiones) {
        this.numeroPaginas = numeroPaginas;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public DetallesFisicos() {
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getDimensiones() {
        return dimensiones;
    }

}
