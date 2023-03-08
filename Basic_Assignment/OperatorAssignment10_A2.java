package Basic_Assignment;
//Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//2 - second program without using any third variable
public class OperatorAssignment10_A2 {

	public static void main(String[] args) 
	{
     int a=6,b=8;
     a=a+b;//a=30
     b=a-b;//b=30-10=20
     a=a-b;//a=30-20=10
     System.out.println("swap value of a=> " + a);
     System.out.println("swap value of b=> "+b);

	}

}
