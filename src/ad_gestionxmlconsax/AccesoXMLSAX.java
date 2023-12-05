
package ad_gestionxmlconsax;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author xChas
 */
public class AccesoXMLSAX {
    
    SAXParser parser;
    
    public int parserXMLconLibrosSAXHandler (File file) {
        
        try {
            
            //Creamnos el SAXParserFactory
            SAXParserFactory factory = SAXParserFactory.newInstance();  
            //Instanciamos el objeto SAXParser           
            parser = factory.newSAXParser(); 
            //Clase donde instanciamos los métodos que controlan los eventos
            LibrosSaxHandler sh = new LibrosSaxHandler(); 
            //Le pasamos el documento al parser y la clase que gestiona los eventos
            parser.parse(file, sh); 
            
            //Alternativa para unir las dos últimas líneas
            //parser.parse(new File(file), new LibrosSaxHandler();
            
            return 0;
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
            return -1;
        }
    }
    
}
