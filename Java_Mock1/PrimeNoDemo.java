package Java_Mock1;

public class PrimeNoDemo {

	public static void main(String[] args) {
		PrimeNoDemo obj = new PrimeNoDemo();
		obj.isPrime();

	}

	void isPrime() {

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