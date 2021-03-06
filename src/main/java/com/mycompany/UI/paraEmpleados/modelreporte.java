/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UI.paraEmpleados;

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
public class modelreporte extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    protected ArrayList<String> listaProductosPedido= new ArrayList<>();    //AQUI SE GUARDAN TODOS LOS DATOS DEL DETALLE PEDIDO
    
    protected ArrayList<String> tablaProductosTiendaOrigen= new ArrayList<>();   
    protected ArrayList<String> tablaNombreProductos= new ArrayList<>();   
    protected ArrayList<String> tablaCodigoProductos= new ArrayList<>();   
    protected ArrayList<String> tablaFabricanteProductos= new ArrayList<>();     
    
    
     /**
     * Creates new form Interfaz
     */
    public modelreporte(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
        infoTienda.setText(this.nombreTienda);
        llenarCombos();
        mostrarTablaCompleta();
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
        irMenuEmpleado = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        inUsuario11 = new javax.swing.JLabel();
        comboTienda = new javax.swing.JComboBox<>();
        buscarTienda = new javax.swing.JButton();
        infoTienda = new javax.swing.JLabel();
        comboNombreProducto = new javax.swing.JComboBox<>();
        comboCodigoProducto = new javax.swing.JComboBox<>();
        comboFabricanteProducto = new javax.swing.JComboBox<>();
        verTodos = new javax.swing.JButton();
        descripcionReporte = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("REPORTE");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 250, 53));

        irMenuEmpleado.setBackground(new java.awt.Color(43, 46, 46));
        irMenuEmpleado.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        irMenuEmpleado.setForeground(new java.awt.Color(250, 250, 244));
        irMenuEmpleado.setText("Regresar");
        irMenuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irMenuEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(irMenuEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 150, 40));

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
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 150, 40));

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fabricante", "Codigo Producto", "Existencia", "Precio", "Tienda Origen", "Descripcion", "Garantia"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 170));

        inUsuario11.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario11.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario11.setText("Buscar por: ");
        getContentPane().add(inUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 75, 130, 30));

        comboTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tienda" }));
        comboTienda.setToolTipText("");
        comboTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(comboTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 150, 30));

        buscarTienda.setBackground(new java.awt.Color(43, 46, 46));
        buscarTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        buscarTienda.setForeground(new java.awt.Color(250, 250, 244));
        buscarTienda.setText("Buscar");
        buscarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(buscarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 150, 30));

        infoTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoTienda.setText("Nombre Tienda");
        getContentPane().add(infoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        comboNombreProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        comboNombreProducto.setToolTipText("");
        comboNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 145, 150, 30));

        comboCodigoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo" }));
        comboCodigoProducto.setToolTipText("");
        comboCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodigoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 178, 150, 30));

        comboFabricanteProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fabricante" }));
        comboFabricanteProducto.setToolTipText("");
        comboFabricanteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFabricanteProductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboFabricanteProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 150, 30));

        verTodos.setBackground(new java.awt.Color(43, 46, 46));
        verTodos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        verTodos.setForeground(new java.awt.Color(250, 250, 244));
        verTodos.setText("Ver Todos los Productos");
        verTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTodosActionPerformed(evt);
            }
        });
        getContentPane().add(verTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 40));

        descripcionReporte.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        descripcionReporte.setForeground(new java.awt.Color(4, 2, 2));
        descripcionReporte.setText("Pedidos que llegarán a la Tienda");
        getContentPane().add(descripcionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 310, 30));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mostrarTablaCompleta() {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO ORDER BY Codigo_Producto ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Existencia"),rs.getDouble("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }
      private void mostrarTablaBusqueda1(String tiendaOrigen) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Codigo_Tienda = '"+tiendaOrigen+"'ORDER BY Codigo_Producto ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Existencia"),rs.getDouble("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }

 private void mostrarTablaBusqueda2(String nombreProducto) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Nombre = '"+nombreProducto+"'ORDER BY Codigo_Producto ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Existencia"),rs.getDouble("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }
  private void mostrarTablaBusqueda3(String codigoProducto) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Codigo_Producto = '"+codigoProducto+"'ORDER BY Codigo_Producto ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Existencia"),rs.getDouble("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }
   private void mostrarTablaBusqueda4(String fabricante) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EXISTENCIA_PRODUCTO WHERE Fabricante = '"+fabricante+"'ORDER BY Codigo_Producto ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Fabricante", "Codigo Producto", "Existencia","Precio","Tienda Origen","Descripcion","Garantia"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Fabricante"), rs.getString("Codigo_Producto"), rs.getInt("Existencia"),rs.getDouble("Precio"),rs.getString("Codigo_Tienda"),rs.getString("Descripcion"),rs.getInt("Garantia")});
            }
            tableProductos.setModel(model);
        } catch (SQLException e) {
        }
    }

 
    private void llenarCombos() {
        
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT Nombre,Codigo_Tienda FROM TIENDA");
        try {
            while (rs.next()) {
                comboTienda.addItem(rs.getString(1));
                tablaProductosTiendaOrigen.add(rs.getString(2));
                }

        } catch (SQLException e) {

        }
        ResultSet rs1 = conexion.getTabla("SELECT DISTINCT(Nombre) FROM EXISTENCIA_PRODUCTO");
       
        try {
            while (rs1.next()) {
                comboNombreProducto.addItem(rs1.getString(1));
                tablaNombreProductos.add(rs1.getString(1));
                }

        } catch (SQLException e) {

        }
         ResultSet rs2 = conexion.getTabla("SELECT DISTINCT(Codigo_Producto) FROM EXISTENCIA_PRODUCTO");
     
        try {
            while (rs2.next()) {
                comboCodigoProducto.addItem(rs2.getString(1));
                tablaCodigoProductos.add(rs2.getString(1));
                }

        } catch (SQLException e) {

        }
           ResultSet rs3 = conexion.getTabla("SELECT DISTINCT(Fabricante) FROM EXISTENCIA_PRODUCTO");
        try {
            while (rs3.next()) {
                comboFabricanteProducto.addItem(rs3.getString(1));
                tablaFabricanteProductos.add(rs3.getString(1));
                }

        } catch (SQLException e) {

        }
       
    }
    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
              // TODO add your handling code here:
             ElegirTienda eleccion = new ElegirTienda();
            eleccion.setVisible(true);
            this.setVisible(false); 
              
    }//GEN-LAST:event_inicioActionPerformed

    private void irMenuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irMenuEmpleadoActionPerformed
            MenuEmpleado eleccion = new MenuEmpleado(nombreTienda, codigoTienda);
              eleccion.setVisible(true);
              this.setVisible(false);
    }//GEN-LAST:event_irMenuEmpleadoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Inicio iniciarInterfaz = new Inicio();
        iniciarInterfaz.setVisible(true);    
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
             
    }//GEN-LAST:event_tableProductosMouseClicked

    private void comboTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTiendaActionPerformed

    private void buscarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTiendaActionPerformed
        if(comboTienda.getSelectedIndex()!=0 && comboNombreProducto.getSelectedIndex()==0 && comboCodigoProducto.getSelectedIndex()==0 && comboFabricanteProducto.getSelectedIndex()==0){
            mostrarTablaBusqueda1(tablaProductosTiendaOrigen.get(comboTienda.getSelectedIndex()-1));
            comboTienda.setSelectedIndex(0);
          
        } else if(comboTienda.getSelectedIndex()==0 && comboNombreProducto.getSelectedIndex()!=0 && comboCodigoProducto.getSelectedIndex()==0 && comboFabricanteProducto.getSelectedIndex()==0){
            mostrarTablaBusqueda2(tablaNombreProductos.get(comboNombreProducto.getSelectedIndex()-1));          
            comboNombreProducto.setSelectedIndex(0);
        } else if(comboTienda.getSelectedIndex()==0 && comboNombreProducto.getSelectedIndex()==0 && comboCodigoProducto.getSelectedIndex()!=0 && comboFabricanteProducto.getSelectedIndex()==0){
            mostrarTablaBusqueda3(tablaCodigoProductos.get(comboCodigoProducto.getSelectedIndex()-1));          
            comboCodigoProducto.setSelectedIndex(0);
        } else if(comboTienda.getSelectedIndex()==0 && comboNombreProducto.getSelectedIndex()==0 && comboCodigoProducto.getSelectedIndex()==0 && comboFabricanteProducto.getSelectedIndex()!=0){
            mostrarTablaBusqueda4(tablaFabricanteProductos.get(comboFabricanteProducto.getSelectedIndex()-1));                
            comboFabricanteProducto.setSelectedIndex(0);
        } else if(comboTienda.getSelectedIndex()==0 && comboNombreProducto.getSelectedIndex()==0 && comboCodigoProducto.getSelectedIndex()==0 && comboFabricanteProducto.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(null, "Por favor, Seleccione un Campo de Busqueda");
        }
            else{
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione Un Solo Campo de Busqueda");
            comboTienda.setSelectedIndex(0);
            comboNombreProducto.setSelectedIndex(0);
            comboCodigoProducto.setSelectedIndex(0);
            comboFabricanteProducto.setSelectedIndex(0);
        }// TODO add your handling code here:
    }//GEN-LAST:event_buscarTiendaActionPerformed

    private void comboNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNombreProductoActionPerformed

    private void comboCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodigoProductoActionPerformed

    private void comboFabricanteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFabricanteProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFabricanteProductoActionPerformed

    private void verTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTodosActionPerformed
        mostrarTablaCompleta();
    }//GEN-LAST:event_verTodosActionPerformed

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
    public javax.swing.JButton buscarTienda;
    public javax.swing.JButton cerrarSesion;
    private javax.swing.JComboBox<String> comboCodigoProducto;
    private javax.swing.JComboBox<String> comboFabricanteProducto;
    private javax.swing.JComboBox<String> comboNombreProducto;
    private javax.swing.JComboBox<String> comboTienda;
    public javax.swing.JLabel descripcionReporte;
    public javax.swing.JLabel inUsuario11;
    private javax.swing.JLabel infoTienda;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    public javax.swing.JButton verTodos;
    // End of variables declaration//GEN-END:variables
}
