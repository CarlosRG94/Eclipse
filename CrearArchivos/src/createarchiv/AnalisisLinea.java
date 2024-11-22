package createarchiv;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class AnalisisLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LineNumberReader linenmrd = new LineNumberReader(new FileReader("C:\\Users\\carli\\prueba5.txt"));
			String line = linenmrd.readLine();
			linenmrd.setLineNumber(2);
			while (line != null) {
				if (linenmrd.getLineNumber()>2) {
					System.out.println("Contenido de la linea numero:"+ linenmrd.getLineNumber());
					System.out.println(line);
				}
				line = linenmrd.readLine();
			}
			linenmrd.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
