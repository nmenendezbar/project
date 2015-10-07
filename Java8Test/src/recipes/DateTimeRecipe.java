package recipes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeRecipe {
	
	public static void main(String[] args) {
		
		//Incorporating the Current Date and Time
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		//Obtaining a Date from a Specified String
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate yearStart = LocalDate.parse("01/01/2014", formatter);
		
		//Performing Date-Time Calculations
		LocalDate myDate = LocalDate.now();
		LocalTime myTime = LocalTime.now();

		LocalDate datePlusDays = myDate.plusDays(15);
		System.out.println("Today Plus 15 Days: " + datePlusDays);
		LocalDate datePlusWeeks = myDate.plusWeeks(8);
		System.out.println("Today Plus 8 weeks: " + datePlusWeeks);

		LocalTime timePlusHours = myTime.plusHours(5);
		LocalTime timeMinusMin = myTime.minusMinutes(30);

		System.out.println("Time Plus 5 Hours: " + timePlusHours);
		System.out.println("Time Minus 30 Minutes: " + timeMinusMin);
		
	}
}
