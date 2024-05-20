package wipro5;
import java.util.Scanner;
interface Loan {
 double getInterestRate();
}

//Concrete Educational Loan class
class EducationalLoan implements Loan {
 @Override
 public double getInterestRate() {
     return 0.10; }}

//Concrete Housing Loan class
class HousingLoan implements Loan {
 @Override
 public double getInterestRate() {
     return 0.12; // 12%
 }}

//Concrete Business Loan class

class BusinessLoan implements Loan {
 @Override
 public double getInterestRate() {
     return 0.15; // 15%
 }
}
//Factory class to create different types of loans

class LoanFactory {
 public static Loan getLoan(String type) {
     switch (type.toLowerCase()) {
         case "educational":
             return new EducationalLoan();
         case "housing":
             return new HousingLoan();
         case "business":
             return new BusinessLoan();
         default:
             return null;   }
 }
}

public class asi2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the type of loan (Educational, Housing, Business): ");
     String loanType = scanner.nextLine();
     Loan loan = LoanFactory.getLoan(loanType);
     if (loan != null) {
         double interestRate = loan.getInterestRate();
         System.out.println("The interest rate for " + loanType + " loan is " + (interestRate * 100) + "%.");
     } else {
         System.out.println("Invalid loan type.");
     }
 }

}
