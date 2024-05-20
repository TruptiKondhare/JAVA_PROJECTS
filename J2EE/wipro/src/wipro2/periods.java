package wipro2;




import java.time.LocalDate;

import java.time.Period;



public class periods {

	public static void main (String args[]) {

		Period p1=Period.ofDays(5);

		LocalDate id=(LocalDate) p1.addTo(LocalDate.now());

		System.out.println("Date after 5 days:: "+id);

				

	}



}
