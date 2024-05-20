package wipro1;



interface IMath{
	public int sum(int x,int y);
}
public class LambdaArgu {
	public static void main (String args[]) {
		IMath m1=(x,y) -> x+y;
		int x=20,y=30;
		int result =m1.sum(x,y);
		System.out.println("Sum is ::"+ result);
	}
}

