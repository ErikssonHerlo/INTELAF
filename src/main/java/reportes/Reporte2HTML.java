/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;

/**
 *
 * @author erikssonherlo
 */
public class Reporte2HTML {
    
    public void generarReporte(JTable tabla, String tiendaDestino) {
        
        try {
            
            try (FileWriter archivo = new FileWriter("2-Reporte Pedidos que llegaran a la Tienda "+tiendaDestino+" pendientes de verificacion.html")) {
                PrintWriter out = new PrintWriter(archivo);
                /*
                *Se realiza la escritura del archivo con la estructura HTML
                 */
                out.write("<!DOCTYPE html>\n");
                out.write("<html>\n");
                out.write("    <head>\n");
                out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
                out.write("        <title>Reporte</title>\n");
                out.write("        <link rel=\"stylesheet\" href=\"/home/erikssonherlo/NetBeansProjects/SistemaIntelaf/src/main/java/reportes/newStyle.css\" type=\"text/css\">\n");
                out.write("    </head>\n");
                out.write("    <body class=\"estilo\">\n");
                out.write("        <header>\n");
                out.write("            <h1> Pedidos que Pendientes de Verificacion </h1>\n");
                out.println("<h2>" + tiendaDestino + "</h2>");
                out.write("        </header>\n");
                out.write("        <br>\n");
                
                out.write("        <br>\n");
                out.write("        <section>\n");
                //INICIO PRIMERA COLUMNA
                out.write("            <article  >\n");
                out.write("                Codigo Pedido\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    
                    String destino = Integer.toString((int) tabla.getValueAt(i, 0));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO SEGUNDA COLUMNA
                out.write("            <article >\n");
                out.write("                Fecha\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = (String)tabla.getValueAt(i, 1);
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO TERCERA COLUMNA
                out.write("            <article >\n");
                out.write("                Fecha Llegada\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = (String) tabla.getValueAt(i, 2);
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO CUARTA COLUMNA
                out.write("            <article>\n");
                out.write("                NIT Cliente\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = (String) tabla.getValueAt(i, 3);
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO QUINTA COLUMNA
                out.write("            <article>\n");
                out.write("                Anticipo Efectivo\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double) tabla.getValueAt(i, 4));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO SEXTA COLUMNA
                out.write("            <article>\n");
                out.write("                Anticipo Credito\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double) tabla.getValueAt(i, 5));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO SEPTIMA COLUMNA
                out.write("            <article>\n");
                out.write("                Anticipo\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double) tabla.getValueAt(i, 6));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO OCTAVA COLUMNA
                out.write("            <article>\n");
                out.write("                Total\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double)  tabla.getValueAt(i, 7));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO NOVENA COLUMNA
                out.write("            <article>\n");
                out.write("                Total a Pagar\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double)  tabla.getValueAt(i, 8));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO DECIMA COLUMNA
                
                out.write("            <article>\n");
                out.write("                Pago Total\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double)  tabla.getValueAt(i, 9));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //INICIO ONCEAVA COLUMNA
                
                out.write("            <article>\n");
                out.write("                Caja\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = Double.toString((double)  tabla.getValueAt(i, 10));
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //DOCEAVA COLUMNA

                out.write("            <article>\n");
                out.write("                Estado\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = (String) tabla.getValueAt(i, 11);
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //TRECEAVA COLUMNA
                out.write("            <article>\n");
                out.write("                Tienda Origen\n");
                out.write("                <br>\n");
                out.write("                <ul>\n");
                for (int i = 0; i < tabla.getRowCount(); i++) {
                    String destino = (String) tabla.getValueAt(i, 12);
                    out.println("<li>");
                    out.println(destino);
                    out.println("</li>");
                }
                out.write("                </ul>\n");
                out.write("            </article>\n");
                //FINALIZAN LAS COLUMNAS
                out.write("        </section>\n");
                out.write("    </body>\n");
                out.println("<footer>");
                out.println("INTELAF S.A");
                out.println("<br>");
                out.println("Quetzaltenango 2020");
                out.println("</footer>");
                out.write("</html>\n");
//nos aseguramos de cerrar el archivo
                archivo.close();
            }
        } catch (IOException e) {
        }
        
    }
    
}
