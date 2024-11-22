package xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SimpleDomExample {

	public static void main(String[] args) {
		try {
			//Crear una instancia del DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//Crear un DocumentBuilder a partir de la fábrica
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Cargar y parsear el archivo XML
			Document doc = builder.parse("C:\\Users\\carli\\eclipse-workspace\\XPathExample\\src\\xml\\Personas.xml");
			
			//Normalizar el documento para asegurar que la estructura es correcta
			doc.getDocumentElement().normalize();
			
			//Obtener la lista de elementos "libro" del documento XML, que devuelve la lista de nodos
			NodeList personaList = doc.getElementsByTagName("persona");
			
			//Imprimir los nombres de las personas
			System.out.println("Nombres de las personas:");
			for (int i = 0; i < personaList.getLength(); i++) {
				//Obtener cada elemento "persona" de la lista, hacemos el casting porque sino no podriamos obtener el elemento nombre con getElementsByTagName
				Element persona = (Element) personaList.item(i);
				//Obtener el contenido del elemento "nombre" dentro de cada "persona"
				String nombre = persona.getElementsByTagName("nombre").item(0).getTextContent();
				System.out.println(nombre);
			}
			
		} catch (IOException | ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		}

	}

}
