
package wipro3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
			System.out.println("connected to database...");			
			Statement st =con.createStatement();	
			/*
			st.executeUpdate("INSERT INTO emp(name ,sal) values ('Trupti',3000)");	
		
			System.out.println( "Data insterted successfully..");	
			
			st.executeUpdate("UPDATE emp set name ='Ram.k' WHERE name ='Ram'");			
			System.out.println("Data updated successfully..");						
					*/	
			st.executeUpdate("Delete from emp WHERE name ='Trupti'");			
			System.out.println("Data deleted successfully..");
			con.close();					
			} catch (ClassNotFoundException e) {			
				// TODO Auto-generated catch block					
			}catch (SQLException ex) {			
					System.out.println(ex);					
			}			
		
		}
	
}