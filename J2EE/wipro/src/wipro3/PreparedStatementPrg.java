package wipro3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PreparedStatementPrg {
	public static void main(String[] args) {		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
			System.out.println("connected to database...");	
			String strQry="Insert INTO emp (name,sal)VALUES(?,?)";	
			PreparedStatement ps=con.prepareStatement(strQry);
			Scanner sc=new Scanner(System.in);
			System.out.println("Emter a name: ");			
			String strNAme=sc.next();	
			System.out.println("Emter a salary: ");			
			int sal=sc.nextInt();		
			ps.setString(1, strNAme);
			ps.setInt(2, sal);			
			ps.executeUpdate();			
			System.out.println("Inserted record in tha db succesfully...");			
			con.close();			
			System.out.println("closed the db connection scccesfully...");								
			} catch (ClassNotFoundException e) {			
				}catch (SQLException ex) {			
					System.out.println(ex);					
					}			
		}

	private void executeUpdate() {
	}

	private void setString(int i, String strNAme) {
		// TODO Auto-generated method stub
		
	}
		
	
}