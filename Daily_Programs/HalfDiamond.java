package Daily_Programs;

public class HalfDiamond {
	public static void main(String[] args) {
		int sp = 1, rows = 4, star = 7;

		for (int j = 1; j <= rows; j++)
		{
			for (int k = 1; k <= sp; k++) 
			{
				System.out.print(" ");
			}
			for (int i = 1; i <= star; i++)// 5
			{
				System.out.print("*");
			}
			System.out.println();
			sp++;
			star -= 2;
		}

	}
}
