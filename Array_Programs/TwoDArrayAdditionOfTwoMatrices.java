package Array_Programs;

public final class TwoDArrayAdditionOfTwoMatrices
{
	public static void main(String[] args)
	{
		int [][] a= {{10,12,34},{20,21,87}};
	
		int [][] b= {{12,23,76},{12,32,56}};
	
		int [][] sum=new int[5][5];
		
		if((a.length==b.length) && (a[0].length==b[0].length))
				{
			for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<b[i].length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
			for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<b[i].length;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
		   System.out.println();
				  }
	}
 }
}