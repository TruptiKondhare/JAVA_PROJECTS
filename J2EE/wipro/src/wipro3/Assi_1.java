
package wipro3;
import java.sql.*;
import java.util.Scanner;
public class Assi_1 {
    public static void main(String[] args) {
        try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","admin");			
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Insert Record");
                System.out.println("2. Update Record");
                System.out.println("3. Delete Record");
                System.out.println("4. Display All Records");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        insertRecord(conn, scanner);
                        break;
                    case 2:
                        updateRecord(conn, scanner);
                        break;
                    case 3:
                        deleteRecord(conn, scanner);
                        break;
                    case 4:
                        displayRecords(conn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }

            } while (choice != 5);
            conn.close(); // Close the connection when done
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void insertRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Inserting a record...");
    }
    private static void updateRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Updating a record...");
    }
    private static void deleteRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Deleting a record...");
    }
    private static void displayRecords(Connection conn) throws SQLException {
        System.out.println("Displaying all records...");

    }

}
