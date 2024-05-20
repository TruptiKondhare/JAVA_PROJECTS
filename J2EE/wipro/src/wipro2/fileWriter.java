package wipro2;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
	public static void main (String args[] ) throws  IOException {
		FileWriter fw =new FileWriter("c://Java//data//filewriter.txt");
		fw.write("This is a filewriter file content...");
		System.out.println("content is writeen in file");
		fw.close();
			
		
	}

}
