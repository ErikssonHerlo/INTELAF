/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraEmpleados;

import accesoAObjetos.AccesoTienda;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import objetos.Tienda;

/**
 *
 * @author erikssonherlo
 */
public class NuevaTienda extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    /**
     * Creates new form Interfaz
     */
    public NuevaTienda(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
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
        irMenuNuevaInfo = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        textoUsuario3 = new javax.swing.JTextField();
        inUsuario2 = new javax.swing.JLabel();
        inUsuario1 = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        inUsuario3 = new javax.swing.JLabel();
        textoUsuario2 = new javax.swing.JTextField();
        inUsuario7 = new javax.swing.JLabel();
        textoUsuario7 = new javax.swing.JTextField();
        inUsuario4 = new javax.swing.JLabel();
        textoUsuario4 = new javax.swing.JTextField();
        inUsuario5 = new javax.swing.JLabel();
        textoUsuario5 = new javax.swing.JTextField();
        inUsuario6 = new javax.swing.JLabel();
        textoUsuario6 = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        inUsuario8 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("NUEVA TIENDA");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 90, 390, 53));

        irMenuNuevaInfo.setBackground(new java.awt.Color(43, 46, 46));
        irMenuNuevaInfo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irMenuNuevaInfo.setForeground(new java.awt.Color(250, 250, 244));
        irMenuNuevaInfo.setText("Regresar");
        irMenuNuevaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irMenuNuevaInfoActionPerformed(evt);
            }
        });
        getContentPane().add(irMenuNuevaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 485, 150, 40));

        inicio.setBackground(new java.awt.Color(43, 46, 46));
        inicio.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        inicio.setForeground(new java.awt.Color(250, 250, 244));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoHorizontalpequeño.png"))); // NOI18N
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 222, 66));

        cerrarSesion.setBackground(new java.awt.Color(43, 46, 46));
        cerrarSesion.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(250, 250, 244));
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 485, 150, 40));

        textoUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario3ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 290, 30));

        inUsuario2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario2.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario2.setText("Ingrese la Direccion:        *");
        getContentPane().add(inUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 250, 30));

        inUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario1.setText("Ingrese el Nombre:           *");
        getContentPane().add(inUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 30));

        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 290, 30));

        inUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario3.setText("Ingrese el Código:            *");
        getContentPane().add(inUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, 30));

        textoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario2ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 205, 290, 30));

        inUsuario7.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario7.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario7.setText("Ingrese el E-Mail:       ");
        getContentPane().add(inUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 250, 30));

        textoUsuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario7ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 290, 30));

        inUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario4.setText("Ingrese el Télefono 1:       *");
        getContentPane().add(inUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, 250, 30));

        textoUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario4ActionPerformed(evt);
            }
        });
        textoUsuario4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoUsuario4KeyTyped(evt);
            }
        });
        getContentPane().add(textoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 295, 290, 30));

        inUsuario5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario5.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario5.setText("Ingrese el Télefono 2:");
        getContentPane().add(inUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 250, 30));

        textoUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario5ActionPerformed(evt);
            }
        });
        textoUsuario5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoUsuario5KeyTyped(evt);
            }
        });
        getContentPane().add(textoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 290, 30));

        inUsuario6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario6.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario6.setText("Ingrese el Horario:");
        getContentPane().add(inUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 385, 250, 30));

        textoUsuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario6ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 385, 290, 30));

        agregar.setBackground(new java.awt.Color(43, 46, 46));
        agregar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        agregar.setForeground(new java.awt.Color(250, 250, 244));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 485, 150, 40));

        inUsuario8.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 10)); // NOI18N
        inUsuario8.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario8.setText("* CAMPOS OBLIGATORIOS");
        getContentPane().add(inUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 526, 250, 20));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
              // TODO add your handling code here:
              ElegirTienda eleccion = new ElegirTienda();
            eleccion.setVisible(true);
            this.setVisible(false); 
              
    }//GEN-LAST:event_inicioActionPerformed

    private void irMenuNuevaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irMenuNuevaInfoActionPerformed
            MenuNuevaInformacion eleccion = new MenuNuevaInformacion(nombreTienda,codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_irMenuNuevaInfoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);    
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void textoUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textoUsuario3ActionPerformed

    private void textoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario1ActionPerformed

    private void textoUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario2ActionPerformed

    private void textoUsuario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario7ActionPerformed

    private void textoUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario4ActionPerformed
        
    }//GEN-LAST:event_textoUsuario4ActionPerformed

    private void textoUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario5ActionPerformed

    private void textoUsuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario6ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        String nombre = textoUsuario1.getText();
        String direccion=textoUsuario2.getText();
        String codigo =textoUsuario3.getText();
        String telefono1 = textoUsuario4.getText();
        String telefono2 = textoUsuario5.getText();
        String horario = textoUsuario6.getText();
        String correoElectronico = textoUsuario7.getText();
        if (nombre.equals("") || direccion.equals("") || codigo.equals("") || telefono1.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese todos los Campos Obligatorios");
        }else{
            Tienda nuevo = new Tienda(nombre, direccion, codigo, telefono1, telefono2, horario, correoElectronico);
            accesoAObjetos.AccesoTienda llenar = new AccesoTienda();
             if(!llenar.insertarTienda(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar la tienda "+nombre+"\ndebido a que tiene datos repetidos con otra Tienda ingresada en la Base de Datos");
        }else{
            JOptionPane.showMessageDialog(null, "Tienda Agregada Exitosamente");
            MenuEmpleado eleccion = new MenuEmpleado(nombreTienda,codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
              this.dispose();
        }
        }
        
    }//GEN-LAST:event_agregarActionPerformed

    private void textoUsuario4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario4KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='-'){
       evt.consume();
   } 
        if(evt.getKeyChar()=='.'&&textoUsuario4.getText().contains("-")){
      evt.consume();
       }// TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario4KeyTyped

    private void textoUsuario5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario5KeyTyped
if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='-'){
       evt.consume();
   } 
        if(evt.getKeyChar()=='.'&&textoUsuario5.getText().contains("-")){
      evt.consume();
       }        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario5KeyTyped

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
    public javax.swing.JButton agregar;
    public javax.swing.JButton cerrarSesion;
    public javax.swing.JLabel inUsuario1;
    public javax.swing.JLabel inUsuario2;
    public javax.swing.JLabel inUsuario3;
    public javax.swing.JLabel inUsuario4;
    public javax.swing.JLabel inUsuario5;
    public javax.swing.JLabel inUsuario6;
    public javax.swing.JLabel inUsuario7;
    public javax.swing.JLabel inUsuario8;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuNuevaInfo;
    public javax.swing.JTextField textoUsuario1;
    public javax.swing.JTextField textoUsuario2;
    public javax.swing.JTextField textoUsuario3;
    public javax.swing.JTextField textoUsuario4;
    public javax.swing.JTextField textoUsuario5;
    public javax.swing.JTextField textoUsuario6;
    public javax.swing.JTextField textoUsuario7;
    // End of variables declaration//GEN-END:variables
}
