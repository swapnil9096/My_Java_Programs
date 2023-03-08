package Basic_Assignment;
//Write a program to calculate the sum of the digits of a 3-digit number.
//Number : 132        Output : 6

public class OperatorAssignment15 {

	public static void main(String[] args) {
int n=123,sum,first,second,third;
first=n/100%10;
second=n/10%10;
third=n%10;
sum=first+second+third;
System.out.println("sum of the digits of a 3-digit number=> "+sum);

	}

}
//int d5=n%10;
//
//int d4=n/10%10;
//
//int d3=n/100%10;
//
//int d2=n/10000%10;
//
//int d1=n/10000%10;
//
//int S=d5+d2;