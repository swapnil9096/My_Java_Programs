package Array_Programs;

public class Array3D {
public static void main(String[] args) {
	int [][][] a= {{{1,2,3,4},{5,6,7,8},{9,8,7,6}},
				   {{10,11,12,13},{14,15,16,17},{18,19,20,21}}
	  			  };
	
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[0][0].length);
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
