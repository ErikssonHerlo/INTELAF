/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import objetos.Tiempo;


/**
 *
 * @author erikssonherlo
 */
public class AccesoTiempo {
     public boolean insertarTiempo(Tiempo tiempo){
        String query = "INSERT INTO TIEMPO (Tienda_Origen,Tienda_Destino,Tiempo)"
                        + "VALUES(?,?,?)";
        
        
        
        try {
            PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            
            //Envia los Datos de Tiempo de Origen y Destino
            enviar.setString(1, tiempo.getTiendaOrigen());
            enviar.setString(2, tiempo.getTiendaDestino());
            enviar.setInt(3, tiempo.getTiempo());
            enviar.executeUpdate();
            
            //Al ser los mismos datos de Origen y Destino Invertido, se utiliza la misma query
            PreparedStatement enviarDoble = Conexion.conexion.prepareStatement(query);
            enviarDoble.setString(1, tiempo.getTiendaDestino());
            enviarDoble.setString(2, tiempo.getTiendaOrigen());
            enviarDoble.setInt(3, tiempo.getTiempo());
            enviarDoble.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }
    
}
