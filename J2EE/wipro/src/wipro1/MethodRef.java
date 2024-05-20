package wipro1;

@FunctionalInterface
interface INewMap{	
	public void displayDirections();
}
public class MethodRef {	
	MethodRef() {		
		System.out.println("Constructor of the class Test...");
	}	
	public void displayGoogleMap() {		
		System.out.println("Displaying google map fron src to destination..");
	}	
	public static void displayGoogleMapsStatic() {	
		System.out.println("Displaying google maps from a static method...");	}


public static void main (String args[]) {	
	MethodRef testobj = new MethodRef();	
	INewMap IN = testobj::displayGoogleMap;	
	IN.displayDirections();	
	INewMap InStatic= MethodRef::displayGoogleMapsStatic;	
	InStatic.displayDirections();	
	INewMap INCons = GenericMethod::new;	INCons.displayDirections();	}}