/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.SQLException;

/**
 *
 * @author juang
 */
public interface IConexion {
    void ObtenerParametros(String Ambiente);//obtiene el ambiente a trabajar
    void Conectar()throws Exception;
    void Desconectar()throws SQLException;
}
