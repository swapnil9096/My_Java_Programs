package Array_Programs;

public class Print3Darry {

	public static void main(String[] args) 
	{
		int[][][] a = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, } },
				{ { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24 } } };
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<a[0][0].length;k++)
				System.out.print(a[i][j][k]+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
}
