package Basic_Assignment;
//WAP=>write a program to find the sum of first n even numbers
public class LoopAssignment22 {

	public static void main(String[] args) {
int sum=0;
for(int i=10;i<=20;i++)
{
 if(i%2==0)
	sum=sum+i;
}
System.out.println("sum of first n even numbers=>"+sum);
	}

}
