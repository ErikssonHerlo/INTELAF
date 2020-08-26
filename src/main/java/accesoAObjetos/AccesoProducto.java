/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Producto;

/**
 *
 * @author erikssonherlo
 */
public class AccesoProducto {
    public boolean insertarProducto(Producto producto){
        String query="INSERT INTO EXISTENCIA_PRODUCTO(Nombre,Fabricante,Codigo_Producto,Existencia,Precio,Codigo_Tienda,Descripcion,Garantia)"
                    +"VALUES(?,?,?,?,?,?,?,?)";
        
        
        
        try {PreparedStatement enviar =Conexion.conexion.prepareStatement(query);
            
            enviar.setString(1, producto.getNombre());
            enviar.setString(2, producto.getFabricante());
            enviar.setString(3, producto.getCodigoProducto());
            enviar.setInt(4, producto.getExistencia());
            enviar.setDouble(5, producto.getPrecio());
            enviar.setString(6, producto.getTiendaUbicacion());
            enviar.setString(7, producto.getDescripcion());
            enviar.setInt(8, producto.getGarantia());
            enviar.executeUpdate();
            return true;
         
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }
    public boolean actualizarExistencias(Producto producto){
        //String query="INSERT INTO EXISTENCIA_PRODUCTO(Nombre,Fabricante,Codigo_Producto,Existencia,Precio,Codigo_Tienda,Descripcion,Garantia)"
                   // +"VALUES(?,?,?,?,?,?,?,?)";
          String queryUpdate="UPDATE EXISTENCIA_PRODUCTO SET Existencia=Existencia - ? WHERE Codigo_Producto = ? AND Codigo_Tienda = ?";
     
        
        
        try {PreparedStatement enviar =Conexion.conexion.prepareStatement(queryUpdate);
            
            enviar.setInt(1, producto.getExistencia());
            enviar.setString(2, producto.getCodigoProducto());
            enviar.setString(3, producto.getTiendaUbicacion());
            enviar.executeUpdate();
            return true;
         
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }
    
}
