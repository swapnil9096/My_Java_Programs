package DATE;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DiffBetween2DatesUsingUntil {

	public static void main(String[] args) {
		LocalDate dBefore = LocalDate.parse("2021-03-20"); //, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate dAfter    = LocalDate.parse("2021-04-25"); //, DateTimeFormatter.ISO_LOCAL_DATE);

        long diff = dBefore.until(dAfter,ChronoUnit.DAYS);
        System.out.println("difference in days : "+diff +" days");
        
        long diffMonths = dBefore.until(dAfter,ChronoUnit.MONTHS);
        System.out.println("difference in months : "+diffMonths +" months");
        
        long diffWeeks = dBefore.until(dAfter,ChronoUnit.WEEKS);
        System.out.println("difference in weeks : "+diffWeeks+" weeks");

        long diffYears = dBefore.until(dAfter,ChronoUnit.YEARS);
        System.out.println("difference in years : "+diffYears+" years");
	}

}
