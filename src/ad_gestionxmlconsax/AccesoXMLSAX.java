/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            LibrosSaxHandler sh = new LibrosSaxHandler();
            parser.parse(file, sh);
            return 0;
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
            return -1;
        }
    }
    
}
