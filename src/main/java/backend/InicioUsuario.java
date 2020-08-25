/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesoAObjetos.AccesoCliente;
import accesoAObjetos.AccesoEmpleado;
import accesoAObjetos.AccesoTienda;
import com.mycompany.UI.paraEmpleados.Inicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.Empleado;
import objetos.Tienda;

/**
 *
 * @author erikssonherlo
 */
public class InicioUsuario {
    
    public Empleado iniciarSesionEmpleado (String codigo){
        AccesoEmpleado emp = new AccesoEmpleado();
        Empleado e = emp.obtenerEmpleado(codigo);
        return e;
    }
        /*public void iniciarSesionCliente (String NIT){
        AccesoCliente cliente = new AccesoCliente();
        Cliente c = cliente.insertarCliente(cliente);
        if(e != null){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Bienvenido "+e.toString());
            Inicio.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor Ingrese su Codigo de Empleado");
        }
    
    }*/
    public Tienda verificarEstadoDB(){
        AccesoTienda tiendaExistente = new AccesoTienda();
        Tienda t = tiendaExistente.obtenerTienda();
        return t;
    }
    public Cliente iniciarSesionCliente (String codigo){
    AccesoCliente cliente = new AccesoCliente();
    Cliente n = cliente.obtenerCliente(codigo);
    //return e
        return n;
            
    }
    
}
