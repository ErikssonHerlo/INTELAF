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
import reportes.Reporte1HTML;
import reportes.Reporte5HTML;

/**
 *
 * @author erikssonherlo
 */
public class Reporte1 extends javax.swing.JFrame {
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
    public Reporte1(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
        infoTienda.setText(this.nombreTienda);
        
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
        tablePedidos = new javax.swing.JTable();
        infoTienda = new javax.swing.JLabel();
        exportarReporte = new javax.swing.JButton();
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

        tablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Pedido", "Fecha", "Fecha Llegada", "NIT Cliente", "Anticipo Efectivo", "Anticipo Credito", "Anticipo", "Total", "Total a Pagar", "Caja", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 930, 170));

        infoTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 14)); // NOI18N
        infoTienda.setText("Nombre Tienda");
        getContentPane().add(infoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        exportarReporte.setBackground(new java.awt.Color(43, 46, 46));
        exportarReporte.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        exportarReporte.setForeground(new java.awt.Color(250, 250, 244));
        exportarReporte.setText("Exportar Reporte");
        exportarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(exportarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 40));

        descripcionReporte.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        descripcionReporte.setForeground(new java.awt.Color(4, 2, 2));
        descripcionReporte.setText("Pedidos que llegarán a la Tienda");
        getContentPane().add(descripcionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 75, 310, 30));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mostrarTablaCompleta() {
        DefaultTableModel model = new DefaultTableModel();
        Conexion conexion = new Conexion();
        ResultSet rs = conexion.getTabla("SELECT p.* FROM PEDIDO p INNER JOIN DETALLE_PEDIDO d ON d.Codigo_Pedido = p.Codigo_Pedido WHERE d.Tienda_Destino = '"+codigoTienda+"'");
         model.setColumnIdentifiers(new Object[]{"Codigo Pedido", "Fecha", "Fecha_Llegada", "NIT Cliente","Anticipo Efectivo","Anticipo Credito","Anticipo","Total","Total a Pagar","Pago Total", "Caja","Estado"});
        
        try {
            while (rs.next()) {               
                model.addRow(new Object[]{rs.getInt("Codigo_Pedido"), rs.getString("Fecha"), rs.getString("Fecha_Llegada"), rs.getString("NIT_Cliente"),rs.getDouble("Anticipo_Efectivo"),rs.getDouble("Anticipo_Credito"),rs.getDouble("Anticipo"),rs.getDouble("Total"),rs.getDouble("Total_A_Pagar"),rs.getDouble("Pago_Total"),rs.getDouble("Caja"),rs.getString("Estado")});
            }
            tablePedidos.setModel(model);
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

    private void tablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePedidosMouseClicked
             
    }//GEN-LAST:event_tablePedidosMouseClicked

    private void exportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporteActionPerformed
        Reporte1HTML reporte = new Reporte1HTML();
            
            reporte.generarReporte(tablePedidos, nombreTienda);
    }//GEN-LAST:event_exportarReporteActionPerformed

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
    public javax.swing.JLabel descripcionReporte;
    public javax.swing.JButton exportarReporte;
    private javax.swing.JLabel infoTienda;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePedidos;
    // End of variables declaration//GEN-END:variables
}
