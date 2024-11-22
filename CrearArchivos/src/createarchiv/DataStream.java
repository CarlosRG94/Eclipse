package createarchiv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream dataOutSt = new DataOutputStream( new FileOutputStream("C:\\Users\\carli\\data.bin"));
			dataOutSt.writeInt(123);
			dataOutSt.writeFloat(123.45F);
			dataOutSt.writeLong(789);
			dataOutSt.close();
			
			DataInputStream dataInSt = new DataInputStream( new FileInputStream("C:\\Users\\carli\\data.bin"));
			int entero = dataInSt.readInt();
			float numeroFloat = dataInSt.readFloat();
			long numeroLong = dataInSt.readLong();
			dataInSt.close();
			System.out.println(entero);
			System.out.println(numeroFloat);
			System.out.println(numeroLong);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
