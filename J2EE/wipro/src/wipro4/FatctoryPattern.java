
package wipro4;
import java.util.Scanner;
abstract class Plan1{	
	double ratePerUnit;	
	abstract void getRate();	
	
	public void calculateBill(int units) {		
		System.out.println("Consumer has to pay rs"+units*ratePerUnit);	}	
	}

class DomesticPlan extends Plan1{	
	@Override	
	public void getRate() {		
		ratePerUnit =3.50;	
		}
	}

class CommercialPlan extends Plan1{	
	@Override	
	public void getRate(){		
		ratePerUnit=7.50;			
		}
	}

class InstitionalPlan extends Plan1{	
	@Override	
	public void getRate() {		
		ratePerUnit=7.50;			
		}
	}

class GetPlanDFactory{	
	public Plan1 getPlan (String planeType) {		
		if (planeType.equals("DOMESTIC"))			
			return new DomesticPlan(); 		
		else if (planeType.equals("COMMERCIAL"))			
			return new CommercialPlan(); 		
		else if (planeType.equals("INSTUTION"))			
			return new InstitionalPlan();		
		return null;					
		}
	}
public class FatctoryPattern {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the type of Building:(DOMESTIC/COMMERCIAL/INSTUTION)");		
		String strBuildingType=sc.next();		
		GetPlanDFactory planeFactory=new GetPlanDFactory();		
		Plan1 pln=planeFactory.getPlan(strBuildingType);		
		System.out.println("How many units of consumed...");		
		int iUnits=sc.nextInt();		
		pln.getRate();				
		System.out.println("Rate per unit for "+strBuildingType+"is:"+pln.ratePerUnit);		
		pln.calculateBill(iUnits);

	}
}
