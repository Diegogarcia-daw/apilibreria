package edu.spring.estudiolibreria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;
    @Column(name = "biografia", nullable = false)
    private String biografia;

    
    public Autor(Integer id, String nombre, String nacionalidad, String biografia) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }


    public Autor() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }   

    public String getNombre() {
        return nombre;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    public String getNacionalidad() {
        return nacionalidad;
    }   

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }   

    public String getBiografia() {
        return biografia;
    }   

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }   


}


