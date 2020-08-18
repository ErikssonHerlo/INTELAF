/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import objetos.Cliente;


/**
 *
 * @author erikssonherlo
 */
public class AccesoCliente {
     public void insertarCliente(Cliente cliente){
        String query = "INSERT INTO CLIENTE (Nombre,NIT,Telefono,Credito_Compra,DPI,Correo_Electronico,Direccion)"
                        + "VALUES(?,?,?,?,?,?,?)";
        Connection conexion = null;
        PreparedStatement enviar = null;
        try {
            conexion = conexionDB.Conexion.conexionDB();
            enviar = conexion.prepareStatement(query);
            enviar.setString(1, cliente.getNombre());
            enviar.setString(2, cliente.getNIT());
            enviar.setString(3, cliente.getTelefono());
            enviar.setDouble(4, cliente.getCreditoCompra());
            enviar.setString(5, cliente.getDPI());
            enviar.setString(6, cliente.getCorreoElectronico());
            enviar.setString(7, cliente.getDireccion());
            
            enviar.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            
        }finally {
            conexionDB.Conexion.close(enviar);
        conexionDB.Conexion.close(conexion);
        
        }
    }
}
