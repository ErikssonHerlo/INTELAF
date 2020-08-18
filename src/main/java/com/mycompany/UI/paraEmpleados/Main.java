/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraEmpleados;

import conexionDB.Conexion;

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
        // TODO code application logic here
        System.out.println("Hola Mundo, estoy usando Maven");
       // Conexion c1 = new Conexion();
        //c1.conectar();
        
        /*Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);
*/
        CargaArchivo leerArchivo = new CargaArchivo();
        leerArchivo.setVisible(true);
    
}
    
}
