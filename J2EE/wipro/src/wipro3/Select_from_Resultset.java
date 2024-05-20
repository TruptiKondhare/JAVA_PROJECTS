package wipro3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Select_from_Resultset {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		try {			
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
			System.out.println("connected to database...");						
			Statement st=con.createStatement();			
			ResultSet rs =st.executeQuery("Select * FROM emp");			
			System.out.println("List of record in emp table are : ");			
			while(rs.next()) {				
				System.out.println(rs.getString(1));				
				System.out.println(" "+rs.getInt(2));
			}
			con.close();
			System.out.println("closed the db connection scccesfully...");	
		    } catch (ClassNotFoundException e) {
	     	}catch (SQLException ex) {
				System.out.println(ex);					
				}			}
		}
	
													// TODO Auto-generated catch block							
