package DATE;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Subtract2DaysDemo {
public static void main(String[] args) {
	LocalDate d1 = LocalDate.parse("2019-05-06"); //, DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate d2 = LocalDate.parse("2020-10-23"); //, DateTimeFormatter.ISO_LOCAL_DATE);

    LocalDate d3 = LocalDate.parse("2019-05-06");//, DateTimeFormatter.ISO_LOCAL_DATE);
    LocalDate d4 = LocalDate.parse("2020-10-23"); //, DateTimeFormatter.ISO_LOCAL_DATE);

    Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());

    Period period = Period.between(d3, d4);
    long diffDays = diff.toDays();  ///536 days
    int years = Math.abs(period.getYears()); //1 
    int months = Math.abs(period.getMonths());// 5months 
    int days = Math.abs(period.getDays()); // 17 days
    System.out.println("Diffrence between dates is : "+diffDays + " days");
    System.out.println("Diffrence is : "+years+" year, "+months+" months, "+days+" days");
}
}
