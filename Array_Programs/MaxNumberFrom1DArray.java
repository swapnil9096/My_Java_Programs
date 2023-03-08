package Array_Programs;

public class MaxNumberFrom1DArray {

	public static void main(String[] args) {
		int[] a= {100,200,30,5};
		int max=0;
		for(int i=0;i<=3;i++)
		{
			if(a[i]>=max)
				max=a[i];
		}
			
		System.out.print(max);
	}

}
