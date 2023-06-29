package Programs10;

public class PrimeNo {
public static void main(String[] args) {
	
	int n =9;
	int i;
	for( i = 2 ; i <= n ; i++)
	{
		if (n % i == 0)
			break;
	}
	if(n==i)
	{
		System.out.println("It is Prime No");
	}else 
		System.out.println("Not prime No");
}
}
