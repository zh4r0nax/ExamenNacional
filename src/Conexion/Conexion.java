/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Interfaces.IConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author juang
 */
public class Conexion implements IConexion{

    protected Connection conextion;
    //private static final String driver = "com.mysql.jdbc.Driver";
    private String driver = "";
    private String DB_Host = "";
    private String DB_User = "";
    private String DB_Pass = "";
    
    //ambiente Universidad
    //private static final String DB_Host = "jdbc:mysql://localhost/solemne2java";
    //private static final String DB_User = "root";
    //private static final String DB_Pass = "";

    public Conexion() {
        String Ambiente ="Universidad";
        ObtenerParametros(Ambiente);
    }
    
    
    @Override
    public void ObtenerParametros(String Ambiente) {
        switch(Ambiente){
            case "Local":
                this.driver= "com.mysql.cj.jdbc.Driver";
                this.DB_Host = "jdbc:mysql://localhost:3308/examen?verifyServerCertificate=false&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                this.DB_User = "poo";
                this.DB_Pass = "poo2018";
                break;
            case "Universidad":
                this.driver= "com.mysql.cj.jdbc.Driver";
                this.DB_Host = "jdbc:mysql://localhost/examen";
                this.DB_User = "root";
                this.DB_Pass = "";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sistema sin configuracion DB","Conexion",JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    @Override
    public void Conectar() throws Exception{
        try{
            Class.forName(driver);
            conextion = DriverManager.getConnection(DB_Host,DB_User,DB_Pass);
            //System.out.println("Conexión exitosa");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex,"Conectar",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void Desconectar() throws SQLException{
        try{
            
            if (conextion != null){
               if(!conextion.isClosed()){
                   conextion.close();
               }
           }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"Desconectar",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
