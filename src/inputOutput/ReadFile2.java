package inputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile2 {
	public static void main(String[] args) {
		try {
			FileReader f =new FileReader("myfile.txt");
			//String content = "THis is my file";
			int data =f.read();
			while(data != -1) {
				
				System.out.print((char)data);
				data = f.read();
			}
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
