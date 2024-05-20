package wiproProxy;

interface OfficeInternetAccess{	
	public void grantInternetAccess();
	}
class RealInternetAccess implements OfficeInternetAccess{	
	private String employeeName;	
	public RealInternetAccess(String empName) 
	{		
		this.employeeName=empName;			
		}	
	@Override	
	public void grantInternetAccess() {		
		System.out.println("Internet Access for employee:" +employeeName);	
		}
	}
class ProxyInternetAccess implements OfficeInternetAccess {	
	private String employeeName;	
	private RealInternetAccess realaccess;	
	public ProxyInternetAccess(String employeeName) {		
		this.employeeName=employeeName;	}	
	@Override 	
	public void grantInternetAccess() {		
		if (getRole(employeeName)>4)		
		{			
			realaccess= new RealInternetAccess(employeeName);			
			realaccess.grantInternetAccess();					
			}		
		else {			
			System.out.println("No internat Access Granted");		
			}	}

public int getRole(String emplName) {	
	return 9;}}
public class proxtex {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		OfficeInternetAccess access=new ProxyInternetAccess("Trupti");		
		access.grantInternetAccess();		
		}
	}


