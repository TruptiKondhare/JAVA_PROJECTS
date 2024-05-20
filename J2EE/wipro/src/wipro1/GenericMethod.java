package wipro1;

public class GenericMethod {

	public static <E> void printArray (E[] inputArray) {

		System.out.println();

		for (E e1: inputArray)

			System.out.print(e1 + ", ");
		

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Integer[] intArray = {1,2,3,4,5};

		Double[] doubleArray= {1.1,1.2,1.3,1.4,1.5};

		Character [] charAArray={'j','a','v','d'};

		printArray (intArray);

		printArray (doubleArray);

		printArray (charAArray);



	}



}