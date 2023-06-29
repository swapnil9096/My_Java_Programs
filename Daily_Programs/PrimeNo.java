package Daily_Programs;

public class PrimeNo {
	public static void main(String[] args) {
	
		int n = 7;
		int j;
		for(j=2;j<=7;j++)
		{
			if(n%j==0)
				break;
		}
		
		if(n==j)
		{
			System.out.println("Its prime No");
		}else 
			System.out.println("Not Prime No");
		
	}
}
