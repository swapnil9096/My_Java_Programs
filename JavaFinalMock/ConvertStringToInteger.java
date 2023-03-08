package JavaFinalMock;

import java.util.Scanner;
//WAP Convert String to Integer 
public class ConvertStringToInteger {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String str = sc.next();
			int a = Integer.parseInt(str);
			System.out.println(a + 2);
		} catch (NumberFormatException e) {
			System.err.println("The given string can not be converted into Integer..!!");
		}
	}

}
