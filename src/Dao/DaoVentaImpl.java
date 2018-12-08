/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Clases.Venta;
import Conexion.Conexion;
import InterfacesDao.IDaoVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juang
 */
public class DaoVentaImpl extends Conexion implements IDaoVentas{

    @Override
    public boolean Registrar(Venta Venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Modificar(Venta Venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Venta Venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> Listar(Venta Venta) {
        List<Venta> lista = null ;
        try{
            this.Conectar();
            PreparedStatement st = this.conextion.prepareStatement("SELECT * FROM venta");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Venta v = new Venta();
                
                lista.add(v);
            }
            rs.close();
            st.close();
        }catch(Exception e){
             System.out.println("e");
        }finally{
            try {
                this.Desconectar();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return lista;
    }
    
}
