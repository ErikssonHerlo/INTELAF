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
public class VisualizarEmpleados extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    protected ArrayList<String> listaProductosPedido= new ArrayList<>();    //AQUI SE GUARDAN TODOS LOS DATOS DEL DETALLE PEDIDO
    
    protected ArrayList<String> listaCodigoEmpleados= new ArrayList<>();   
    protected ArrayList<String> listaNombreEmpleados= new ArrayList<>();   
       
    
    
     /**
     * Creates new form Interfaz
     */
    public VisualizarEmpleados(String nombreTienda, String codigoTienda) {
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
        tableEmpleados = new javax.swing.JTable();
        inUsuario11 = new javax.swing.JLabel();
        buscarTienda = new javax.swing.JButton();
        infoTienda = new javax.swing.JLabel();
        verTodos = new javax.swing.JButton();
        comboNombreEmpleado = new javax.swing.JComboBox<>();
        comboCodigoEmpleado = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(1, 1, 1));
        Titulo.setText("EMPLEADOS");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 20, 320, 53));

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

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Codigo Empleado", "Telefono", "DPI", "NIT", "E-Mail", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 750, 170));

        inUsuario11.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario11.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario11.setText("Buscar por: ");
        getContentPane().add(inUsuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 130, 30));

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

        verTodos.setBackground(new java.awt.Color(43, 46, 46));
        verTodos.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        verTodos.setForeground(new java.awt.Color(250, 250, 244));
        verTodos.setText("Ver Todos los Empleados");
        verTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTodosActionPerformed(evt);
            }
        });
        getContentPane().add(verTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 40));

        comboNombreEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        comboNombreEmpleado.setToolTipText("");
        comboNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 150, 30));

        comboCodigoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIT" }));
        comboCodigoEmpleado.setToolTipText("");
        comboCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodigoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 150, 30));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mostrarTablaCompleta() {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT * FROM EMPLEADO ORDER BY Codigo_Empleado ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Codigo_Empleado", "Telefono", "DPI","NIT","E-Mail","Direccion"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"),rs.getString("NIT"),rs.getString("Correo_Electronico"),rs.getString("Direccion")});
            }
            tableEmpleados.setModel(model);
        } catch (SQLException e) {
        }
    }
      private void mostrarTablaBusqueda1(String nombreEmpleado) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EMPLEADO WHERE Nombre='"+nombreEmpleado+"' ORDER BY Codigo_Empleado ASC");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Codigo_Empleado", "Telefono", "DPI","NIT","E-Mail","Direccion"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"),rs.getString("NIT"),rs.getString("Correo_Electronico"),rs.getString("Direccion")});
            }
            tableEmpleados.setModel(model);
        } catch (SQLException e) {
        }
    }

 private void mostrarTablaBusqueda2(String codigoEmpleado) {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
       ResultSet rs = conexion.getTabla("SELECT * FROM EMPLEADO WHERE Codigo_Empleado='"+codigoEmpleado+"'");
         model.setColumnIdentifiers(new Object[]{"Nombre", "Codigo_Empleado", "Telefono", "DPI","NIT","E-Mail","Direccion"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Codigo_Empleado"), rs.getString("Telefono"), rs.getString("DPI"),rs.getString("NIT"),rs.getString("Correo_Electronico"),rs.getString("Direccion")});
            }
            tableEmpleados.setModel(model);
        } catch (SQLException e) {
        }
    }


 
    private void llenarCombos() {
        
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT Nombre FROM EMPLEADO");
        try {
            while (rs.next()) {
                comboNombreEmpleado.addItem(rs.getString(1));
                listaNombreEmpleados.add(rs.getString(1));
                }

        } catch (SQLException e) {

        }
        ResultSet rs1 = conexion.getTabla("SELECT Codigo_Empleado FROM EMPLEADO");
       
        try {
            while (rs1.next()) {
                comboCodigoEmpleado.addItem(rs1.getString(1));
                listaCodigoEmpleados.add(rs1.getString(1));
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

    private void tableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpleadosMouseClicked
             
    }//GEN-LAST:event_tableEmpleadosMouseClicked

    private void buscarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTiendaActionPerformed
       
        if(comboNombreEmpleado.getSelectedIndex()!=0 && comboCodigoEmpleado.getSelectedIndex()==0){
            mostrarTablaBusqueda1(listaNombreEmpleados.get(comboNombreEmpleado.getSelectedIndex()-1));          
            comboNombreEmpleado.setSelectedIndex(0);
        } else if(comboNombreEmpleado.getSelectedIndex()==0 && comboCodigoEmpleado.getSelectedIndex()!=0 ){
            mostrarTablaBusqueda2(listaCodigoEmpleados.get(comboCodigoEmpleado.getSelectedIndex()-1));          
            comboCodigoEmpleado.setSelectedIndex(0);
        } else if(comboNombreEmpleado.getSelectedIndex()==0 && comboCodigoEmpleado.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(null, "Por favor, Seleccione un Campo de Busqueda");
        }
            else{
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione Un Solo Campo de Busqueda");
          comboNombreEmpleado.setSelectedIndex(0);
            comboCodigoEmpleado.setSelectedIndex(0);  
        }
    }//GEN-LAST:event_buscarTiendaActionPerformed

    private void verTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTodosActionPerformed
        mostrarTablaCompleta();
    }//GEN-LAST:event_verTodosActionPerformed

    private void comboNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNombreEmpleadoActionPerformed

    private void comboCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodigoEmpleadoActionPerformed

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
    private javax.swing.JComboBox<String> comboCodigoEmpleado;
    private javax.swing.JComboBox<String> comboNombreEmpleado;
    public javax.swing.JLabel inUsuario11;
    private javax.swing.JLabel infoTienda;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmpleados;
    public javax.swing.JButton verTodos;
    // End of variables declaration//GEN-END:variables
}
