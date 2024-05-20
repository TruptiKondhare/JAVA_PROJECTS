
package wipro4;
import java.util.Scanner;

public class RuntimePolimorphism {	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner (System.in);		
		System.out.println("Enter your choice(Merc/Benz)");		
		String strChoice=sc.next();						
		car carObj=null;		
		if (strChoice.equals("Merc"))		
			carObj=new Merc();		
		else if (strChoice.equals("Benz"))			
			carObj=new Benz();				
		carObj.displayfeatures();					
	}
}
