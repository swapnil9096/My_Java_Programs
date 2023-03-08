package Scanner_Class;

import java.util.Scanner;

public class UserInputDemo 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1:");
		int no1=sc.nextInt();
		System.out.println("Enter Number2:");
		int no2=sc.nextInt();
		System.out.println("Addition:"+(no1+no2));
		sc.close();
		
		
	}




}
