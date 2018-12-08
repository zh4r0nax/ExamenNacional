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
public class Cartelera {
    private int IDCartelera;
    private int IDPelicula;
    private int IDsala;
    private Date Fecha;
    private int IDLocalidad;
    private int Precio;

    public Cartelera() {
    }

    public int getIDCartelera() {
        return IDCartelera;
    }

    public void setIDCartelera(int IDCartelera) {
        this.IDCartelera = IDCartelera;
    }

    public int getIDPelicula() {
        return IDPelicula;
    }

    public void setIDPelicula(int IDPelicula) {
        this.IDPelicula = IDPelicula;
    }

    public int getIDsala() {
        return IDsala;
    }

    public void setIDsala(int IDsala) {
        this.IDsala = IDsala;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIDLocalidad() {
        return IDLocalidad;
    }

    public void setIDLocalidad(int IDLocalidad) {
        this.IDLocalidad = IDLocalidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Cartelera{" + "IDPelicula=" + IDPelicula + ", IDsala=" + IDsala + ", Fecha=" + Fecha + ", IDLocalidad=" + IDLocalidad + ", Precio=" + Precio + '}';
    }
    
    
}
