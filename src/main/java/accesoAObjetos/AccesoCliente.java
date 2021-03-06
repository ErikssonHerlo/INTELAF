/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import static conexionMySQL.Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Cliente;
import objetos.Empleado;


/**
 *
 * @author erikssonherlo
 */
public class AccesoCliente {  
        
     public boolean insertarCliente(Cliente cliente) {
        String query = "INSERT INTO CLIENTE (Nombre,NIT,Telefono,Credito_Compra,DPI,Correo_Electronico,Direccion)"
                        + "VALUES(?,?,?,?,?,?,?)";
        //Connection conexion = null;
         
        
                
            try{ 
            PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            
            enviar.setString(1, cliente.getNombre());
            enviar.setString(2, cliente.getNIT());
            enviar.setString(3, cliente.getTelefono());
            enviar.setDouble(4, cliente.getCreditoCompra());
            enviar.setString(5, cliente.getDPI());
            enviar.setString(6, cliente.getCorreoElectronico());
            enviar.setString(7, cliente.getDireccion());
            
            enviar.executeUpdate();
            return true;
      } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return false;
        }
        
    }

    public Cliente obtenerCliente(String codigo)
    {
        String query = "SELECT * FROM CLIENTE WHERE NIT = ?";
        Cliente cliente = null;
        try {
            
            PreparedStatement obtener = Conexion.conexion.prepareStatement(query);
            obtener.setString(1, codigo);
            ResultSet rs = obtener.executeQuery();
            if(rs.next()){
              //  empleado = new Empleado(rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"), rs.getString("NIT"), codigo, query)
              cliente = new Cliente (rs.getString("Nombre"), rs.getString("NIT"), rs.getString("Telefono"),rs.getDouble("Credito_Compra"),rs.getString("DPI"),rs.getString("Correo_Electronico"),rs.getString("Direccion"));
              }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    
    }



    public boolean actualizarCredito(Cliente cliente){
           String queryUpdate="UPDATE CLIENTE SET Credito_Compra = Credito_Compra - ? WHERE NIT = ?";

        try {
            PreparedStatement actualizar =Conexion.conexion.prepareStatement(queryUpdate);
            
            actualizar.setDouble(1, cliente.getCreditoCompra());
            actualizar.setString(2, cliente.getNIT());
            actualizar.executeUpdate();
            return true;
         
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    
        }    
    
}

            
          
    