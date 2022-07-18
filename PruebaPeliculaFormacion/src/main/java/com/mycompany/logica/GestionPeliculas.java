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
public class GestionPeliculas {
    
         static ArrayList<Pelicula> peliculas = new ArrayList<>();
         
         public static void cargarPelicula(Pelicula pelicula){
         peliculas.add(pelicula);
         }
         
         public static void leerArray(){
            peliculas.forEach((p)-> System.out.println(p.mostrarAtributoPelicula()));
         }
         
         public static void modificarPelicula(Pelicula pelicula,String nuevoTitulo, Integer nuevoRating){
           for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(pelicula.getTitulo())) {
               p.setTitulo(nuevoTitulo);
               p.setRating(nuevoRating);
            }
          }
         }
         
         public static void peliculasTerror(){
          for (Pelicula p : peliculas) {
            if (p.dameGenero().equalsIgnoreCase("terror")) {
              System.out.println(p.mostrarAtributoPelicula());
            }
          }
         }
}
