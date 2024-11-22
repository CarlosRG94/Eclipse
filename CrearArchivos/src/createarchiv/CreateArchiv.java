package createarchiv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateArchiv {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el nombre de ruta");
		Scanner sc2 = new Scanner(System.in);
		String ruta = sc2.nextLine();
		//System.out.println("Introduzca el nombre del archivo de entrada");
		//Scanner sc = new Scanner(System.in);
		//String entrada = sc.nextLine();
		//System.out.println("Introduzca el nombre del archivo de entrada");
		//String salida = sc.nextLine();
		System.out.println("Directorio actual: " + System.getProperty("user.dir"));
		CreateArchiv miObjeto = new CreateArchiv(); 
		//miObjeto.escribirArchivo(entrada);
		miObjeto.crearArchivo(ruta);
		//miObjeto.entradaSalida(entrada,salida);

	}
	

	public void crearArchivo(String ruta) {
		
		File fichero = new File (ruta);
		try {
			if (fichero.createNewFile()) {
				System.out.println("El archivo ha sido creado con existo, esta es la ruta"+ fichero.getAbsolutePath());
			} else {
				System.out.println("El archivo ya existe.");
			}
		}catch(IOException e) {
			System.out.println("Error al crear el archivo:" + e.getMessage());
		}
	}
	
	public void entradaSalida(String entrada, String salida) {
		try {
			FileInputStream archivoEntrada = new FileInputStream(entrada);
			FileOutputStream archivoSalida = new FileOutputStream(salida);
			int dato;
			while((dato = archivoEntrada.read()) != -1) {
				 archivoSalida.write(dato);
			}
			
			archivoEntrada.close();
			archivoSalida.close();
			
			System.out.println("El archivo a sido copiado con exito");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocurrió un error:" + e.getMessage());
		}
	}
	public void escribirArchivo(String entradaWrit) {
		try {
            // Abre el archivo en modo lectura y escritura ("rw")
            RandomAccessFile archivo = new RandomAccessFile(entradaWrit, "rw");

            // Posiciona el puntero en el byte 10
            archivo.seek(27);
            
            String escribir = "salida2";
            byte[] byteData = escribir.getBytes();

            // Escribe los bytes modificados
            archivo.write(byteData);

            System.out.println("Bytes modificados a partir de la posición 27.");

            // Cierra el archivo
            archivo.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
		
}


