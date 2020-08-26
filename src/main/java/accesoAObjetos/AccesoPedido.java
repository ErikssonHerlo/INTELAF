/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Pedido;


/**
 *
 * @author erikssonherlo
 */
public class AccesoPedido {
      public void insertarPedido(Pedido pedido){
        String query="INSERT INTO PEDIDO(Codigo_Pedido,Fecha,Fecha_Llegada,NIT_Cliente,Anticipo_Efectivo,Anticipo_Credito,Anticipo,Total,Total_A_Pagar,Pago_Total,Caja,Estado)"
                    +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido, Total=Total+?,Total_A_Pagar=Total-Anticipo";
        
        String queryDividido="INSERT INTO DETALLE_PEDIDO(Codigo_Pedido,Tienda_Origen,Tienda_Destino,Codigo_Producto,Cantidad,Precio,SubTotal,Id_Tiempo,Tiempo_Tiendas)"
                            +"VALUES(?,?,?,?,?,"
                            +"(SELECT Precio FROM EXISTENCIA_PRODUCTO WHERE Codigo_Producto=? AND Codigo_Tienda=? LIMIT 1)"
                            + ",?,"
                            +"(SELECT Id_Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1),"
                            + "(SELECT Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1))";
        
        String queryUpdate="UPDATE PEDIDO SET Fecha_Llegada=DATE_ADD(Fecha, INTERVAL (SELECT Tiempo_Tiendas FROM DETALLE_PEDIDO WHERE Codigo_Pedido=? LIMIT 1) DAY) WHERE Codigo_Pedido=?";
        
        String estado = "Transito";
        double anticipo = pedido.getAnticipoEfectivo() + pedido.getAnticipoCredito();
        //double total =+ pedido.getSubTotal();
        //double totalAPagar =  - anticipo;
        //double tota
        double caja = anticipo+ pedido.getPagoTotal();
       
        try {
            //ENVIA TODOS LOS DATOS A LA TABLA PEDIDO
            PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            
            enviar.setInt(1, pedido.getCodigoPedido());
            enviar.setString(2, pedido.getFecha());
            enviar.setString(3, pedido.getFechaLlegada());
            enviar.setString(4, pedido.getNITCliente());
            enviar.setDouble(5, pedido.getAnticipoEfectivo());
            enviar.setDouble(6, pedido.getAnticipoCredito());
            enviar.setDouble(7, anticipo);
            enviar.setDouble(8, pedido.getSubTotal());
            enviar.setDouble(9, pedido.getTotalAPagar());
            enviar.setDouble(10, pedido.getPagoTotal());
            enviar.setDouble(11, caja);
            enviar.setString(12, estado);
            enviar.setDouble(13, pedido.getSubTotal());
            enviar.executeUpdate();


            
            //Envia los Datos a la Tabla DetallePedido
            PreparedStatement enviarDividido =Conexion.conexion.prepareStatement(queryDividido);
            enviarDividido.setInt(1, pedido.getCodigoPedido());
            enviarDividido.setString(2, pedido.getTiendaOrigen());
            enviarDividido.setString(3, pedido.getTiendaDestino());
            enviarDividido.setString(4, pedido.getCodigoProducto());
            enviarDividido.setInt(5, pedido.getCantidad());
            
            enviarDividido.setString(6, pedido.getCodigoProducto());//PARA OBTENER EL PRECIO DEL PRODUCTO
            enviarDividido.setString(7, pedido.getTiendaOrigen());
            
            enviarDividido.setDouble(8, pedido.getSubTotal());
            enviarDividido.setString(9, pedido.getTiendaOrigen());  //QUERY PARA ID TIEMPO
            enviarDividido.setString(10, pedido.getTiendaDestino());
            enviarDividido.setString(11, pedido.getTiendaOrigen()); //QUERY PARA TIEMPO ENTRE TIENDAS;
            enviarDividido.setString(12, pedido.getTiendaDestino());   
            enviarDividido.executeUpdate();
            
            //Envia un Update para obtener las Fechas de Llegada en Pedido
            PreparedStatement enviarUpdate = Conexion.conexion.prepareStatement(queryUpdate);
            enviarUpdate.setInt(1, pedido.getCodigoPedido());
            enviarUpdate.setInt(2, pedido.getCodigoPedido());
            enviarUpdate.executeUpdate();
            
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
      
       public void insertarNuevoPedido(Pedido pedido){
        String query="INSERT INTO PEDIDO(Codigo_Pedido,Fecha,Fecha_Llegada,NIT_Cliente,Anticipo_Efectivo,Anticipo_Credito,Anticipo,Total,Total_A_Pagar,Pago_Total,Caja,Estado)"
                    +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido";
        
        String queryDividido="INSERT INTO DETALLE_PEDIDO(Codigo_Pedido,Tienda_Origen,Tienda_Destino,Codigo_Producto,Cantidad,Precio,SubTotal,Id_Tiempo,Tiempo_Tiendas)"
                            +"VALUES(?,?,?,?,?,?,?,"
                            +"(SELECT Id_Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1),"
                            + "(SELECT Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1))";
        
        String queryUpdate="UPDATE PEDIDO SET Fecha_Llegada=DATE_ADD(Fecha, INTERVAL (SELECT Tiempo_Tiendas FROM DETALLE_PEDIDO WHERE Codigo_Pedido=? LIMIT 1) DAY) WHERE Codigo_Pedido=?";
        
        
        double anticipo = pedido.getAnticipoEfectivo() + pedido.getAnticipoCredito();
        //double total =+ pedido.getSubTotal();
        //double totalAPagar =  - anticipo;
        //double tota
        double caja = anticipo+ pedido.getPagoTotal();
       
        try {
            //ENVIA TODOS LOS DATOS A LA TABLA PEDIDO
            PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            
            enviar.setInt(1, pedido.getCodigoPedido());
            enviar.setString(2, pedido.getFecha());
            enviar.setString(3, pedido.getFechaLlegada());
            enviar.setString(4, pedido.getNITCliente());
            enviar.setDouble(5, pedido.getAnticipoEfectivo());
            enviar.setDouble(6, pedido.getAnticipoCredito());
            enviar.setDouble(7, pedido.getAnticipo());
            enviar.setDouble(8, pedido.getTotal());
            enviar.setDouble(9, pedido.getTotalAPagar());
            enviar.setDouble(10, pedido.getPagoTotal());
            enviar.setDouble(11, pedido.getCaja());
            enviar.setString(12, pedido.getEstado());
            enviar.executeUpdate();


            
            //Envia los Datos a la Tabla DetallePedido
            PreparedStatement enviarDividido =Conexion.conexion.prepareStatement(queryDividido);
            enviarDividido.setInt(1, pedido.getCodigoPedido());
            enviarDividido.setString(2, pedido.getTiendaOrigen());
            enviarDividido.setString(3, pedido.getTiendaDestino());
            enviarDividido.setString(4, pedido.getCodigoProducto());
            enviarDividido.setInt(5, pedido.getCantidad());
            enviarDividido.setDouble(6, pedido.getPrecio());
            enviarDividido.setDouble(7, pedido.getSubTotal());
            
            enviarDividido.setString(8, pedido.getTiendaOrigen());  //QUERY PARA ID TIEMPO
            enviarDividido.setString(9, pedido.getTiendaDestino());
            enviarDividido.setString(10, pedido.getTiendaOrigen()); //QUERY PARA TIEMPO ENTRE TIENDAS;
            enviarDividido.setString(11, pedido.getTiendaDestino());   
            enviarDividido.executeUpdate();
            
            //Envia un Update para obtener las Fechas de Llegada en Pedido
            PreparedStatement enviarUpdate = Conexion.conexion.prepareStatement(queryUpdate);
            enviarUpdate.setInt(1, pedido.getCodigoPedido());
            enviarUpdate.setInt(2, pedido.getCodigoPedido());
            enviarUpdate.executeUpdate();
            
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
/*
        /*String queryPedido = "INSERT INTO pedidos(id, clientesNit, tiemposId, fechaPedido, anticipo) "
                + "VALUES (?, ?, "
                + "(SELECT id FROM tiempos WHERE tiendasOrigen = ? AND tiendasDestino = ? LIMIT 1)"
                + ", ?, ?)"
                + " ON DUPLICATE KEY UPDATE id = id";
        */