package Daily_Programs;

public class ArraySorting2 {
	public static void main(String[] args) {
		
		int a[] = {12,2,324,443,534,34234,12,1,32,311};
		
		for(int i = 0; i < a.length;i++)
		{
			for(int j = i+1; j < a.length;j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i]	 = a[j];
					a[j]	 = temp;
				}
			}
			System.out.print(a[i] + ",");
		}
	}
}
