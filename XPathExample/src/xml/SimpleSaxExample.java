package xml;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SimpleSaxExample {

	public static void main(String[] args) {
		try {
			//Crear una instancia de SAXParserFactory
			//SAXParserFactory se utiliza para crear un SAXParser, que es el componente que analiza el XML de manera secuencial y basada en eventos
			SAXParserFactory factory = SAXParserFactory.newInstance();
			//Crear un SAXParser a partir de la fabrica
			SAXParser saxParser = factory.newSAXParser();
			
			//Crear un manejador que extiende DefaultHandler para procesar el XML
			DefaultHandler handler = new DefaultHandler() {
				boolean isPersona = false; //Bandera para verificar si estamos en un elemento "persona"
				
				//Método que se llama al comienzo de un elemento
				public void startElement(String uri, String localName, String qName, Attributes attributes ) throws SAXException {
					//Comprobar si el elemento es "persona"
					if (qName.equalsIgnoreCase("persona")) {
						isPersona = true; //Establecer la bandera si estamos en un elemento "persona"
					}
				}
				
				//Método que se llama al final de un elemento
				public void endElement(String uri, String localName, String qName) throws SAXException {
					//Comprobar si hemos cerrado un elemento "persona"
					if (qName.equalsIgnoreCase("persona")) {
						isPersona = false; //Restablecer la bandera
					}
				}
				
				//Método que se llama cuando se encuentra texto dentro de un elemento
				public void characters(char[] ch, int start, int length) throws SAXException {
					if (isPersona) {
						//Si estamos en un elemento "titulo" imprimir el texto
						System.out.println("Persona" + new String(ch, start, length));
					}
				}
			};
			
			//Parsear el archivo XML utilizando el manejador
			saxParser.parse("C:\\\\Users\\\\carli\\\\eclipse-workspace\\\\XPathExample\\\\src\\\\xml\\\\Personas.xml", handler);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List<String> getBookTitles1(String string){
		return null;
		
	}
	public List<String> getBookTitles(String string){
		return null;
		
	}
}
	
	
			
					
