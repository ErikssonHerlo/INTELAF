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
public class Reporte8HTML {
    
    public void generarReporte(JTable tabla, String tiendaDestino) {
        
        try {
            
            try (FileWriter archivo = new FileWriter("8-Reporte de los Productos más Vendidos en un Intervalo de Tiempo en la Tienda "+tiendaDestino+".html")) {
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
                out.write("            <h1> Productos más vendidos en la Tienda </h1>\n");
                out.println("<h2>" +tiendaDestino+ "</h2>");
                out.write("        </header>\n");
                out.write("        <br>\n");
                
                out.write("        <br>\n");
                out.write("        <section>\n");
                //INICIO PRIMERA COLUMNA
                out.write("            <article  >\n");
                out.write("                Cantidad de Ventas\n");
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
                out.write("                 Codigo Producto\n");
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
                out.write("                Tienda Existencia\n");
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
