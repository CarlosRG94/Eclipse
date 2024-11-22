package createarchiv;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Tuberias {

	public static void main(String[] args) throws IOException {
		//Creamos un PipedOutputStream (tubería de salida) para la escritura de datos
		final PipedOutputStream salida =  new PipedOutputStream();
		
		//Creamos un PipedInputStream(tubería de entrada) conectando a la tuberia de salida
		//Todo lo que se escriba en la tubería de salida será leído desde entrada
		final PipedInputStream entrada = new PipedInputStream(salida);
		
		//Creamos el primer hilo que se encargará de escribir los datos en el PipedOutputStream
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					//Escribimos una cadena texto en la tuberia de salida pasandola a bytes
					salida.write("Hola, que tal?".getBytes());
					salida.close();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		});
		
		//Creamos el segundo hilo que se encargara de leer los datos de la tubería de entrada
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					//Leemos el primer byte desde el PipedInputStream
					int unByte = entrada.read();
					
					//Continuamos leyendo mientras el valor no sea -1(indica el fin del stream)
					while (unByte != -1) {
						System.out.print((char) unByte);
						//Leemos el siguiente byte para continuar el procreso
						unByte = entrada.read();
					}
					entrada.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		thread1.start();
		thread2.start();
	}

}
