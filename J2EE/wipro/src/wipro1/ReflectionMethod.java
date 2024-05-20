package wipro1;


import java.lang.reflect.Method;import java.lang.reflect.Modifier;
class Emp3 {
public String getData() {
return "Returning the data";
}
public void setData() {
//Setting the data.
}
}
public class ReflectionMethod {	
	public static void main (String args[]) {		
		Emp3 emp = new Emp3();				
		Class obj=emp.getClass();				
		Method listOfMethods[] = obj.getDeclaredMethods();				
		for (Method m :listOfMethods) {			
			String methodName = m.getName();			
			System.out.println("\nMethod name is : "+methodName);						
			int intModifier = m.getModifiers();			
			String strModifier = Modifier.toString(intModifier);			
			System.out.println("Modifier of the class: "+strModifier );			
			System.out.println("Method return type: "+m.getReturnType());					}	}	
}