
package ad_gestionxmlconsax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;


/*Aquí están los eventos del SAXParser, cuando ocurra un evento que invoque uno de estos métodos
se ejecuta sin necesidad de nosotros llamarlo, hay muchos más*/

public class LibrosSaxHandler extends DefaultHandler {
    
    int cantidadLibros = 0;

    //Se llama cada vez que encuentra una etiqueta
    @Override
    public void startElement(String uri,String localName,String qName,Attributes atts) 
            throws SAXException {

        //Si la etiqueta es Libro...
        if(qName.equals("Libro")) { 
            cantidadLibros++;
            System.out.println("Libro Numero: "+cantidadLibros);
            
            //Obtenemos el atributo del campo Libro
            System.out.print("\nPublicado en: "+atts.getValue(atts.getQName(0)));
        }
        //Aun no sabemos cual es el valor de titulo, eso lo sabemos en el evento characters
        else if(qName.equals("Titulo")) {
            System.out.print("\nEl titulo es: ");
        }
        else if(qName.equals("Autor")) {
            System.out.print("El autor es: ");
        }
    }
    //Se ejecuta despues de la etiqueta de cierre de Libro
    @Override
    public void endElement(String uri, String localName,String qName) throws SAXException {
        if(qName.equals("Libro")) {
            System.out.println("-----------------------------");
        }
    }

    //Se ejecuta dentro de cada elemento
    @Override
    public void characters (char[] ch, int start, int length) throws SAXException {
    
        String car = new String(ch, start, length);
        car = car.replaceAll("\t", ""); //Quita las tabulaciones
        car = car.replaceAll("\n", ""); //Quita los saltos de línea
        System.out.println(car);
    }
}
