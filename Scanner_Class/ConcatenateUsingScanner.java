package Scanner_Class;

import java.util.Scanner;

public class ConcatenateUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		{
		System.out.print("Enter first string:");
		String s1=sc.next();
		System.out.print("Enter second string:");
		String s2=sc.next();
		System.out.println("Concatenation of 2 Strings:"+(s1+s2));
		//sc.close();
		}
Scanner sc1= new Scanner(System.in);

	System.out.println("Enter first name:");
	String n1=sc1.nextLine();
	System.out.println("Enter second name:");
	String n2=sc1.nextLine();
	System.out.println("Concatenation of 2 names:=>"+(n1+n2));
	sc1.close();
	}
	}


