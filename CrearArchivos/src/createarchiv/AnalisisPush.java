package createarchiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class AnalisisPush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PushbackReader pushbackReader = new PushbackReader(
					new FileReader("C:\\Users\\carli\\prueba5.txt"));
			int data = pushbackReader.read();
			System.out.println((char)data);
			pushbackReader.unread(data);
			data = pushbackReader.read();
			System.out.println((char)data);
			pushbackReader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

}
