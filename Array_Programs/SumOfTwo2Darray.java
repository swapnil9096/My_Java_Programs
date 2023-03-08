package Array_Programs;

public class SumOfTwo2Darray {

	public static void main(String[] args) {
		int[][] a = { { 25, 40, 30 }, { 10, 20, 20 } };
		int[][] b = { { 25, 35, 10 }, { 15, 10, 20 } };
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				c[i][j] = b[i][j] + a[i][j];
				System.out.print(c[i][j]+"\t");

			}
			System.out.println();
		}
	}
}
