package Java_Mock1;

public class FindAllDuplicates {

	public static void main(String[] args) {
		int[] a = { 22, 44, 33, 12, 34, 34, 22, 7, 12, 84 };
		
		for (int i = 0; i <= a.length - 1; i++)
		{
			for (int j = i + 1; j <= a.length - 1; j++) 
			{
				if (a[i] == a[j])
					System.out.println(a[i]);
			}
		}
			
	}

}
