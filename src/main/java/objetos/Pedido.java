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
    //ATRIBUTOS CARGA DE ARCHIVOS
    private int codigoPedido;               //1-Pedido | 2-Detalle_Pedido
    private String tiendaOrigen;            //3-Detalle_Pedido
    private String tiendaDestino;           //4--Detalle_Pedido
    private String fecha;                   //2-Pedido
    private String NITCliente;              //4-Pedido
    private String codigoProducto;          //5-Detalle_Pedido
    private int cantidad;                   //6-Detalle_Pedido
    private double subTotal;                //8-Detalle_Pedido
    private double anticipoEfectivo;        //5-Pedido
    
    //ATRIBUTOS EXTRAS PEDIDO
    private String fechaLlegada;            //3-Pedido
    private double total;                   //8-Pedido
    private double anticipoCredito;         //6-Pedido
    private double anticipo;                //7-Pedido | suma de anticipoEfectivo + anticipoCredito
    private double totalAPagar;             //9-Pedido
    private double pagoTotal;               //10-Pedido
    private double caja;                    //11-Pedido
    private String estado;                  //12-Pedido
    
    //ATRIBUTOS EXTRAS DETALLE_PEDIDO
    private double precio;                  //7-Detalle_Pedido
    private int idTiempo;                   //9-Detalle_Pedido
    private int tiempoTiendas;              //10-Detalle_Pedido
    
        
    //Constructor para la Carga de Archivo
       public Pedido(int codigoPedido, String tiendaOrigen, String tiendaDestino, String fecha, String NITCliente, String codigoProducto, int cantidad, double subTotal, double anticipoEfectivo) {
        this.codigoPedido = codigoPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.fecha = fecha;
        this.NITCliente = NITCliente;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.anticipoEfectivo = anticipoEfectivo;
    }

    //Constructor para todos los Metodos

    public Pedido(int codigoPedido, String tiendaOrigen, String tiendaDestino, String fecha, String NITCliente, String codigoProducto, int cantidad, double subTotal, double anticipoEfectivo, String fechaLlegada, double total, double anticipoCredito, double anticipo, double totalAPagar, double pagoTotal, double caja, String estado, double precio, int idTiempo, int tiempoTiendas) {
        this.codigoPedido = codigoPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.fecha = fecha;
        this.NITCliente = NITCliente;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.anticipoEfectivo = anticipoEfectivo;
        this.fechaLlegada = fechaLlegada;
        this.total = total;
        this.anticipoCredito = anticipoCredito;
        this.anticipo = anticipo;
        this.totalAPagar = totalAPagar;
        this.pagoTotal = pagoTotal;
        this.caja = caja;
        this.estado = estado;
        this.precio = precio;
        this.idTiempo = idTiempo;
        this.tiempoTiendas = tiempoTiendas;
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

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setAnticipoEfectivo(double anticipoEfectivo) {
        this.anticipoEfectivo = anticipoEfectivo;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setAnticipoCredito(double anticipoCredito) {
        this.anticipoCredito = anticipoCredito;
    }

    public void setAnticipo(double anticipo) {
        this.anticipo = anticipo;//PRUEBA AQUIIIIIIIIIIIIIIIIIIIII
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIdTiempo(int idTiempo) {
        this.idTiempo = idTiempo;
    }

    public void setTiempoTiendas(int tiempoTiendas) {
        this.tiempoTiendas = tiempoTiendas;
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

    public double getSubTotal() {
        return subTotal;
    }

    public double getAnticipoEfectivo() {
        return anticipoEfectivo;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public double getTotal() {
        return total;
    }

    public double getAnticipoCredito() {
        return anticipoCredito;
    }

    public double getAnticipo() {
        return anticipo;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public double getCaja() {
        return caja;
    }

    public String getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdTiempo() {
        return idTiempo;
    }

    public int getTiempoTiendas() {
        return tiempoTiendas;
    }

 
   
  
}
