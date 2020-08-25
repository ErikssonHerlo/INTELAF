/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author erikssonherlo
 */
public class Conexion {
    private static String url="jdbc:mysql://localhost:3306/INTELAF";
    public static Connection conexion = null;
    public static Connection obtenerConexion() {
        
        try {
             conexion = (Connection) DriverManager.getConnection(url,"AdminIntelaf","Admin1234.");
            
                if(conexion != null){
                   System.out.println("Conexion establecida");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar "+ex);
        }
        return conexion;
    }

 
    public static Connection conexionDB() throws SQLException{
        String url="jdbc:mysql://localhost:3306/INTELAF";
        return DriverManager.getConnection(url,"AdminIntelaf","Admin1234.");
    }
    public static void close(Connection cerrar){
        try {
            cerrar.close();
        } catch (SQLException eX) {

        }
    }
    public static void close(PreparedStatement cerrar){
        try {
            cerrar.close();
        } catch (SQLException eX) {

        }
    }
        public static ResultSet getTabla(String consulta) {
        Connection cd = conexion;
        Statement st;
        ResultSet datos = null;
        try {
            st = cd.createStatement();
            datos = st.executeQuery(consulta);
        } catch (Exception e) {
        }
        return datos;
    }
}
