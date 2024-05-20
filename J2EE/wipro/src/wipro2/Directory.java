package wipro2;
import java.io.File;
public class Directory {

	public static void main(String args[]) {

		String directoryPath="c:\\Java\\Data";

		File directory = new File (directoryPath);

		File files[]=directory.listFiles();

		System.out.println("List of file in the directory ::"+ directoryPath);

		if(files != null) {

			for (File file:files) {

				System.out.println(file.getName());

			}

		}

		

		}



}