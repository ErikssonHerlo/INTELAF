/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAObjetos;

import conexionMySQL.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Venta;


/**
 *
 * @author erikssonherlo
 */
public class AccesoVenta {
    public void insertarNuevaVenta(Venta venta){
        String query="INSERT INTO VENTAS(Id_Ventas,Fecha,NIT_Cliente,Total_A_Pagar,Efectivo,Credito_Cliente,Caja)"
                    +"VALUES(?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE Id_Ventas = Id_Ventas";
        
        String queryDividido="INSERT INTO DETALLE_VENTAS(Id_Ventas,Tienda_Existencia,Codigo_Producto,Cantidad_Venta,Precio,SubTotal)"
                    +"VALUES(?,?,?,?,?,?)";
        
        String querys="INSERT INTO PEDIDO(Codigo_Pedido,Fecha,Fecha_Llegada,NIT_Cliente,Anticipo_Efectivo,Anticipo_Credito,Anticipo,Total,Total_A_Pagar,Pago_Total,Caja,Estado)"
                    +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?)ON DUPLICATE KEY UPDATE Codigo_Pedido=Codigo_Pedido";
        
        String querysDividido="INSERT INTO DETALLE_PEDIDO(Codigo_Pedido,Tienda_Origen,Tienda_Destino,Codigo_Producto,Cantidad,Precio,SubTotal,Id_Tiempo,Tiempo_Tiendas)"
                            +"VALUES(?,?,?,?,?,?,?,"
                            +"(SELECT Id_Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1),"
                            + "(SELECT Tiempo FROM TIEMPO WHERE Tienda_Origen=? AND Tienda_Destino=? LIMIT 1))";
        
        String queryUpdate="UPDATE PEDIDO SET Fecha_Llegada=DATE_ADD(Fecha, INTERVAL (SELECT Tiempo_Tiendas FROM DETALLE_PEDIDO WHERE Codigo_Pedido=? LIMIT 1) DAY) WHERE Codigo_Pedido=?";
        
        

       
        try {
            //ENVIA TODOS LOS DATOS A LA TABLA VENTAS
            PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
            
            enviar.setInt(1, venta.getIdVentas());
            enviar.setString(2, venta.getFecha());
            enviar.setString(3, venta.getNITCliente());
            enviar.setDouble(4, venta.getTotalAPagar());
            enviar.setDouble(5, venta.getEfectivo());
            enviar.setDouble(6, venta.getCreditoCliente());
            enviar.setDouble(7, venta.getCaja());
            enviar.executeUpdate();
            
            //ENVIA TODOS LOS DATOS A LA TABLA DETALLE_VENTAS
            PreparedStatement enviarDividido =Conexion.conexion.prepareStatement(queryDividido);
            
            enviarDividido.setInt(1, venta.getIdVentas());
            enviarDividido.setString(2, venta.getTiendaExistencia());
            enviarDividido.setString(3, venta.getCodigoProducto());
            enviarDividido.setInt(4, venta.getCantidad());
            enviarDividido.setDouble(5, venta.getPrecio());
            enviarDividido.setDouble(6, venta.getSubTotal());
            enviarDividido.executeUpdate();
                  
             } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
