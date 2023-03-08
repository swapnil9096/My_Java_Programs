
package for_Loop_Programs;

public class PrimeNO {

	public static void main(String[] args) {

		int n = 11, rem = 0;
		boolean Flag = true;

		for (int i = 2; i < n;i++) 
		{
			rem = n % i;
			

			if (rem != 1)

			{
				Flag = false;

				System.out.println(n + "it is not prime no");

			}
			break;
		}

		if (Flag == true)

		{
			System.out.print(n + " it is prime no");

		}
	}
}
