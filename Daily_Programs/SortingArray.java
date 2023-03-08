package Daily_Programs;

public class SortingArray {

	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 6, 8 };
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				for (j = i + 1; j < a.length; j++)
					
					if (a[i] > a[j]) 
					{
						int t = a[i];
						a[i] = a[j];
						a[j] = t;//4 
					}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j] + " ");
		}
	}

}
