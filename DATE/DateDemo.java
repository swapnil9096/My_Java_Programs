package DATE;

import java.util.Date;

/*   year    the year minus 1900.
month   the month between 0-11.
date    the day of the month between 1-31.
hrs     the hours between 0-23.
min     the minutes between 0-59.
sec     the seconds between 0-59.
*/
public class DateDemo {
	public static void main(String[] args) {

		Date d= new Date();
		System.out.println(d); //this gives current date
		
		
		int dayValue =d.getDate();//It gives only Day in integer
		System.out.println(dayValue);
		
		Date d2 = new Date("2021/10/29");
		System.out.println("set date is 2021/10/29: " + d2);
		System.out.println(d.after(d2));  //true
		
		
		Date d3 = new Date("2021/10/2");
		System.out.println("d3 hashcode: " + System.identityHashCode(d3));
		System.out.println(d.after(d3));
		
		Date d51 = new Date("2024/10/2");
		System.out.println(d.after(d51)); //false
		
		Date d4 = (Date) d.clone();
		System.out.println("d4 :" + d4);

		
		System.out.println("d4 hashcode: " + System.identityHashCode(d4));
		
		Date d5= d4;
		System.out.println("d5 hashcode: " + System.identityHashCode(d5));

		
		//returns 0 if both dates are same
		// returns -1 if d < d2 where d=2021/10/27 and d2=2021/10/29
		// returns +1 if d > d3 where d=2021/10/27 and d2=2021/10/2 
		System.out.println("d.compareTo(d) : " + d.compareTo(d));
		System.out.println("d.compareTo(d2) : " + d.compareTo(d2));
		System.out.println("d.compareTo(d3) : " + d.compareTo(d3));

		System.out.println("d.equals(d5): " + d.equals(d5));
		System.out.println("d.equals(d2): " + d.equals(d2));

		System.out.println("d.getDay() :" + d.getDay()); // Monday:1, Tuesday:2, Wednesday:3, Thursday:4, Friday:5, Sat: 6, Sun:0

		
		//getDay() return int value
		System.out.println("new Date(\"2021/10/24\").getDay() :" + new Date("2021/10/24").getDay()); // 24: sun 
		System.out.println("new Date(\"2021/10/25\").getDay() :" + new Date("2021/10/25").getDay()); // 25: mon
		System.out.println("new Date(\"2021/10/26\").getDay() :" + new Date("2021/10/26").getDay());  // 26: Tue
		System.out.println("new Date(\"2021/10/27\").getDay() :" + new Date("2021/10/27").getDay());  // 27: Wed
		System.out.println("new Date(\"2021/10/28\").getDay() :" + new Date("2021/10/28").getDay());  // 28: Thu
		System.out.println("new Date(\"2021/10/29\").getDay() :" + new Date("2021/10/29").getDay());  // 29: Fri
		System.out.println("new Date(\"2021/10/30\").getDay() :" + new Date("2021/10/30").getDay());  // 30: Sat

		System.out.println("d.getTime()    : " + d.getTime());
		System.out.println("d.getHours()   : " + d.getHours());
		System.out.println("d.getMinutes() : " + d.getMinutes());
		System.out.println("d.getSeconds() : " + d.getSeconds());
		System.out.println("d.getMonth()   : " + d.getMonth()); // month starts from 0:Jan, dec:11

		System.out.println("d.getYear()    : " + d.getYear()); //121

		System.out.println("new Date(\"2023/1/27\").getYear()    : " + new Date("2023/1/27").getYear()); //123
		System.out.println("d.getTimezoneOffset(): " +d.getTimezoneOffset());  // -330: check if you get this value for IST always

		Date d1 = new Date();
		d1.setDate(7);// accepts day of the month 1-31 if d1's month contain 31 days, else 30 ro 28/29 depending on leap year
		System.out.println("d1.setDate : " + d1);

		d1.setHours(3);
		System.out.println("d1.setHours: " + d1);
		
		d1.setMinutes(40);
		System.out.println("d1.setMinutes: " + d1);
		
		d1.setSeconds(55);
		System.out.println("d1.setSeconds: " + d1);
		
		d1.setYear(122); // add 1900 to the argument becomes a year
		System.out.println("d1.setYear: " + d1);
		
		d1.setTime(1635114401100l);// milliseconds after January 1, 1970 00:00:00 GMT
		System.out.println("d1.setTime : " +d1); //Mon Oct 25 03:56:41 IST 2021
	
		System.out.println("d1.toString(): " + d1.toString());

		System.out.println("d1.toLocaleString(): " + d1.toLocaleString());
		System.exit(0);

		
	
			
	}

}
