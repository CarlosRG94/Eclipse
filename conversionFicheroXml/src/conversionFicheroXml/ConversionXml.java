package conversionFicheroXml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class ConversionXml {

	public static void main(String[] args) throws ParserConfigurationException, IOException, Exception {
		//Crear una nueva instancia de DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//Establecer la validación a true, lo que significa que el XML será validado
		//contra un DTD o esquema si está definido
		factory.setValidating(true);
		
		//Ignorar los espacios en blanco innecesarios dentro de los elementos, lo que ayuda a limpiar el documento XML y facilita su procesamiento
		factory.setIgnoringElementContentWhitespace(true);
		
		//Crear un nuevo DocumentBuilder, que se usará para analizar el archivo XML
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//Especificar el archivo XML que se va a analizar, en este caso ejemplo.xml
		File file =  new File("C:\\Users\\carli\\OneDrive\\Escritorio\\dam\\Acceso a datos\\Ejemplo.xml");
		
		//Parsear el archivo XML y generar un objeto Document que representa el contenido del XML
		Document doc = builder.parse(file);
		
		
		
	}

}
