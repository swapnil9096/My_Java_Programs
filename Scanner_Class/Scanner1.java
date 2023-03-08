package Scanner_Class;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) 
	{
		Scanner ok=new Scanner(System.in);
		System.out.println("Enter no");
		int a=ok.nextInt();
		
			if(a%2==0)
			{
				System.out.println("it is even no");
			}
			else
			{
				System.out.println("not");
			}
			
			ok.close();
	}

}
