package Scanner_Class;

import java.util.Scanner;

public class userIputDemo
{
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter No 1:");
	int no1 = sc.nextInt();
	System.out.println("Enter No 2");
	int no2 = sc.nextInt();
	System.out.println("Addition"+(no1+no2));
	System.out.println("Enter String 1");
	String str1 = sc.next();
	String str3 = sc.nextLine();
	System.out.println("Enter Another String:");
	String str2 = sc.next();
	String str4 = sc.nextLine();
	System.out.println("Concatanation of string" +(str1+str3));
	sc.close();
	}
}
