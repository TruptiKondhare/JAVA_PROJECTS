package wipro1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
class Employ{
private String name;
}
public class ReflectionPrivate {
	public static void main (String args[]) throws NoSuchFieldException, SecurityException,IllegalAccessException{		
		Employ emp = new Employ();		
		Class obj = emp.getClass();		
		Field field1=obj.getDeclaredField("name");		
		field1. setAccessible(true);		
		field1 .set(emp,"Charan");		
		String nameData =(String)field1.get(emp);		
		System.out.println ("\n private data modifier..name value :"+ nameData);				
		int modifierl= field1.getModifiers();		
		String strModifier1=Modifier.toString(modifierl);		
		System.out.println("Fiels modifier is :"+ strModifier1);	}

}
