
package wipro2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Filereaderprg {
	public static void main(String[] args) {

		try {

			FileReader fr=new FileReader("c:\\java\\data\\filereader.txt");

			int i=0;

			while ((i=fr.read()) !=-1) {

				System.out.print((char)i);

			}

			fr.close();
		}catch(FileNotFoundException e){

			e.printStackTrace();

		}catch(IOException e1){

			e1.printStackTrace();
		

		}


	}



}