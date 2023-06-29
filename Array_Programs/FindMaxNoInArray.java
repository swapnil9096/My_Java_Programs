package Array_Programs;

public class FindMaxNoInArray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,55,6,7,8,9,10};
		int max = a[0] ;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		System.out.println(max);
	}
}
