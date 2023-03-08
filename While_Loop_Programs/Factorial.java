package While_Loop_Programs;

public class Factorial {

	public static void main(String[] args)
	{
		int n=5,i=n,mult=1;
		while(i>=1)
		{
			mult=mult*i;
			i--;
			
		}
		System.out.println("factorial of n: " + mult);
	}
	

}
