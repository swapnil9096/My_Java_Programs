package Scanner_Class;

import java.util.Scanner;

public class Table29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);// 5 10 15..
		}
		sc.close();
	}

}
