/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraUsuarios;

import com.mycompany.UI.paraEmpleados.*;
import accesoAObjetos.AccesoProducto;
import accesoAObjetos.AccesoTienda;
import conexionMySQL.Conexion;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Producto;
import objetos.Tienda;

/**
 *
 * @author erikssonherlo
 */
public class modelocatalogoV2 extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    protected ArrayList<String> tablaProductos= new ArrayList<>();
    
    protected ArrayList<String> tablaBusquedaNombre= new ArrayList<>();
    protected ArrayList<String> tablaBusquedaCodigoProducto= new ArrayList<>();
    protected ArrayList<String> tablaBusquedaTiendaOrigen= new ArrayList<>();   
    /**
     * Creates new form Interfaz
     */
    public modelocatalogoV2(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
        mostrarTabla();
        llenarCombos();
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
        salir = new javax.swing.JButton();
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
        inUsuario9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        inUsuario10 = new javax.swing.JLabel();
        inUsuario11 = new javax.swing.JLabel();
        comboNombreProducto = new javax.swing.JComboBox<>();
        comboTienda = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        inUsuario12 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("NUEVO PEDIDO");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 20, 400, 53));

        irMenuNuevaInfo.setBackground(new java.awt.Color(43, 46, 46));
        irMenuNuevaInfo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irMenuNuevaInfo.setForeground(new java.awt.Color(250, 250, 244));
        irMenuNuevaInfo.setText("Regresar");
        irMenuNuevaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irMenuNuevaInfoActionPerformed(evt);
            }
        });
        getContentPane().add(irMenuNuevaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 600, 150, 40));

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

        salir.setBackground(new java.awt.Color(43, 46, 46));
        salir.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        salir.setForeground(new java.awt.Color(250, 250, 244));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 150, 40));

        textoUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario3ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 290, 30));

        inUsuario2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario2.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario2.setText("Ingrese la Fabicante:        *");
        getContentPane().add(inUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 250, 30));

        inUsuario1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario1.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario1.setText("Ingrese el Nombre:           *");
        getContentPane().add(inUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 250, 30));

        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 290, 30));

        inUsuario3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario3.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario3.setText("Ingrese el Código:            *");
        getContentPane().add(inUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 250, 30));

        textoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario2ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 290, 30));

        inUsuario7.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario7.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario7.setText("Ingrese la Garantia:        +");
        getContentPane().add(inUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 250, 30));

        textoUsuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario7ActionPerformed(evt);
            }
        });
        textoUsuario7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoUsuario7KeyTyped(evt);
            }
        });
        getContentPane().add(textoUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 290, 30));

        inUsuario4.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario4.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario4.setText("Ingrese las Existencias:    *");
        getContentPane().add(inUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 250, 30));

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
        getContentPane().add(textoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 290, 30));

        inUsuario5.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario5.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario5.setText("Ingrese el Precio:             *");
        getContentPane().add(inUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 250, 30));

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
        getContentPane().add(textoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 290, 30));

        inUsuario6.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario6.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario6.setText("Ingrese la Descripción:");
        getContentPane().add(inUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 250, 30));

        textoUsuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario6ActionPerformed(evt);
            }
        });
        getContentPane().add(textoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 290, 30));

        agregar.setBackground(new java.awt.Color(43, 46, 46));
        agregar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        agregar.setForeground(new java.awt.Color(250, 250, 244));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 150, 40));

        inUsuario8.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 10)); // NOI18N
        inUsuario8.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario8.setText("* CAMPOS OBLIGATORIOS");
        getContentPane().add(inUsuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 160, 20));

        inUsuario9.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 10)); // NOI18N
        inUsuario9.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario9.setText("+EN MESES");
        getContentPane().add(inUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 640, 160, 20));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fabricante", "Codigo del Producto", "Existencia", "Precio", "TIenda de Origen", "Descripción", "Garantia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 140));

        inUsuario10.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario10.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario10.setText("Buscar Productos: ");
        getContentPane().add(inUsuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 30));

        inUsuario11.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario11.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario11.setText("Buscar por: ");
        getContentPane().add(inUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 130, 30));

        comboNombreProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        comboNombreProducto.setToolTipText("");
        comboNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 150, 30));

        comboTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tienda" }));
        comboTienda.setToolTipText("");
        comboTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(comboTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 150, 30));

        buscar.setBackground(new java.awt.Color(43, 46, 46));
        buscar.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        buscar.setForeground(new java.awt.Color(250, 250, 244));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 215, 150, 30));

        inUsuario12.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario12.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario12.setText("Ingrese del Pedido:");
        getContentPane().add(inUsuario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 30));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mostrarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Codigo_Tienda <> '"+codigoTienda+"'");
        model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {
               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Precio"),rs.getString("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }
    private void mostrarBusquedaNombre(String nombreProducto){
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Nombre = '"+nombreProducto+"' AND Codigo_Tienda <> '"+codigoTienda+"'");
        model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {
               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Precio"),rs.getString("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }
    private void llenarCombos() {
        
        Conexion conexion = new Conexion();
        ResultSet rs1 = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Codigo_Tienda <> '"+codigoTienda+"'");
        ResultSet rs2 = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Codig");
        
        ResultSet rs3 = conexion.getTabla("SELECT Nombre,Codigo_Tienda FROM TIENDA");
        try {
            while (rs1.next()) {
                comboNombreProducto.addItem(rs1.getString(1));
                comboTienda.addItem(rs1.getString(6));
            }

        } catch (Exception e) {

        }
     
    }
    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
              // TODO add your handling code here:
             ElegirTienda eleccion = new ElegirTienda();
            eleccion.setVisible(true);
            this.setVisible(false); 
              
    }//GEN-LAST:event_inicioActionPerformed

    private void irMenuNuevaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irMenuNuevaInfoActionPerformed
            MenuNuevoProducto eleccion = new MenuNuevoProducto(nombreTienda, codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_irMenuNuevaInfoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);    
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

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
        String fabricante=textoUsuario2.getText();
        String codigo =textoUsuario3.getText();
        int existencia = Integer.parseInt(textoUsuario4.getText());
        Double precio = Double.parseDouble(textoUsuario5.getText());
        String descripcion = textoUsuario6.getText();
        int garantia = Integer.parseInt(textoUsuario7.getText());
        if (nombre.equals("") || fabricante.equals("") || codigo.equals("") || existencia==0 || precio==0){
            JOptionPane.showMessageDialog(null, "Ingrese todos los Campos Obligatorios");
        }else{
            Producto nuevo = new Producto(nombre, fabricante, codigo, existencia, precio, codigoTienda,descripcion,garantia);
            accesoAObjetos.AccesoProducto llenar = new AccesoProducto();
             if(!llenar.insertarProducto(nuevo))
        {   JOptionPane.showMessageDialog(null, "No se puedo Ingresar la tienda "+nombre+"\ndebido a que tiene datos repetidos con otra Tienda ingresada en la Base de Datos");
        }else{
            JOptionPane.showMessageDialog(null, "Producto Agregado Exitosamente");
            MenuEmpleado eleccion = new MenuEmpleado(nombreTienda,codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
              this.dispose();
        }
        }
        
    }//GEN-LAST:event_agregarActionPerformed

    private void textoUsuario4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario4KeyTyped
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_textoUsuario4KeyTyped

    private void textoUsuario5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario5KeyTyped
if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
       evt.consume();
   } 
        if(evt.getKeyChar()=='.'&&textoUsuario5.getText().contains(".")){
      evt.consume();
       }        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario5KeyTyped

    private void textoUsuario7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario7KeyTyped
    char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario7KeyTyped

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked

    }//GEN-LAST:event_tableProductosMouseClicked

    private void comboTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTiendaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(comboTienda.getSelectedIndex()!=0 || comboNombreProducto.getSelectedIndex()!=0){
       
        //MenuEmpleado accesarAlMenu = new MenuEmpleado(comboTienda.getItemAt(comboTienda.getSelectedIndex()),tablaTienda.get(comboTienda.getSelectedIndex()-1));
        //accesarAlMenu.setVisible(true);
        this.setVisible(false);
        } else
        {
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione una Tienda");
                   
        }// TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void comboNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNombreProductoActionPerformed

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
    public javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboNombreProducto;
    private javax.swing.JComboBox<String> comboTienda;
    public javax.swing.JLabel inUsuario1;
    public javax.swing.JLabel inUsuario10;
    public javax.swing.JLabel inUsuario11;
    public javax.swing.JLabel inUsuario12;
    public javax.swing.JLabel inUsuario2;
    public javax.swing.JLabel inUsuario3;
    public javax.swing.JLabel inUsuario4;
    public javax.swing.JLabel inUsuario5;
    public javax.swing.JLabel inUsuario6;
    public javax.swing.JLabel inUsuario7;
    public javax.swing.JLabel inUsuario8;
    public javax.swing.JLabel inUsuario9;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuNuevaInfo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton salir;
    private javax.swing.JTable tableProductos;
    public javax.swing.JTextField textoUsuario1;
    public javax.swing.JTextField textoUsuario2;
    public javax.swing.JTextField textoUsuario3;
    public javax.swing.JTextField textoUsuario4;
    public javax.swing.JTextField textoUsuario5;
    public javax.swing.JTextField textoUsuario6;
    public javax.swing.JTextField textoUsuario7;
    // End of variables declaration//GEN-END:variables
}
