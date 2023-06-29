package DeepIntent;

public class ArraySorting {

	public static void main(String[] args) {

		int arr [] = {12,2387,23,56,98,34,2};
		
		for(int i=0;i < arr.length;i++)
		{
			for(int j= i+1;j < arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
				int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int sum = arr[arr.length-1] + arr[arr.length-2];
		System.out.println(sum);
	}
}
