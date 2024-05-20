package wipro4;
class Watsapp1{
	private static Watsapp1 watsappObject=null;

	private Watsapp1() {}

	public static Watsapp1 getInstance() {

		if (watsappObject==null)

			watsappObject=new Watsapp1();

		return watsappObject;

	}

}

public class Singletone {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Watsapp1 watsappObjFirstTime=Watsapp1.getInstance();

		System.out.println("Memory location of the Object:"+watsappObjFirstTime);

		Watsapp1 watsappObjSecondTime=Watsapp1.getInstance();

		System.out.println("Memory location of the Object:"+watsappObjSecondTime);

		Watsapp1 watsappObjThirdTime=Watsapp1.getInstance();

		System.out.println("Memory location of the Object:"+watsappObjThirdTime);

	}



}