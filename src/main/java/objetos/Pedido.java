/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author erikssonherlo
 */
public class Pedido {
    private int codigoPedido;
    private String tiendaOrigen;
    private String tiendaDestino;
    private String fecha;
    private String NITCliente;
    private String codigoProducto;
    private int cantidad;
    private double total;
    private double anticipo;
    private int idTiempo;
    
//Constructor para la Carga de Archivos
    public Pedido(int codigoPedido, String tiendaOrigen, String tiendaDestino, String fecha, String NITCliente, String codigoProducto, int cantidad, double total, double anticipo) {
        this.codigoPedido = codigoPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.fecha = fecha;
        this.NITCliente = NITCliente;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.anticipo = anticipo;
    }
    //Constructor para todos los Metodos
    public Pedido(int codigoPedido, String tiendaOrigen, String tiendaDestino, String fecha, String NITCliente, String codigoProducto, int cantidad, double total, double anticipo, int idTiempo) {
        this.codigoPedido = codigoPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.fecha = fecha;
        this.NITCliente = NITCliente;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.anticipo = anticipo;
        this.idTiempo = idTiempo;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public void setTiendaOrigen(String tiendaOrigen) {
        this.tiendaOrigen = tiendaOrigen;
    }

    public void setTiendaDestino(String tiendaDestino) {
        this.tiendaDestino = tiendaDestino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNITCliente(String NITCliente) {
        this.NITCliente = NITCliente;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;
    }

    public void setIdTiempo(int idTiempo) {
        this.idTiempo = idTiempo;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public String getTiendaOrigen() {
        return tiendaOrigen;
    }

    public String getTiendaDestino() {
        return tiendaDestino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNITCliente() {
        return NITCliente;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public double getAnticipo() {
        return anticipo;
    }

    public int getIdTiempo() {
        return idTiempo;
    }
    
}
