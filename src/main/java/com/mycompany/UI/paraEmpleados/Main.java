/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraEmpleados;

import backend.InicioUsuario;

import conexionMySQL.Conexion;
import java.sql.Connection;
import objetos.Empleado;
import objetos.Tienda;

/**
 *
 * @author erikssonherlo
 */
public class Main {
    //int auxInicio = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.obtenerConexion();
        InicioUsuario user = new InicioUsuario();
        Tienda tienda = user.verificarEstadoDB();
        
        if(tienda == null)
        {
            CargaArchivo leerArchivo = new CargaArchivo();
        leerArchivo.setVisible(true);
            
        }else{
        Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);
        }
        // TODO code application logic here
        System.out.println("Hola Mundo, estoy usando Maven");
       // Conexion c1 = new Conexion();
        //c1.conectar();
        
        

        
       
//        ElegirTienda2 elegir = new ElegirTienda2();
  //      elegir.setVisible(true);
    
}
    
}
