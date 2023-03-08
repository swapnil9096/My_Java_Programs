package DATE;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {
	// All LocalDate, LocalTime, LocalDateTime are immutable classes
		// all modification will return new object

		public static void main(String[] args) throws InterruptedException {
			 LocalDate today = LocalDate.now();
			 System.out.println("Current date: "+ today);
			 	
			 LocalDateTime currentDateTime = LocalDateTime.now();
			 System.out.println("Current DateTime: "+ currentDateTime);
			 //Thread.sleep(3000l);
			 LocalTime CurrentTime = LocalTime.now();
			 System.out.println("Current Time: "+ CurrentTime );
				 // Get characteristics of a date
	/*		 System.out.println("today.getDayOfWeek() : " + today.getDayOfWeek());
			 System.out.println("today.getDayOfMonth(): " + today.getDayOfMonth());
			 System.out.println("today.getDayOfYear() : " + today.getDayOfYear());
			 System.out.println("today.getYear()      : " + today.getYear());
			 System.out.println("today.getMonth()     : " + today.getMonth());
			 System.out.println("today.getMonthValue(): " + today.getMonthValue());
	*/
		/*	 System.out.println("today.isLeapYear()   : " + today.isLeapYear());
			 System.out.println("Total Days in a year : " + today.lengthOfYear());
			 System.out.println("Total Days in a month: " + today.lengthOfMonth());
		*/
	/*		 // Operations on date/time	 
			 System.out.println("Days after 10 days     : " + today.plusDays(10));
			 System.out.println("Days after 100 days    : " + today.plusDays(100));
			 System.out.println("Days after 1000 days   : " + today.plusDays(1000));
			 System.out.println("Weeks after 5 weeks    : " + today.plusWeeks(5));
			 System.out.println("Days after 12 months   : " + today.plusMonths(12));
			 System.out.println("Days after 12 years    : " + today.plusYears(12));
			*/	
			 /*
			 System.out.println("Days before 10 days     : " + today.minusDays(10));
			 System.out.println("Days before 100 days    : " + today.minusDays(100));
			 System.out.println("Days before 1000 days   : " + today.minusDays(1000));
			 System.out.println("Weeks before 5 weeks    : " + today.minusWeeks(5));
			 System.out.println("Days before 12 months   : " + today.minusMonths(12));
			 System.out.println("Days before 12 years    : " + today.minusYears(12));
			*/
			 // can create instance of new date as below 
			// LocalDate hundredYearsBefore = today.minusYears(100);
			// System.out.println("100 years before : " + hundredYearsBefore);
			 // today will not change though
			 //today = today.minusYears(100);		 
			 System.out.println("today : " + today);
					 
	// LocalTime operations: Similar operation as that of LocalDate are present
	//you can add or subtract hours, minutes, seconds, Nanos, 
			 	 System.out.println("=================");
			 LocalTime now = LocalTime.now();
			 System.out.println("Curren time     : " + now);
			 System.out.println("now.getHour     : " + now.getHour());
			 System.out.println("now.getMinute   : " + now.getMinute());
			 System.out.println("now.getSecond   : " + now.getSecond());
			 System.out.println("now.getNano     : " + now.getNano());
			 LocalDate hundredYearsBefore = today.minusYears(100);

			 System.out.println("today.getChronology: " + today.getChronology());
		
			 
			 // compare and set dates
			 LocalDate yesterday = LocalDate.of(2021, 12, 05);   
			 System.out.println("yesterday: " + yesterday);
			
	 
			 // compare dates
			 System.out.println("Today      :" + today);
			 System.out.println("Yesterday  :" + yesterday);
			 
			 System.out.println("today.isBefore(yesterday) : " + today.isBefore(yesterday));
			 System.out.println("today.isAfter(yesterday)  : " + today.isAfter(yesterday));
			 System.out.println("yesterday.isBefore(today) : " + yesterday.isBefore(today));
			 System.out.println("yesterday.isAfter(today)  : " + yesterday.isAfter(today));
			 
		}
}
