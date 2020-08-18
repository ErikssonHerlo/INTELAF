/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import accesoAObjetos.AccesoCliente;
import accesoAObjetos.AccesoEmpleado;
import accesoAObjetos.AccesoProducto;
import accesoAObjetos.AccesoTiempo;
import accesoAObjetos.AccesoTienda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import objetos.Cliente;

import objetos.Empleado;
import objetos.Producto;
import objetos.Tiempo;
import objetos.Tienda;

/**
 *
 * @author erikssonherlo
 */
public class LecturaDeArchivo {
    
    public void muestraContenido(File archivo) throws FileNotFoundException, IOException
    {
        int i=0;
        String [] datos;
        String cadena;
        String dato="";
        
         try {
                FileReader f = new FileReader(archivo);
        
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null)
        {
            //cadena = cadena + ",";
            //dato = dato + cadena;
            distribuirDatos(cadena);
            //System.out.println(cadena);
            } 
         }
         catch (IOException e) {
             
            }                
    }      
 
    public void distribuirDatos(String linea){
        if(linea.contains("TIENDA"))
        {  
            enviarATienda(linea);
        }
        else if(linea.contains("TIEMPO"))
            {    
                enviarATiempo(linea);
            }
        else if(linea.contains("PRODUCTO"))
            {    
                enviarAProducto(linea);
            }
        else if(linea.contains("EMPLEADO"))
            {    
            enviarAEmpleado(linea);
            }
        else if (linea.contains("CLIENTE"))
            {
            enviarACliente(linea);
            }
        else if(linea.contains("PEDIDO"))
            {    
            //PEDIDO
            }
        else {
            System.out.println("Existen lineas sin una direccion en la tabla");
        }
    }
    
    
    public void enviarATienda(String linea){
        String [] partes = linea.split(",");
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 Direccion: "+partes[2]);
        System.out.println("Parte 3 CodigoTienda: "+partes[3]);
        System.out.println("Parte 4 Telefono1: "+partes[4]);
        
        Tienda nuevo = new Tienda(partes[1],partes[2],partes[3],partes[4]);
        accesoAObjetos.AccesoTienda llenar = new AccesoTienda();
        llenar.insertarTienda(nuevo);    
        }
    
    public void enviarATiempo(String linea){
        String [] partes = linea.split(",");
        int tiempoEntreTiendas = Integer.parseInt(partes[3]);
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 TiendaOrigen: "+partes[1]);
        System.out.println("Parte 2 TiendaDestino: "+partes[2]);
        System.out.println("Parte 3 Tiempo: "+tiempoEntreTiendas);
        Tiempo nuevo = new Tiempo(partes[1], partes[2], tiempoEntreTiendas);
        accesoAObjetos.AccesoTiempo llenar = new AccesoTiempo();
        llenar.insertarTiempo(nuevo);
        }
    
    public void enviarAProducto(String linea){
        String [] partes = linea.split(",");
        int cantidadProducto = Integer.parseInt(partes[4]);
        Double precio = Double.parseDouble(partes[5]);
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 Fabricante: "+partes[2]);
        System.out.println("Parte 3 CodigoProducto: "+partes[3]);
        System.out.println("Parte 4 Cantidad: "+cantidadProducto);
        System.out.println("Parte 5 Precio: "+precio);
        System.out.println("Parte 6 CodigoTienda: "+partes[6]);
        
        Producto nuevo = new Producto(partes[1], partes[2], partes[3], cantidadProducto, precio, partes[6]);
        accesoAObjetos.AccesoProducto llenar = new AccesoProducto();
        llenar.insertarProducto(nuevo);    
        }
    
    public void enviarAEmpleado(String linea){
        String [] partes = linea.split(",");
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 CodigoEmpleado: "+partes[2]);
        System.out.println("Parte 3 Telefono: "+partes[3]);
        System.out.println("Parte 4 DPI: "+partes[4]);
        
        Empleado nuevo = new Empleado(partes[1], partes[2], partes[3], partes[4]);
        accesoAObjetos.AccesoEmpleado llenar = new AccesoEmpleado();
        llenar.insertarEmpleado(nuevo);      
        
        }
    public void enviarACliente(String linea){
        String [] partes = linea.split(",");
        Double creditoCompra = Double.parseDouble(partes[4]);
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 NIT: "+partes[2]);
        System.out.println("Parte 3 Telefono: "+partes[3]);
        System.out.println("Parte 4 Credito de Compra: "+creditoCompra);
        Cliente nuevo = new Cliente(partes[1], partes[2], partes[3], creditoCompra);
        
        accesoAObjetos.AccesoCliente llenar = new AccesoCliente();
        llenar.insertarCliente(nuevo);
        
        }
}