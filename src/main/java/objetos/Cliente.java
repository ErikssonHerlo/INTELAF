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
public class Cliente {
    private String nombre;
    private String NIT;
    private String telefono;
    private double creditoCompra;
    private String DPI;
    private String correoElectronico;
    private String direccion;

    //constructor carga de archivos
    public Cliente(String nombre, String NIT, String telefono, double creditoCompra) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.telefono = telefono;
        this.creditoCompra = creditoCompra;
    }
    //constructor para todos los metodos
    public Cliente(String nombre, String NIT, String telefono, double creditoCompra, String DPI, String correoElectronico, String direccion) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.telefono = telefono;
        this.creditoCompra = creditoCompra;
        this.DPI = DPI;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCreditoCompra(double creditoCompra) {
        this.creditoCompra = creditoCompra;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getCreditoCompra() {
        return creditoCompra;
    }

    public String getDPI() {
        return DPI;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }
  
    
}
