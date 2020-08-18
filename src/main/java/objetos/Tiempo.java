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
public class Tiempo {
    private String tiendaOrigen;
    private String tiendaDestino;
    private int tiempo;

    public Tiempo(String tiendaOrigen, String tiendaDestino, int tiempo) {
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.tiempo = tiempo;
    }

    public void setTiendaOrigen(String tiendaOrigen) {
        this.tiendaOrigen = tiendaOrigen;
    }

    public void setTiendaDestino(String tiendaDestino) {
        this.tiendaDestino = tiendaDestino;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiendaOrigen() {
        return tiendaOrigen;
    }

    public String getTiendaDestino() {
        return tiendaDestino;
    }

    public int getTiempo() {
        return tiempo;
    }
    
}
