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
public class Venta {
    /*
    *   ATRIBUTOS DE LA VENTA
    */
    private int idVentas;
    private String fecha;
    private String NITCliente;
    private double totalAPagar;
    private double efectivo;
    private double creditoCliente;
    private double caja;
    
    //ATRIBUTOS DEL DETALLE DE LA VENTA
    private String tiendaExistencia;
    private String codigoProducto;
    private int cantidad;
    private double precio;
    private double subTotal;

    public Venta(int idVentas, String fecha, String NITCliente, double totalAPagar, double efectivo, double creditoCliente, double caja, String tiendaExistencia, String codigoProducto, int cantidad, double precio, double subTotal) {
        this.idVentas = idVentas;
        this.fecha = fecha;
        this.NITCliente = NITCliente;
        this.totalAPagar = totalAPagar;
        this.efectivo = efectivo;
        this.creditoCliente = creditoCliente;
        this.caja = caja;
        this.tiendaExistencia = tiendaExistencia;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNITCliente(String NITCliente) {
        this.NITCliente = NITCliente;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public void setCreditoCliente(double creditoCliente) {
        this.creditoCliente = creditoCliente;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public void setTiendaExistencia(String tiendaExistencia) {
        this.tiendaExistencia = tiendaExistencia;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNITCliente() {
        return NITCliente;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public double getCreditoCliente() {
        return creditoCliente;
    }

    public double getCaja() {
        return caja;
    }

    public String getTiendaExistencia() {
        return tiendaExistencia;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getSubTotal() {
        return subTotal;
    }
    
    
    
    
    
    
    
}
