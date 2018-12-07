/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juang
 */
public class Localidad {
    private int IDLocalidad;
    private String Nombre;

    public Localidad(int IDLocalidad, String Nombre) {
        this.IDLocalidad = IDLocalidad;
        this.Nombre = Nombre;
    }

    public int getIDLocalidad() {
        return IDLocalidad;
    }

    public void setIDLocalidad(int IDLocalidad) {
        this.IDLocalidad = IDLocalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Localidad{" + "IDLocalidad=" + IDLocalidad + ", Nombre=" + Nombre + '}';
    }
    
    
    
}
