package Basic_Assignment;
//write a program to find the division of 2 numbers without using /,% operators and print quotient and the remainder
public class LoopAssignment15 {

	public static void main(String[] args) 
	{
		int	n=11,sum=0,rem=0;
		boolean Flag=true;
		
		   for(int i=2;i<n;)		
		   {
		     rem=n%i; 
		    sum=sum+n;
		   i++;
		    if(rem!=1)
		    {
		    	Flag=false;
		    
		   // System.out.println(n+ "it is not prime no");
		  
		}
		    break;
		   }
		 
		   if(Flag==true)
		    		
		{
			   System.out.println("Prime factor of a "+n+"=> "+sum);
			//System.out.print(n+ " it is prime no");
		
		} 
}
}


