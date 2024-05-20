
package wipro3;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class stored {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
			System.out.println("connected to database...");			
			CallableStatement cal=con.prepareCall("{call insertINTOEMP2(?,?)}");						
			Scanner sc =new Scanner(System.in);			
			System.out.println("Enter a name..");			
			String strName=sc.next();			
			System.out.println("Enter Salary..");			
			int sal=sc.nextInt();			
			cal.setString(1,strName);			
			cal.setInt(2,sal);			
			cal.execute();			
			System.out.println("Succesfully executed a stored procedure");			
			con.close();			
			System.out.println("Closed the databse connection succesfully..");
		
	
		} catch (ClassNotFoundException e) {			
			// TODO Auto-generated catch block					
		}catch (SQLException ex) {			
				System.out.println(ex);					
		}			
			}
}