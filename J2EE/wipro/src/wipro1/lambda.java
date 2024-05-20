package wipro1;



interface ITest{
	public  void display();
}
public class lambda {
	public static void main (String args[]) {
		ITest t1=() -> System.out.println("Displaying information on a lmbda....");
		t1.display();
	}
}
