package Basic_Assignment;
//Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
//bof 100 ), write a program to calculate his total marks and percentage marks.

public class OperatorAssignment16 {

	public static void main(String[] args) {
int a=123,r;
System.out.print("Reverse value: ");
for(;a>0;)
{
	r=a%10;//3 2 1
	a=a/10;//12 1 
	System.out.print(r);

}

	}

}
