package wipro2;

import java.time.LocalTime;

import java.time.ZoneId;

import java.util.Set;

public class TimeZone {

	public static void main(String args[]) {

		LocalTime it=LocalTime.now(ZoneId.of("Singapore"));

		System.out.println("Current time in singapore :"+ it);

		Set<String> zoneset =ZoneId.getAvailableZoneIds();

		System.out.println("List of zones are :");

		for (String zone :zoneset)

			System.out.println(zone);

		

		

	}



}