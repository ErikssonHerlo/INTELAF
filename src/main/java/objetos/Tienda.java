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
public class Tienda {
    private String nombre;
    private String direccion;
    private String codigoTienda;
    private String telefono1;
    private String telefono2;
    private String horario;
    private String correoElectronico;
    
    //Constructor para la Carga de Archivos
    public Tienda(String nombre, String direccion, String codigoTienda, String telefono1) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoTienda = codigoTienda;
        this.telefono1 = telefono1;
    }
    
    //Constructor para todos los Metodos
    public Tienda(String nombre, String direccion, String codigoTienda, String telefono1, String telefono2, String horario, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoTienda = codigoTienda;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.horario = horario;
        this.correoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getHorario() {
        return horario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
}
