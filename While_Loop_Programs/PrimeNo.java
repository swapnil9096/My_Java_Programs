package While_Loop_Programs;

public class PrimeNo
{

	public static void main(String[] args)
 {
    int n=9,i=2, sum=0;
    boolean flag=true;
    while(i<n)
   {
    	sum=n%i;
    	i++;
    	
    	if(sum!=1)
    	{		
    	flag=false;
    	System.out.print(n+ " it is not prime no");
   }
    		break;
    }
      if(flag==true)
    {
	  System.out.print(n+ " it is prime no");
    }
  }

}
