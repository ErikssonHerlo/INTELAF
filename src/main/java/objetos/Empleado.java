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
public class Empleado {
    private String nombre;
    private String codigoEmpleado;
    private String telefono;
    private String DPI;
    private String NIT;
    private String correoElectronico;
    private String direccion;

    //constructor carga de archivos
    public Empleado(String nombre, String codigoEmpleado, String telefono, String DPI) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.telefono = telefono;
        this.DPI = DPI;
    }
    //constructor para todos los metodos
    public Empleado(String nombre, String codigoEmpleado, String telefono, String DPI, String NIT, String correoElectronico, String direccion) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.telefono = telefono;
        this.DPI = DPI;
        this.NIT = NIT;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
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

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDPI() {
        return DPI;
    }

    public String getNIT() {
        return NIT;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

   
}
