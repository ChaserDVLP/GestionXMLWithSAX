/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad_gestionxmlconsax;

import java.io.File;

/**
 *
 * @author xChas
 */
public class UsaAccesoXMLSAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File fichero = new File("Libros.xml");
        AccesoXMLSAX a = new AccesoXMLSAX();
        a.parserXMLconLibrosSAXHandler(fichero);
    }
    
}
