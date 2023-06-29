package Daily_Programs;

public class ArraySorting {
	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 43, 63, 23 };
		int i;
		for (i = 0; i <= arr.length - 1; i++) 
		{
			for (int j = i + 1; j <= arr.length - 1; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + ",");
		}
	}
}
