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
public class Venta {
    private int IDVenta;
    private int IDTipoVenta;
    private int IDCliente;
    private int IDCartelera;
    private int Monto;

    public Venta() {
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public int getIDTipoVenta() {
        return IDTipoVenta;
    }

    public void setIDTipoVenta(int IDTipoVenta) {
        this.IDTipoVenta = IDTipoVenta;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public int getIDCartelera() {
        return IDCartelera;
    }

    public void setIDCartelera(int IDCartelera) {
        this.IDCartelera = IDCartelera;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    @Override
    public String toString() {
        return "Venta{" + "IDTipoVenta=" + IDTipoVenta + ", IDCliente=" + IDCliente + ", IDCartelera=" + IDCartelera + ", Monto=" + Monto + '}';
    }
    
    
    

}
