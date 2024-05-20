package wipro2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

public class SerelizationPrg {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		EmployeeSerializatrion empObj=new EmployeeSerializatrion(101,"Charan","IT","Manager");		
		try {			
			FileOutputStream fos=new FileOutputStream("c:\\Java\\Data\\BufferedfileDemo");			
			ObjectOutputStream oos= new ObjectOutputStream(fos);			
			oos.writeObject(empObj);			
			System.out.println("Employee Object is serized succesfully...");			
			fos.close();			
			oos.close();								
			}catch(FileNotFoundException ex){			
				System.out.println(ex);					
				}catch(IOException e){			
					System.out.println(e);		}		
	}
}
