package Daily_Programs;

public class ArmstrongNo {

	public static void main(String[] args) {
		int sum, n1, n2, n3, first, second, third;
		System.out.print("Armstrong numbers 100 to 500 =>");
		for (int i = 1; i <= 500; i++) 
		{
			n1 = i / 100 % 10;// 153/1%10=1
			n2 = i / 10 % 10;// 153/10=15%10=5
			n3 = i % 10;// 153%10=3

			first = n1 * n1 * n1;// 1
			second = n2 * n2 * n2;// 125
			third = n3 * n3 * n3;// 27
			sum = first + second + third;// 153

			if (i == sum) {
				System.out.print(i + " ");
			} else
				System.out.print("");
		}
	}

}
