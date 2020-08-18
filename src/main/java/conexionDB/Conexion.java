/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author erikssonherlo
 */
public class Conexion {
 
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
}
