
package wipro3;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {	
	public static void main(String[] args) {	
		
	}	
	int sum (int x ,int y) {		
		return x+y;	
		}	
	String login(String uid,String pwd) {		
		if(uid.equals("Trupti") && pwd.equals("admin"))
			return "Valid User"; 
		else 	 
			return "Invalid User";	}		
	@BeforeClass	
	public static void beforeClassFunc() {		
		System.out.println("Connectiong to the database.. beforeclass");	
		}	
	@Before	
	public  void beforeFunction() {		
		System.out.println("\nBefore the actual method is executed..");	}	
	@After	
	public  void afterFunction() {		
		System.out.println("after the code is executed..");	}	
	@Test	
	public void testsum() {		
		test testobj=new test();		
		int x=20,y=30,iResult=50;		
		System.out.println("Executed the sum()...");		
		int result = testobj.sum(x,y);		
		assertEquals (iResult,result);			
		}	
	@Test	
	public void testLogin() {		
		test testObj=new test();		
		String uid="Trupti";		
		String pwd="admin";		
		System.out.println("Executed the login()..");		
		String strResult =testObj.login(uid,pwd);		
		assertEquals("Valid User",strResult);	}	
	@AfterClass	
	public static void afterclassFunction() {		
		System.out.println("Atatbase is relesed .. afterclass");	}
}