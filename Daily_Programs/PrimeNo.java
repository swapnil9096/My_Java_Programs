package Daily_Programs;

public class PrimeNo {
	public static void main(String[] args) {
		int i = 0, j = 0;
		for (i = 1; i <= 100; i++)
		{
			for (j = 2; j <= i; j++) 
			{
				if (i % j == 0)
					break;
			}
			if (i == j) 
			{
				System.out.println(i + ",");
			}

		}

	}
	
}
