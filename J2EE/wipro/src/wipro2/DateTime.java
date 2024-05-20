package wipro2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class DateTime {
	public static void main (String args[]) {
		LocalDate Id=LocalDate.now();

		System.out.println("Today date is ::"+Id);

		int day=Id.getDayOfMonth();

		int month=Id.getMonthValue();

		int year =Id.getYear();

		System.out.println("Today date is: "+day+"-"+month+"-"+year);

		LocalTime It=LocalTime.now();

		System.out.println("current time is::"+It);

		int hour=It.getHour();

		int min =It.getMinute();

		int second=It.getSecond();

		System.out.println("Current time is :"+hour+":"+min+":"+second);

		LocalDateTime Idt=LocalDateTime.now();

		System.out.println("Current Date and time :"+Idt);

		}



}
