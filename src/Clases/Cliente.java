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
public class Cliente extends Persona {

    private int IDCliente;

    public Cliente(int IDCliente, String Rut, String Nombres, String ApellidoPaterno, String ApellidoMaterno, int Telefono) {
        super(Rut, Nombres, ApellidoPaterno, ApellidoMaterno, Telefono);
        this.IDCliente = IDCliente;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" +this.getNombres()+' '+this.getApellidoPaterno()+ '}';
    }
    
    
}
