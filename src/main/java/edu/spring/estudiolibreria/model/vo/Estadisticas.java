package edu.spring.estudiolibreria.model.vo;

import java.util.Date;

public class Estadisticas {

    private Integer vecesPrestado;
    private Date ultimaFecha;

    public Estadisticas(Integer vecesPrestado, Date ultimaFecha) {
        this.vecesPrestado = vecesPrestado;
        this.ultimaFecha = ultimaFecha;
    }

    public Estadisticas() {
    }

    public Integer getVecesPrestado() {
        return vecesPrestado;
    }

    public Date getUltimaFecha() {
        return ultimaFecha;
    }
}
