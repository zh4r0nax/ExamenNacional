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
public class TipoVenta {
    private int IDTipoVenta;
    private String Nombre;
    private int Descuento;

    public TipoVenta(int IDTipoVenta, String Nombre, int Descuento) {
        this.IDTipoVenta = IDTipoVenta;
        this.Nombre = Nombre;
        this.Descuento = Descuento;
    }

    public int getIDTipoVenta() {
        return IDTipoVenta;
    }

    public void setIDTipoVenta(int IDTipoVenta) {
        this.IDTipoVenta = IDTipoVenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    @Override
    public String toString() {
        return "TipoVenta{" + "Nombre=" + Nombre + ", Descuento=" + Descuento + '}';
    }
    
}
