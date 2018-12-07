/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author juang
 */
public class Pelicula {
    private int IDPelicula;
    private String Nombre;
    private Date duracion;
    private String Idioma;
    private String Director;
    private String Resumen;

    public Pelicula(int IDPelicula, String Nombre, Date duracion, String Idioma, String Director, String Resumen) {
        this.IDPelicula = IDPelicula;
        this.Nombre = Nombre;
        this.duracion = duracion;
        this.Idioma = Idioma;
        this.Director = Director;
        this.Resumen = Resumen;
    }

    public int getIDPelicula() {
        return IDPelicula;
    }

    public void setIDPelicula(int IDPelicula) {
        this.IDPelicula = IDPelicula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Nombre=" + Nombre + ", duracion=" + duracion + '}';
    }
    
    
    
}
