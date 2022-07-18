/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

/**
 *
 * @author jcapitan
 */
public class Pelicula {
    
    private Integer codigo;
    private String titulo;
    private Genero genero;
    private Integer rating;
    private String restricion;

 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }
    
    public String dameGenero(){
        return genero.toString();
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

  


    public String getRestricion() {
        return restricion;
    }

    public void setRestricion(String restricion) {
        this.restricion = restricion;
    }

    public Pelicula(Integer codigo, String titulo, Genero genero, Integer rating, String restricion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.rating = rating;
        this.restricion = restricion;
    }



    public Pelicula() {
    }

    @Override
    public String toString() {
        return codigo +" " + titulo +" " +  genero +" " +  rating +" " +  restricion ;
    }
    
    public String mostrarAtributoPelicula(){
        return titulo +" " +  genero +" " +  rating;
    }

    
    
    
}
