package Daily_Programs;

public class LeapYear {

	public static void main(String[] args) {
		int year=2016;
		if((year%4==0 && year%100!=0) ||year%400==0)
		{
			System.out.println("It Is Leap Year");
		}
		else
		{
			System.out.println("NOT leap year");
		}
	}

}
