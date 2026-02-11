package edu.spring.estudiolibreria.model.vo;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
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

    public void setVecesPrestado(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVecesPrestado'");
    }

    public void setUltimaFecha(LocalDateTime now) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUltimaFecha'");
    }
}
