package Basic_Assignment;
//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
public class OperatorAssignment14 {

	public static void main(String[] args) {
int n=5696,first,second,third,fourth;
System.out.println("Original Number=> "+n);
first=(n/1000%10)+2;

//System.out.println(first);

second=(n/100%10)+2;

//System.out.println(second);

third =(n/10%10)+2;

//System.out.println(third);

fourth=(n%10)+2;

//System.out.println(fourth);

System.out.print("Changed Number=> "+""+first+""+second+""+third+""+fourth+"");
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