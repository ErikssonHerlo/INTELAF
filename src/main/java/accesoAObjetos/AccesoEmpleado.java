/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Empleado;

/**
 *
 * @author erikssonherlo
 */
public class AccesoEmpleado {
    public boolean insertarEmpleado(Empleado empleado){
        String query = "INSERT INTO EMPLEADO (Nombre,Codigo_Empleado,Telefono,DPI,NIT,Correo_Electronico,Direccion)"
                        + "VALUES(?,?,?,?,?,?,?)";
        
        
        try {
           PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            enviar.setString(1, empleado.getNombre());
            enviar.setString(2, empleado.getCodigoEmpleado());
            enviar.setString(3, empleado.getTelefono());
            enviar.setString(4, empleado.getDPI());
            enviar.setString(5, empleado.getNIT());
            enviar.setString(6, empleado.getCorreoElectronico());
            enviar.setString(7, empleado.getDireccion());
            enviar.executeUpdate();
            return true;
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return true;
            
        }
    }
    public Empleado obtenerEmpleado(String codigo){
        String query = "SELECT * FROM EMPLEADO WHERE Codigo_Empleado = ?";
        Empleado empleado = null;
                
        
        
        
        
        try {
            PreparedStatement obtener  = Conexion.conexion.prepareStatement(query);
            obtener.setString(1, codigo);
            ResultSet rs = obtener.executeQuery();
            if(rs.next()){
              //  empleado = new Empleado(rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"), rs.getString("NIT"), codigo, query)
                empleado=new Empleado(rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"));
                empleado.setNIT(rs.getString("NIT"));
                empleado.setCorreoElectronico(rs.getString("Correo_Electronico"));
                empleado.setDireccion(rs.getString("Direccion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleado;
    
    }
}
