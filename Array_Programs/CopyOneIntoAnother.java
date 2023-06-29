package Array_Programs;

public class CopyOneIntoAnother {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,5,6,7};
		int [] arr2 = new int [arr1.length];
		int i;
		for(i=0; i < arr1.length-1;i++)
		{
			arr2[i] = arr1[i];
			System.out.print(arr2[i]);
		}
		
	}

}
