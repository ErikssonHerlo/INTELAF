/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraEmpleados;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author erikssonherlo
 */
public class MenuNuevaInformacion extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    /**
     * Creates new form Interfaz
     */
    public MenuNuevaInformacion(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
        infoTienda.setText(nombreTienda);
        cargarFondo(Fondo1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        crearNuevaTienda = new javax.swing.JButton();
        crearNuevoProducto = new javax.swing.JButton();
        crearNuevoEmpleado = new javax.swing.JButton();
        crearNuevoCliente = new javax.swing.JButton();
        irMenuEmpleado = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        infoTienda = new javax.swing.JLabel();
        crearTiempoTiendas = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("AGREGAR NUEVA INFORMACIÓN");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 630, 53));

        inicio.setBackground(new java.awt.Color(43, 46, 46));
        inicio.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        inicio.setForeground(new java.awt.Color(250, 250, 244));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoHorizontalpequeño.png"))); // NOI18N
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 222, 91));

        crearNuevaTienda.setBackground(new java.awt.Color(43, 46, 46));
        crearNuevaTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        crearNuevaTienda.setForeground(new java.awt.Color(250, 250, 244));
        crearNuevaTienda.setText("Nueva Tienda");
        crearNuevaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevaTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(crearNuevaTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 175, 290, 40));

        crearNuevoProducto.setBackground(new java.awt.Color(43, 46, 46));
        crearNuevoProducto.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        crearNuevoProducto.setForeground(new java.awt.Color(250, 250, 244));
        crearNuevoProducto.setText("Nuevo Producto");
        crearNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(crearNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 285, 290, 40));

        crearNuevoEmpleado.setBackground(new java.awt.Color(43, 46, 46));
        crearNuevoEmpleado.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        crearNuevoEmpleado.setForeground(new java.awt.Color(250, 250, 244));
        crearNuevoEmpleado.setText("Nuevo Empleado");
        crearNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(crearNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 340, 290, 40));

        crearNuevoCliente.setBackground(new java.awt.Color(43, 46, 46));
        crearNuevoCliente.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        crearNuevoCliente.setForeground(new java.awt.Color(250, 250, 244));
        crearNuevoCliente.setText("Nuevo Cliente");
        crearNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(crearNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 395, 290, 40));

        irMenuEmpleado.setBackground(new java.awt.Color(43, 46, 46));
        irMenuEmpleado.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irMenuEmpleado.setForeground(new java.awt.Color(250, 250, 244));
        irMenuEmpleado.setText("Regresar Al Menú Anterior");
        irMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irMenuEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(irMenuEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 450, 290, 40));

        cerrarSesion.setBackground(new java.awt.Color(43, 46, 46));
        cerrarSesion.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(250, 250, 244));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 505, 290, 40));

        infoTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoTienda.setText("Nombre Tienda");
        getContentPane().add(infoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, -1, 20));

        crearTiempoTiendas.setBackground(new java.awt.Color(43, 46, 46));
        crearTiempoTiendas.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        crearTiempoTiendas.setForeground(new java.awt.Color(250, 250, 244));
        crearTiempoTiendas.setText("Nuevo Tiempo entre Tiendas");
        crearTiempoTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTiempoTiendasActionPerformed(evt);
            }
        });
        getContentPane().add(crearTiempoTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 230, 290, 40));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
            ElegirTienda eleccion = new ElegirTienda();
            eleccion.setVisible(true);
            this.setVisible(false);              // TODO add your handling code here:
              
              
    }//GEN-LAST:event_inicioActionPerformed

    private void irMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irMenuEmpleadoActionPerformed
            MenuEmpleado eleccion = new MenuEmpleado(nombreTienda,codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_irMenuEmpleadoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
    Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);   
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void crearNuevaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevaTiendaActionPerformed
        NuevaTienda eleccion = new NuevaTienda(nombreTienda,codigoTienda);
        eleccion.setVisible(true);
              this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_crearNuevaTiendaActionPerformed

    private void crearNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoProductoActionPerformed
       MenuNuevoProducto eleccion = new MenuNuevoProducto(nombreTienda, codigoTienda);
       eleccion.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_crearNuevoProductoActionPerformed

    private void crearNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoEmpleadoActionPerformed
        MenuNuevoEmpleado eleccion = new MenuNuevoEmpleado(nombreTienda, codigoTienda);
        eleccion.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_crearNuevoEmpleadoActionPerformed

    private void crearNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevoClienteActionPerformed
     MenuNuevoCliente eleccion = new MenuNuevoCliente(nombreTienda, codigoTienda);
     eleccion.setVisible(true);
     this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_crearNuevoClienteActionPerformed

    private void crearTiempoTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTiempoTiendasActionPerformed
        MenuNuevoTiempo eleccion = new MenuNuevoTiempo(nombreTienda, codigoTienda);
        eleccion.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_crearTiempoTiendasActionPerformed

    /**
     */
    public void cargarFondo(String NombreImagen)
    {
        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(NombreImagen));
        ImageIcon imageIconFinal = new ImageIcon(imageIcon.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(imageIconFinal);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Fondo;
    public javax.swing.JLabel Titulo;
    public javax.swing.JButton cerrarSesion;
    public javax.swing.JButton crearNuevaTienda;
    public javax.swing.JButton crearNuevoCliente;
    public javax.swing.JButton crearNuevoEmpleado;
    public javax.swing.JButton crearNuevoProducto;
    public javax.swing.JButton crearTiempoTiendas;
    private javax.swing.JLabel infoTienda;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuEmpleado;
    // End of variables declaration//GEN-END:variables
}