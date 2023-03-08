package Basic_Assignment;

/*//WAP=>o	Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
o	4! = 1*2*3*4 = 24
o	3! = 3*2*1 = 6
o	2! = 2*1 = 2
o	Also,
o	1! = 1
o	0! = 0
o	Write a Java program to calculate factorial of a number
*/
public class LoopAssignment7 {

	public static void main(String[] args) 
	{
int n=5,mult=1;
for(int i=1;i<=n;i++)

	mult= mult*i;//1 2 6 24
	

System.out.println("5!= 5*4*3*2*1"+"=> "+mult);
	}

}
