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
public class TipoSala {
    private int IDTipoSala;
    private String Nombre;

    public TipoSala(int IDTipoSala, String Nombre) {
        this.IDTipoSala = IDTipoSala;
        this.Nombre = Nombre;
    }

    public int getIDTipoSala() {
        return IDTipoSala;
    }

    public void setIDTipoSala(int IDTipoSala) {
        this.IDTipoSala = IDTipoSala;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "TipoSala{" + "IDTipoSala=" + IDTipoSala + ", Nombre=" + Nombre + '}';
    }
    
}
