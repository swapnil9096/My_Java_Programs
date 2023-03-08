package Daily_Programs;

public class StratHash {

	public static void main(String[] args) {
		System.out.println("#");
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
				if (j == i) 
				{
					System.out.println("#");
				}
			}
		}
	}
}
//output
//#
//*#
//**#
//***#
//****#
//*****#
