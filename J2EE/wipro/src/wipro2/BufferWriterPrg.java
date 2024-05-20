
package wipro2;
import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;
public class BufferWriterPrg {

	public static void main (String args[]) {

		try {

			FileWriter fw=new FileWriter("c:\\java\\Data\\BufferedfileDemo.txt");

			BufferedWriter buffer =new BufferedWriter(fw);

			buffer.write("Writing using buffer into a file");

			System.out.println("Data written into the file successfully");

			buffer.close();

			

		}catch(IOException e) {

			e.printStackTrace();

			

		}

	}



}
