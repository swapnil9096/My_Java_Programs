package Daily_Programs;

public class TrishulePattern {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 8; i++) 
		{
			if (i == 1 || i == 4 || i == 7)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++)
		{
			if (i == 1 || i == 4 || i == 7)
				System.out.print("*");
			else
				System.out.print(" ");
		}	
		System.out.println();
		
		for (int k = 1; k <= 7; k++)
		{
			System.out.print("*");
		}	
		System.out.println();

		for (int i = 1; i <= 4; i++) 
			System.out.println("   *");
		
		
		
		
	}
}
