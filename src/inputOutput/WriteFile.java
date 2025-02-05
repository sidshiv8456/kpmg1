package inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter f =new FileWriter("myfile.txt");
			String content = "THis is my file";
			f.write(content);
			f.flush();
			System.out.println("done");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
