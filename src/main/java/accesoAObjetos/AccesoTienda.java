/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Empleado;
import objetos.Tienda;


/**
 *
 * @author erikssonherlo
 */
public class AccesoTienda {
        public boolean insertarTienda(Tienda tienda){
        String query = "INSERT INTO TIENDA (Nombre,Direccion,Codigo_Tienda,Telefono_1,Telefono_2,Horario,Correo_Electronico)"
                        + "VALUES(?,?,?,?,?,?,?)";
        
        
       
        try {
            PreparedStatement enviar  = Conexion.conexion.prepareStatement(query);
            
            enviar.setString(1, tienda.getNombre());
            enviar.setString(2, tienda.getDireccion());
            enviar.setString(3, tienda.getCodigoTienda());
            enviar.setString(4, tienda.getTelefono1());
            enviar.setString(5, tienda.getTelefono2());
            enviar.setString(6, tienda.getHorario());
            enviar.setString(7, tienda.getCorreoElectronico());
            
            enviar.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return false;
            
        }
       
    }
    public Tienda obtenerTienda(){
        
        Tienda tienda = null;
 
        ResultSet rs = Conexion.getTabla("SELECT * FROM TIENDA LIMIT 1");
        try {
            while (rs.next()) {
                tienda = new Tienda(rs.getString("Nombre"), rs.getString("Direccion"), rs.getString("Codigo_Tienda"), rs.getString("Telefono_1"));
                
            }

        } catch (Exception e) {

        }

        
        return tienda;
    
    }
}

        