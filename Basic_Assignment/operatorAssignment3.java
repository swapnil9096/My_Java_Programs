package Basic_Assignment;

/*Write a program to add 8 to the number 2345 and then divide it by 3.
Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
Display the final result.
*/
public class operatorAssignment3 {

	public static void main(String[] args) 
	{
  int a=8,b=2345,c,res;
	c=a+b;
	System.out.println("Addition => "+c);
	System.out.println("Division => "+c/3);
	res=784%5;
	System.out.println("Modulus => "+res);
	System.out.println("Final Result => " +res*5);


	}

}
