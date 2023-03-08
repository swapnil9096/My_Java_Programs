package Array_Programs;

public class SumOf3Darray {

	public static void main(String[] args) {
		int[][][] a = { { { 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30 } },{ { 40, 40, 40 }, { 50, 50, 50 }, { 20, 20, 20 } } };
		int[][][] b = { { { 15, 10, 10 }, { 25, 20, 20 }, { 35, 30, 30 } },{ { 45, 40, 40 }, { 55, 50, 50 }, { 25, 20, 20 } } };
		int[][][] c= new int  [10][10][10];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				{
					for (int k = 0; k < a[0][0].length; k++) 
					{

						c[i][j][k]=a[i][j][k]+b[i][j][k];
						System.out.print(c[i][j][k]+"\t");
					}
					
				}

			}
						System.out.println();
		}

	}

}
