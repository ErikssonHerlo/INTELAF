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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Producto;
import objetos.Tienda;
import reportes.Reporte2HTML;
import reportes.Reporte5HTML;

/**
 *
 * @author erikssonherlo
 */
public class Reporte2 extends javax.swing.JFrame {
    String Fondo1 = "FondoNaranja5.png";
    String Logotipo = "LogoHorizontalpequeño.png";
    protected String nombreTienda;
    protected String codigoTienda;
    protected ArrayList<String> listaNombreCliente= new ArrayList<>();    //AQUI SE GUARDAN TODOS LOS DATOS DEL DETALLE PEDIDO
    String nombreCliente;
        String NITDelCliente;
    String fechaConsulta = "";
    
    
     /**
     * Creates new form Interfaz
     */
    public Reporte2(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
        
        initComponents();
        infoTienda.setText(this.nombreTienda);
        
        
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
        buscarTienda = new javax.swing.JButton();
        infoTienda = new javax.swing.JLabel();
        exportarReporte = new javax.swing.JButton();
        descripcionReporte = new javax.swing.JLabel();
        inUsuario12 = new javax.swing.JLabel();
        textoUsuario1 = new javax.swing.JTextField();
        inUsuario13 = new javax.swing.JLabel();
        inUsuario9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedidos = new javax.swing.JTable();
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
        getContentPane().add(irMenuEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 150, 40));

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
        getContentPane().add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 150, 40));

        buscarTienda.setBackground(new java.awt.Color(43, 46, 46));
        buscarTienda.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        buscarTienda.setForeground(new java.awt.Color(250, 250, 244));
        buscarTienda.setText("Buscar");
        buscarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(buscarTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 150, 30));

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
        getContentPane().add(exportarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 230, 40));

        descripcionReporte.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        descripcionReporte.setForeground(new java.awt.Color(4, 2, 2));
        descripcionReporte.setText("Pedidos que estan a Tiempo de estar en la Tienda");
        getContentPane().add(descripcionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 460, 30));

        inUsuario12.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        inUsuario12.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario12.setText("Buscar por Fecha: *");
        getContentPane().add(inUsuario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        textoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuario1ActionPerformed(evt);
            }
        });
        textoUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoUsuario1KeyTyped(evt);
            }
        });
        getContentPane().add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 140, 30));

        inUsuario13.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 10)); // NOI18N
        inUsuario13.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario13.setText("AAAA-MM-DD");
        getContentPane().add(inUsuario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, 20));

        inUsuario9.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 10)); // NOI18N
        inUsuario9.setForeground(new java.awt.Color(4, 2, 2));
        inUsuario9.setText("*FECHA EN FORMATO AÑO-MES-DIA");
        getContentPane().add(inUsuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 250, 20));

        tablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Pedido", "Fecha", "Fecha Llegada", "NIT Cliente", "Anticipo Efectivo", "Anticipo Credito", "Anticipo", "Total", "Total a Pagar", "Caja", "Estado", "Tienda Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 930, 170));

        Fondo.setBackground(new java.awt.Color(59, 55, 51));
        Fondo.setText("Fondo General");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void mostrarTablaCompleta(String fechaConsulta) throws SQLException {
        //NITDelCliente = NITCliente;
        DefaultTableModel model = new DefaultTableModel();
        try {
        String query ="SELECT DISTINCT(p.Codigo_Pedido),p.Fecha,p.Fecha_Llegada,p.NIT_Cliente,p.Anticipo_Efectivo,p.Anticipo_Credito,p.Anticipo,p.Total,p.Total_A_Pagar,p.Pago_Total,p.Caja,p.Estado,d.Tienda_Destino FROM PEDIDO p JOIN DETALLE_PEDIDO d ON d.Codigo_Pedido = p.Codigo_Pedido WHERE d.Tienda_Destino = ? AND p.Fecha_Llegada =?";
        PreparedStatement enviar = Conexion.conexion.prepareStatement(query);
        ResultSet rs = null;
        
        enviar.setString(1, codigoTienda);
        enviar.setString(2, fechaConsulta);
        rs=enviar.executeQuery();
        model.setColumnIdentifiers(new Object[]{"Codigo Pedido", "Fecha", "Fecha_Llegada", "NIT Cliente","Anticipo Efectivo","Anticipo Credito","Anticipo","Total","Total a Pagar","Pago Total", "Caja","Estado","Tienda Destino"});
     
        
            while (rs.next()) {               
                 model.addRow(new Object[]{rs.getInt("Codigo_Pedido"), rs.getString("Fecha"), rs.getString("Fecha_Llegada"), rs.getString("NIT_Cliente"),rs.getDouble("Anticipo_Efectivo"),rs.getDouble("Anticipo_Credito"),rs.getDouble("Anticipo"),rs.getDouble("Total"),rs.getDouble("Total_A_Pagar"),rs.getDouble("Pago_Total"),rs.getDouble("Caja"),rs.getString("Estado"),rs.getString("Tienda_Destino")});
         }
            tablePedidos.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
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

    private void buscarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTiendaActionPerformed
        if(!textoUsuario1.getText().equals("")){
            fechaConsulta = textoUsuario1.getText().toString();
            try {
                mostrarTablaCompleta(fechaConsulta);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            

        } else {
           JOptionPane.showMessageDialog(null, "Por favor, ingrese una Fecha para realizar la Consulta");
        }
    }//GEN-LAST:event_buscarTiendaActionPerformed

    private void exportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporteActionPerformed
        if(!fechaConsulta.equals("")){    
            Reporte2HTML reporte = new Reporte2HTML();
            reporte.generarReporte(tablePedidos, nombreTienda);
            //reporte.generarReporte(tableDetalleVentas, listaNombreCliente.get(comboNITCliente.getSelectedIndex()-1));
            JOptionPane.showMessageDialog(null, "Reporte Exportado con Exito \nEl Reporte se guardará en la carpeta SistemaIntelaf");
        } else {
        JOptionPane.showMessageDialog(null, "Por favor, Seleccione un Campo de Busqueda para poder Generar el Reporte");
       
        }
    }//GEN-LAST:event_exportarReporteActionPerformed

    private void textoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuario1ActionPerformed

    private void textoUsuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuario1KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&textoUsuario1.getText().contains("--")){
            evt.consume();
        }
    }//GEN-LAST:event_textoUsuario1KeyTyped

    private void tablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePedidosMouseClicked

    }//GEN-LAST:event_tablePedidosMouseClicked

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
    public javax.swing.JLabel descripcionReporte;
    public javax.swing.JButton exportarReporte;
    public javax.swing.JLabel inUsuario12;
    public javax.swing.JLabel inUsuario13;
    public javax.swing.JLabel inUsuario9;
    private javax.swing.JLabel infoTienda;
    public javax.swing.JButton inicio;
    public javax.swing.JButton irMenuEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePedidos;
    public javax.swing.JTextField textoUsuario1;
    // End of variables declaration//GEN-END:variables
}
