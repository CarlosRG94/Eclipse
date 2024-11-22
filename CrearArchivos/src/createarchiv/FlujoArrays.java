package createarchiv;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class FlujoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharArrayWriter salida = new CharArrayWriter();
		
		try {
			salida.write("Hola amigo");
			salida.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		CharArrayReader entrada = new CharArrayReader(salida.toCharArray());
		
		int data = 0;
		
		try {
			data = entrada.read();
			while (data != -1) {
			System.out.println((char)data);
			data = entrada.read();
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			entrada.close();
		}

	}

}
