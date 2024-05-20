package wipro1;

class EmployeeGenericsl{
	int id;
	String name; 
	String dept;
	String designation;
	
	public EmployeeGenericsl(int id, String name, String dept, String designation) {
		this.id = id;
	    this.name = name;
	    this.dept = dept;
	    this.designation = designation;		
	 }
	 @Override
	 public String toString() {
		  return "EmployeeGenerics1 [id=" + id + ", name=" + name + ", dept=" + dept + ", designation="+ designation + "]";
	 }
}
class generics1 <X>{
	X data;
	void assign (X data) {
		this.data=data;
	}
	void display() {
		System.out.println("Given data: "+data);
	}
}
public class GenericClass{
	public static void main(String args[]) {
		generics1 <Integer> intObj=new generics1 <Integer>();
		intObj.assign(100);
		intObj.display();
		
		generics1 <String> strObj=new generics1 <String>();
		strObj.assign("Java Generics");
		strObj.display();
		
		EmployeeGenericsl empObj=new EmployeeGenericsl(1001,"Yash","IT","Manager");
		generics1 <EmployeeGenericsl> empGen=new generics1 <EmployeeGenericsl>();
		
		empGen.assign(empObj);
		empGen.display();
		
		
	}
	
}

	