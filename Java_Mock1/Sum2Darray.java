package Java_Mock1;

public class Sum2Darray {

	public static void main(String[] args) {
		int [][] a = {{10,20,30},{2,4,5}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
		}

}
