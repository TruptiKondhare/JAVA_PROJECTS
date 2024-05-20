package wipro2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderprg {
	public static void main (String args[]) {		
		try {			
			FileReader fr=new FileReader("c:\\java\\Data\\BufferedfileDemo.txt");			
			BufferedReader br =new BufferedReader(fr);			
			int i=0;			
			while ((i=br.read()) !=-1) {				
				System.out.print((char)i);			
				}		
			}catch(FileNotFoundException e){			
				e.printStackTrace();
		}catch(IOException e1) {			
			System.out.println("Exxception is: " +e1);					}	}
}
