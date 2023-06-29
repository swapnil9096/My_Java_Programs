package Daily_Programs;

public class LeapYearDemo {
public static void main(String[] args) {
	
	int year = 2025;
	
	if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
	{
		System.out.println("This is Leap Year");
	}else
		System.out.println("This is not leap year");
}
}
