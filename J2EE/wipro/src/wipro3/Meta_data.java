package wipro3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Meta_data {



	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
			System.out.println("connected to database...");			
			DatabaseMetaData dbMeta=con.getMetaData();									
			System.out.println("Name of the Database : "+dbMeta.getDatabaseProductName());			
			System.out.println("Name of the Driver : "+dbMeta.getDriverName());			
			System.out.println("Driver version : "+dbMeta.getDriverVersion());			
			System.out.println("Table name length : "+dbMeta.getMaxTableNameLength());			
			System.out.println("Maximun number in a table : "+dbMeta.getMaxColumnsInTable());
		
		    con.close();			
		    System.out.println("closed the db connection scccesfully...");		
		    
		    } catch (ClassNotFoundException e) {			// TODO Auto-generated catch block					
			
		    }catch (SQLException ex) {			
			  System.out.println(ex);					}
	} 

									}

