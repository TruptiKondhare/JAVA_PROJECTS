package wipro5;

import java.util.Scanner;
abstract class Loan1{	
	int LoanRate;	
	abstract void getRate();	
	
	public void calculateBill(int units) {		
		System.out.println("Consumer has to pay rs" +LoanRate);	}	
	}

class EductionalLoan extends Loan1{	
	@Override	
	public void getRate() {		
		LoanRate =10;	
		}
	}

class HousingLoan1 extends Loan1{	
	@Override	
	public void getRate(){		
		LoanRate=12;			
		}
	}

class BusinessLoan1 extends Loan1{	
	@Override	
	public void getRate() {		
		LoanRate=15;			
		}
	}

class GetPlanDFactory{	
	public Loan1 getPlan (String planeType) {		
		if (planeType.equals("EductionalLoan"))			
			return new EductionalLoan(); 		
		else if (planeType.equals("HousingLoan"))			
			return new HousingLoan1(); 		
		else if (planeType.equals("BusinessLoan"))			
			return new BusinessLoan1();		
		return null;					
		}
	}
public class BankFactory {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the type of Building:(EductionalLoan/HousingLoan/BusinessLoan)");		
		String strBuildingType=sc.next();		
		GetPlanDFactory planeFactory = new GetPlanDFactory();		
		Loan1 pln=planeFactory.getPlan(strBuildingType);
		/*
		System.out.println("How many units of consumed...");		
		int iUnits=sc.nextInt();		
			
		*/	
		pln.getRate();	
		System.out.println("Rate per unit for... \n"+strBuildingType+" is:: "+pln.LoanRate );		
		/*pln.calculateBill(iUnits);*/

	}
}

