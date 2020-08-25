/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import accesoAObjetos.AccesoCliente;
import accesoAObjetos.AccesoEmpleado;
import accesoAObjetos.AccesoPedido;
import accesoAObjetos.AccesoProducto;
import accesoAObjetos.AccesoTiempo;
import accesoAObjetos.AccesoTienda;
import conexionMySQL.AccesoClienteSQL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import objetos.Cliente;

import objetos.Empleado;
import objetos.Pedido;
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
           
            distribuirDatos(cadena);
          
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
            enviarAPedido(linea);
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
        if(!llenar.insertarTienda(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar la tienda "+partes[1]+"\ndebido a que ya se encuentra ingresada en la Base de Datos");
        }
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
        
        if(!llenar.insertarTiempo(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar un Nuevo Tiempo en la Tienda con el Codigo: "+partes[1]+"\ndebido a que tiene datos repetidos con otra Tiempo ingresada en la Base de Datos");
        }
        }
    
    public void enviarAProducto(String linea){
        String [] partes = linea.split(",");
        int existenciaProducto = Integer.parseInt(partes[4]);
        Double precio = Double.parseDouble(partes[5]);
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Nombre: "+partes[1]);
        System.out.println("Parte 2 Fabricante: "+partes[2]);
        System.out.println("Parte 3 CodigoProducto: "+partes[3]);
        System.out.println("Parte 4 Existencia: "+existenciaProducto);
        System.out.println("Parte 5 Precio: "+precio);
        System.out.println("Parte 6 CodigoTienda: "+partes[6]);
        
        Producto nuevo = new Producto(partes[1], partes[2], partes[3], existenciaProducto, precio, partes[6]);
        accesoAObjetos.AccesoProducto llenar = new AccesoProducto();
        if(!llenar.insertarProducto(nuevo))   
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar el Producto "+partes[1]+"\ndebido a que ya se encuentra ingresada en la Base de Datos");
        } 
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
         
          if(!llenar.insertarEmpleado(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar el Empleado "+partes[1]+"\ndebido a que tiene datos repetidos con otro Empleado ingresado en la Base de Datos");
        }
        
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
        
        //conexionMySQL.AccesoClienteSQL lleno = new AccesoClienteSQL();
        accesoAObjetos.AccesoCliente llenar = new AccesoCliente();
        //lleno.insertarCliente(nuevo);
        
           if(!llenar.insertarCliente(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar al Cliente "+partes[1]+"\ndebido a que tiene datos repetidos con otro Cliente ingresado en la Base de Datos");
        }
        }
    public void enviarAPedido(String linea){
        String [] partes = linea.split(",");
        int codigoPedido = Integer.parseInt(partes[1]);
        int cantidadProductos = Integer.parseInt(partes[7]);
        Double totalProducto = Double.parseDouble(partes[8]);
        Double anticipoPedido = Double.parseDouble(partes[9]);
        System.out.println(linea);
        System.out.println("Parte 0 Tabla: "+partes[0]);
        System.out.println("Parte 1 Codigo Pedido: "+codigoPedido);
        System.out.println("Parte 2 Tienda Origen:"+partes[2]);
        System.out.println("Parte 3 Tienda Destino: "+partes[3]);
        System.out.println("Parte 4 Fecha: "+partes[4]);
        System.out.println("Parte 5 NIT Cliente: "+partes[5]);
        System.out.println("Parte 6 Codigo Producto: "+partes[6]);
        System.out.println("Parte 7 Cantidad: "+cantidadProductos);
        System.out.println("Parte 8 Total: "+totalProducto);
        System.out.println("Parte 9 Anticipo: "+anticipoPedido);

        Pedido nuevo = new Pedido(codigoPedido,partes[2],partes[3],partes[4],partes[5],partes[6],cantidadProductos,totalProducto,anticipoPedido);
       
        accesoAObjetos.AccesoPedido llenar = new AccesoPedido(); 
        llenar.insertarPedido(nuevo);
        
        }
 
    
}