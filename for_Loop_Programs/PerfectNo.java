package for_Loop_Programs;

public class PerfectNo {

	public static void main(String[] args) {

		int n = 28, Sum = 0;
		for (int i = 1; i < n; i++)// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 27
		{
			if (n % i == 0) {
				Sum = Sum + i; // 1 3 7 14 28
			}
		}
		if (Sum == n) {
			System.out.print(n + " Is a Perfect Number");
		} else {
			System.out.print(n + "is NOT a Perfect Number");
		}

	}
}
