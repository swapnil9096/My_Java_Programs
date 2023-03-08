package Array_Programs;

public class SumOf2DarrayElements{

	public static void main(String[] args) 
	{
			int [][] a= {{1,2,3,4},
					     {5,6,7,8}};
			int sum=0;
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					  sum=sum+a[i][j];
					
				}
				System.out.println(sum);
				}
	}

	
}
