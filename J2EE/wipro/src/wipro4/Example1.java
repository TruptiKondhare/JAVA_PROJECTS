package wipro4;

public class Example1 {
    public static void main(String[] args) {
        // Create objects of subclasses
        Bank_from accountClosing = new Account_closing();
        Bank_from accountOpening = new AccountOpening();

        // Call makeSound method on objects
        accountClosing.openForm(); 
        accountOpening.openForm(); 
    }
}


