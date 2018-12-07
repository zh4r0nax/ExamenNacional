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
public class Asientos {
    private String Fila;
    private int numero;

    public Asientos(String Fila, int numero) {
        this.Fila = Fila;
        this.numero = numero;
    }

    public String getFila() {
        return Fila;
    }

    public void setFila(String Fila) {
        this.Fila = Fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Asientos{" + "Fila=" + Fila + ", numero=" + numero + '}';
    }
    
    
}
