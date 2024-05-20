package wipro1;


import java.lang.reflect.Modifier;
class Employee2 {	
	
}
public class ReflectionClass{	public static void main (String args[]) {	
	Employee2 emp=new Employee2();		
	Class obj = emp.getClass();	
	String className =obj.getName();		
	System.out.println("Name of the class is: "+className);		
	int intModifiers= obj.getModifiers();		
	String strMod= Modifier.toString(intModifiers);		
	System.out.println("Modifiers of the class: "+strMod) ;	
    Class superClass= obj.getSuperclass();		
    System.out.println("Super class of Employee2 is: " +superClass.getName());			}}