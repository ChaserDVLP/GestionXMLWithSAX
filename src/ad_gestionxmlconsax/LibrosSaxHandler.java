/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_gestionxmlconsax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/**
 *
 * @author xChas
 */
public class LibrosSaxHandler extends DefaultHandler {
    
    int cantidadLibros = 0;
    
    @Override
    public void startElement(String uri,String localName,String qName,Attributes atts) 
            throws SAXException {
        
        if(qName.equals("Libro")) { //Extrae el primer atributo
            cantidadLibros++;
            System.out.println("Libro Numero: "+cantidadLibros);
            System.out.print("\nPublicado en: "+atts.getValue(atts.getQName(0)));
        }
        //Aun no sabemos cual es el titulo, eso lo sabemos en el evento characters
        else if(qName.equals("Titulo")) {
            System.out.print("\nEl titulo es: ");
        }
        else if(qName.equals("Autor")) {
            System.out.print("El autor es: ");
        }
    }
    
    @Override
    public void endElement(String uri, String localName,String qName) throws SAXException {
        if(qName.equals("Libro")) {
            System.out.println("-----------------------------");
        }
    }
    
    @Override
    public void characters (char[] ch, int start, int length) throws SAXException {
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", "");
        car = car.replaceAll("\n", "");
        System.out.println(car);
    }
}
