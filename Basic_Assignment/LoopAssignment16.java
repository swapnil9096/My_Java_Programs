package Basic_Assignment;
//WAP=> Write a program in java to find the sum of the even and odd digits of the number which is given as input
public class LoopAssignment16 {

	public static void main(String[] args) {
		int sum1=0,sum2=0;
	for(int i=10;i<=20;i++)
	{
		if(i%2==0)
		{
			sum1=sum1+i;
		}
		else if(i%2!=0)
		{
			sum2=sum2+i;
		}
	}
	System.out.println("Sum of even nos => "+sum1);
	System.out.println("sum of odd nos=> "+sum2);
	}

}
