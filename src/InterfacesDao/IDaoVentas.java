/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesDao;

import Clases.Venta;
import java.util.List;

/**
 *
 * @author juang
 */
public interface IDaoVentas {
    boolean Registrar(Venta Venta);
    boolean Modificar(Venta Venta);
    boolean Eliminar(Venta Venta);
    List<Venta> Listar(Venta Venta);    
}
