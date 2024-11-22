package createarchiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class AnalisiToken {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("C:\\Users\\carli\\prueba5.txt"));
			while(streamTokenizer.nextToken()!= StreamTokenizer.TT_EOF) {
				if(streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
					System.out.println(streamTokenizer.sval);
				}else if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println(streamTokenizer.nval);
				}else if(streamTokenizer.ttype == StreamTokenizer.TT_EOL){
					System.out.println();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
