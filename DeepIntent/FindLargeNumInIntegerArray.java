package DeepIntent;

public class FindLargeNumInIntegerArray 
{
	public static void main(String[] args) 
	{

		int[] a = { 12, 31, 2, 1, 43, 322, 1 };

		int maxNo = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (a[i] < maxNo) 
			{
				maxNo = a[i];
			}
		}
		System.out.println(maxNo);
	}
}
