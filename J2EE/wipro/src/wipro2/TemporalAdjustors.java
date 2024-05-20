
package wipro2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustors {
public static void main (String args[]) {
LocalDate Id = LocalDate.now();
LocalDate firstDayOfMonth=Id.with(TemporalAdjusters.firstDayOfMonth());
System.out.println("First day of this month:"+ firstDayOfMonth);

LocalDate lastDayOfMonth=Id.with(TemporalAdjusters.lastDayOfMonth());
System.out.println("First day of this month:"+ lastDayOfMonth);

LocalDate dateOfNextMonday=Id.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
System.out.println("First day of this month:"+ dateOfNextMonday);



}

}
