/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Producto;

/**
 *
 * @author erikssonherlo
 */
public class AccesoProducto {
    public void insertarProducto(Producto producto){
        String query="INSERT INTO PRODUCTO(Nombre,Fabricante,Codigo_Producto,Precio,Descripcion,Garantia)"
                    +"VALUES(?,?,?,?,?,?)ON DUPLICATE KEY UPDATE Codigo_Producto=Codigo_Producto";
        
        String queryDividido="INSERT INTO EXISTENCIA(Codigo_Producto,Codigo_Tienda,Cantidad)"
                    +"VALUES(?,?,?)";
        Connection conexion = null;
        PreparedStatement enviar = null;
        PreparedStatement enviarDividido=null;
	//
        try {
            conexion = conexionDB.Conexion.conexionDB();
            enviar = conexion.prepareStatement(query);
            //Envia los Datos a la Tabla Producto
            enviar.setString(1, producto.getNombre());
            enviar.setString(2, producto.getFabricante());
            enviar.setString(3, producto.getCodigoProducto());
            enviar.setDouble(4, producto.getPrecio());
            enviar.setString(5, producto.getDescripcion());
            enviar.setInt(6, producto.getGarantia());
            enviar.executeUpdate();
            
            //Envia los Datos a la Tabla Existencia
            enviarDividido=conexion.prepareStatement(queryDividido);
            enviarDividido.setString(1, producto.getCodigoProducto());
            enviarDividido.setString(2, producto.getTiendaUbicacion());
            enviarDividido.setInt(3, producto.getCantidad());
            enviarDividido.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            conexionDB.Conexion.close(enviar);
            conexionDB.Conexion.close(enviarDividido);
            conexionDB.Conexion.close(conexion);

        }
    }
    
    
}
