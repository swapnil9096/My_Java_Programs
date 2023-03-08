package for_Loop_Programs;

public class Fibo {

	public static void main(String[] args) {

		int a = 0, b = 1, res = 0;
		for (int i = 0; i <= 10; i++)// 0 1 2 3 4 5 6 7 8
		{
			// 0 1 1 2 3 5 8 13 21
			res = a + b;// 1 2 3 5 8 13 21 34 55
			a = b;// 1 1 2 3 5 8 13 21 34
			b = res;// 1 2 3 5 8 13 21 34 55
			System.out.print(a + ",");
		}
	}
}
