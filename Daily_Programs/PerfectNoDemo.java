package Daily_Programs;

public class PerfectNoDemo {
	public static void main(String[] args) 
	{
		for(int i=1;i<30;i++)
		{
			if(isPerfectNo(i))
				System.out.println(i);
		}
	}
	
	private static boolean isPerfectNo(int p)
	{
		int sum=0;
		for(int i =1 ;i<p;i++)
		{
			if(p%i==0)
			{
				sum=sum + i;
			}
		}
		if(p==sum)
			return true;
		else
			return false;
	}

}
