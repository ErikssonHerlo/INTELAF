/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import objetos.Tienda;


/**
 *
 * @author erikssonherlo
 */
public class AccesoTienda {
        public void insertarTienda(Tienda tienda){
        String query = "INSERT INTO TIENDA (Nombre,Direccion,Codigo_Tienda,Telefono_1,Telefono_2,Horario,Correo_Electronico)"
                        + "VALUES(?,?,?,?,?,?,?)";
        Connection conexion = null;
        PreparedStatement enviar = null;
        try {
            conexion = conexionDB.Conexion.conexionDB();
            enviar = conexion.prepareStatement(query);
            
            enviar.setString(1, tienda.getNombre());
            enviar.setString(2, tienda.getDireccion());
            enviar.setString(3, tienda.getCodigoTienda());
            enviar.setString(4, tienda.getTelefono1());
            enviar.setString(5, tienda.getTelefono2());
            enviar.setString(6, tienda.getHorario());
            enviar.setString(7, tienda.getCorreoElectronico());
            
            enviar.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            
        }finally {
            conexionDB.Conexion.close(enviar);
        conexionDB.Conexion.close(conexion);
        
        }
    }
}
