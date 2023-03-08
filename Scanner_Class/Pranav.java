package Scanner_Class;

import java.util.Scanner;

public class Pranav {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int n1=sc.nextInt();
		System.out.println("Enter second value");
		int n2= sc.nextInt();
		System.out.println((n1+n2));
		sc.close();
	}

}
