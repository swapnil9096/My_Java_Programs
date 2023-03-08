package Daily_Programs;

public class Demo {
	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 6, 8 };
		int j;
		for (int i = 0; i < a.length-1; i++)
		{
					
				for (j = i + 1; j < a.length-1; j++)
				{	
					if (a[j+1] > a[j]) 
					{
						int t = a[j+1];
						a[j+1] = a[j];
						a[j] = t;//4
						System.out.println(a[j]);

					}

			}
		}}}
