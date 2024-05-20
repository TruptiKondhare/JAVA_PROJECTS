/*package wipro2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class EmployeeSerializatrion implements Serializable{	
	int id;	String name;	
	String dept;	
	String designation;	
	EmployeeSerializatrion(int id, String name, String dept, String designation) {				
		this.id = id;		
		this.name = name;		
		this.dept = dept;		
		this.designation = designation;	}	
	@Override	
	public String toString() {		
		// TODO Auto-generated method stub		
		return  "EmployeeSerializatrion[id="+id+ ", name="+name+",dept="+dept+",designation="+designation+"]";			
		}
}

public class DeserelizationPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("c:\\Java\\Data\\BufferedfileDemo");
			ObjectInputStream ois = new ObjectInputStream(fis);
			EmployeeSerializatrion empObj = (EmployeeSerializatrion) ois.readObject();
			System.out.println("Employee Object is serized succesfully..." + empObj);
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e2) {
			System.out.println(e2);

		}
	}
}
*/