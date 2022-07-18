/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logica;

import java.util.ArrayList;

/**
 *
 * @author jcapitan
 */
public class Main {
    public static void main(String[]args){
        
        
        Pelicula pelicula1 = new Pelicula(1,"Vengadores","Accion",4,"NO");
        Pelicula pelicula2 = new Pelicula(2,"Tres metros sobre el cielo","Drama",2,"NO");
        Pelicula pelicula3 = new Pelicula(3,"Old","Terror",1,"SI");
        Pelicula pelicula4 = new Pelicula(4,"Avatar","Ficcion",5,"NO");
        Pelicula pelicula5 = new Pelicula(5,"8 apellidos vascos","Comedia",2,"NO");
        
        System.out.println("PELICULAS ALMACENADAS");
        GestionPeliculas.cargarPelicula(pelicula1);
        GestionPeliculas.cargarPelicula(pelicula2);
        GestionPeliculas.cargarPelicula(pelicula3);
        GestionPeliculas.cargarPelicula(pelicula4);
        GestionPeliculas.cargarPelicula(pelicula5);
        GestionPeliculas.leerArray();
        
        System.out.println("\n"+"PELICULAS CON CAMBIO DE TITULO Y RATING");
        GestionPeliculas.modificarPelicula(pelicula5, "8 apellidos catalanes", 4);
        GestionPeliculas.modificarPelicula(pelicula1, "Vengadores-2", 3);
        System.out.println(pelicula5.mostrarAtributoPelicula());
        System.out.println(pelicula1.mostrarAtributoPelicula());
        
        
        System.out.println("\n"+"PELICULAS DE TERROR");
        GestionPeliculas.peliculasTerror();
        
    }    
}
