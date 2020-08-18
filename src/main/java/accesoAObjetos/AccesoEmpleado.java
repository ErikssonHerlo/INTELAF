/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import objetos.Empleado;

/**
 *
 * @author erikssonherlo
 */
public class AccesoEmpleado {
    public void insertarEmpleado(Empleado empleado){
        String query = "INSERT INTO EMPLEADO (Nombre,Codigo_Empleado,Telefono,DPI,NIT,Correo_Electronico,Direccion)"
                        + "VALUES(?,?,?,?,?,?,?)";
        Connection conexion = null;
        PreparedStatement enviar = null;
        try {
            conexion = conexionDB.Conexion.conexionDB();
            enviar = conexion.prepareStatement(query);
            enviar.setString(1, empleado.getNombre());
            enviar.setString(2, empleado.getCodigoEmpleado());
            enviar.setString(3, empleado.getTelefono());
            enviar.setString(4, empleado.getDPI());
            enviar.setString(5, empleado.getNIT());
            enviar.setString(6, empleado.getCorreoElectronico());
            enviar.setString(7, empleado.getDireccion());
            
            enviar.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            
        }finally {
            conexionDB.Conexion.close(enviar);
        conexionDB.Conexion.close(conexion);
        
        }
    }
}
