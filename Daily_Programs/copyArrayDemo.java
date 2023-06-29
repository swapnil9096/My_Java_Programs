package Daily_Programs;

public class copyArrayDemo {
	public static void main(String[] args) {
		
		int arr1 [] = {1,2,4,5,6,7};
		int arr2 [] = {932,23,42,324,123,1};
		
		System.arraycopy(arr1, 0, arr2, 0, 7);
		
		for(int i=0 ; i < arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
	}
}
