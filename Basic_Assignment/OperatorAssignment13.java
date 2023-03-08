package Basic_Assignment;
//Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
//E.g.- NUMBER : 12345        OUTPUT : 1+4=5

public class OperatorAssignment13 {

	public static void main(String[] args) 
	{
int n=123456789,secondlastdigit,firstdigit,sum;
firstdigit=n/100000000%10;

secondlastdigit=n/10%10;

sum=firstdigit+secondlastdigit;

System.out.println("First digit=> "+firstdigit);

System.out.println("Second Last digit=> "+secondlastdigit);

System.out.println("Sum of the first and the second last digit=> "+sum);
}

}






//int d5=n%10;
//
//int d4=n/10%10;
//
//int d3=n/100%10;
//
//int d2=n/1000%10;
//
//int d1=n/10000%10;
//
//int S=d5+d2;



