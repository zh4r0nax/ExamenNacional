/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author juang
 */
public class Sala extends TipoSala{
    private List<Asientos> lstAsientos;

    public Sala(List<Asientos> lstAsientos, int IDTipoSala, String Nombre) {
        super(IDTipoSala, Nombre);
        this.lstAsientos = lstAsientos;
    }

    public List<Asientos> getLstAsientos() {
        return lstAsientos;
    }

    public void setLstAsientos(List<Asientos> lstAsientos) {
        this.lstAsientos = lstAsientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "lstAsientos=" + lstAsientos + '}';
    }
    
    
    
}
