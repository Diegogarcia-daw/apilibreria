package edu.spring.estudiolibreria.model;


public class Autor {

    private Integer id;
    private String nombre;
    private String nacionalidad;
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


