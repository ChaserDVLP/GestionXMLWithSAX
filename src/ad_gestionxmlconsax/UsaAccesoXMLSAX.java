
package ad_gestionxmlconsax;

import java.io.File;


public class UsaAccesoXMLSAX {

    public static void main(String[] args) {
        
        File fichero = new File("Libros.xml");
        AccesoXMLSAX a = new AccesoXMLSAX();
        a.parserXMLconLibrosSAXHandler(fichero);
    }
    
}
