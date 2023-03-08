package Basic_Assignment;

/*WAP=>  Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/
public class LoopAssignment9 {

	public static void main(String[] args) 
	{
     int sum=0,product=1;
     float avg=0.0f;
     for(int i=1;i<=10;i++) //1 2 3 4 5 6 7 8 9 10
     {
    	 sum=sum+i;//1 3 6 10 15 21 28 36 45 55
    	 product=product*i;//1 2 6 24 120 720 5040 40320 362880 19958400
     }
     avg=sum/10;
     System.out.println("The average of all values is"+avg);//5.5
     System.out.println("The product of all values is"+product);
	}

}
