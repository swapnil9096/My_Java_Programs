package Daily_Programs;

public class PefectNo {

	public static void main(String[] args) {
		int n = 28, sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) 
			{
				sum = sum + i;// 1 3
			}

		}
		if (n == sum) {
			System.out.println( n+ " It is perfect No");
		} else {
			System.out.println(n+ " It is NOT pefect no");
		}
	}

}
