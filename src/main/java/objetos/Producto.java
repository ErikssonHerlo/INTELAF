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
public class Producto {
    private String nombre;
    private String fabricante;
    private String codigoProducto;
    private int existencia;
    private double precio;
    private String tiendaUbicacion;
    private String descripcion;
    private int garantia;

    //constructor Carga de Datos Obligatorios
    public Producto(String nombre, String fabricante, String codigoProducto, int existencia, double precio, String tiendaUbicacion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.codigoProducto = codigoProducto;
        this.existencia = existencia;
        this.precio = precio;
        this.tiendaUbicacion = tiendaUbicacion;
    }    

    //Constructor para todos los Datos

    public Producto(String nombre, String fabricante, String codigoProducto, int existencia, double precio, String tiendaUbicacion, String descripcion, int garantia) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.codigoProducto = codigoProducto;
        this.existencia = existencia;
        this.precio = precio;
        this.tiendaUbicacion = tiendaUbicacion;
        this.descripcion = descripcion;
        this.garantia = garantia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTiendaUbicacion(String tiendaUbicacion) {
        this.tiendaUbicacion = tiendaUbicacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public int getExistencia() {
        return existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTiendaUbicacion() {
        return tiendaUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getGarantia() {
        return garantia;
    }


    
    
}
