/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraUsuarios;

import com.mycompany.UI.paraEmpleados.*;
import java.awt.Image;
import javax.crypto.AEADBadTagException;
import javax.swing.ImageIcon;

/**
 *
 * @author erikssonherlo
 */
public class MenuCliente extends javax.swing.JFrame {
    String Fondo1 = "fondoGris.jpg";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreCliente;
    protected String NITCliente;
    
    /**
     * Creates new form Interfaz
     */
    public MenuCliente(String nombreCliente,String NITCliente) {
        
        this.nombreCliente=nombreCliente;
        this.NITCliente=NITCliente;
        initComponents();
        infoCliente.setText(this.nombreCliente);
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
        inicioTienda = new javax.swing.JButton();
        irCatalogoProductos = new javax.swing.JButton();
        irRastreoPedidos = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        infoCliente = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("MENÚ PRINCIPAL");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 340, 53));

        inicioTienda.setBackground(new java.awt.Color(43, 46, 46));
        inicioTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        inicioTienda.setForeground(new java.awt.Color(250, 250, 244));
        inicioTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoHorizontalpequeño.png"))); // NOI18N
        inicioTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(inicioTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 222, 91));

        irCatalogoProductos.setBackground(new java.awt.Color(43, 46, 46));
        irCatalogoProductos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irCatalogoProductos.setForeground(new java.awt.Color(250, 250, 244));
        irCatalogoProductos.setText("Ver Catalogo de Productos");
        irCatalogoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irCatalogoProductosActionPerformed(evt);
            }
        });
        getContentPane().add(irCatalogoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 290, 40));

        irRastreoPedidos.setBackground(new java.awt.Color(43, 46, 46));
        irRastreoPedidos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irRastreoPedidos.setForeground(new java.awt.Color(250, 250, 244));
        irRastreoPedidos.setText("Rastrear Pedido");
        irRastreoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irRastreoPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(irRastreoPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 270, 290, 40));

        cerrarSesion.setBackground(new java.awt.Color(43, 46, 46));
        cerrarSesion.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(250, 250, 244));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 340, 290, 40));

        infoCliente.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        infoCliente.setForeground(new java.awt.Color(0, 0, 0));
        infoCliente.setText("Nombre Cliente");
        getContentPane().add(infoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, -1, 20));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioTiendaActionPerformed
              MenuCliente eleccion = new MenuCliente(nombreCliente, NITCliente);
              eleccion.setVisible(true);
              this.setVisible(false);
              
    }//GEN-LAST:event_inicioTiendaActionPerformed

    private void irRastreoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irRastreoPedidosActionPerformed
       RastrearPedidos eleccion = new RastrearPedidos(nombreCliente, NITCliente);
       eleccion.setVisible(true);
       this.setVisible(false);
          
    }//GEN-LAST:event_irRastreoPedidosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);// TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void irCatalogoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irCatalogoProductosActionPerformed
         CatalogoProductos eleccion = new CatalogoProductos(nombreCliente, NITCliente);
         eleccion.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_irCatalogoProductosActionPerformed

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
    private javax.swing.JLabel infoCliente;
    public javax.swing.JButton inicioTienda;
    public javax.swing.JButton irCatalogoProductos;
    public javax.swing.JButton irRastreoPedidos;
    // End of variables declaration//GEN-END:variables
}
