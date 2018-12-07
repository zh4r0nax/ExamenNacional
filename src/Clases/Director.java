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
public class Director extends Persona {
    private String Nacionalidad;

    public Director(String Nacionalidad, String Rut, String Nombres, String ApellidoPaterno, String ApellidoMaterno, int Telefono) {
        super(Rut, Nombres, ApellidoPaterno, ApellidoMaterno, Telefono);
        this.Nacionalidad = Nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    @Override
    public String toString() {
        return "Director{" + "Nacionalidad=" + Nacionalidad + '}';
    }
    
    
    
}
