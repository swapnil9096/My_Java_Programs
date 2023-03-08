package Method_Programs;

public class PerfectNoUsingMethod {

	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) 
		{
			if (isPerfectNo(n)) 
			{
				System.out.println(n);
			}
		}

	}

	static boolean isPerfectNo(int p) {
		int Sum = 0;
		for (int i = 1; i < p; i++)// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 27
		{
			if (p % i == 0)

				Sum = Sum + i; // 1 3 7 14 28//1 3 6
		}
		if (p == Sum) // p=6
			return true;
		else
			return false;

	}

}
