package Daily_Programs;

public class AdditonOfTwoMatrix {

	public static void main(String[] args) {
		int[][] a = { { 50, 60, 70, 80 }, { 10, 20, 30, 40 } };
		int[][] b = { { 90, 80, 70, 60 }, { 50, 40, 30, 20 } };
		int[][] c = new int[4][4];

		if (a.length == b.length && a[0].length == b[0].length && a[1].length == b[1].length) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{	
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
}