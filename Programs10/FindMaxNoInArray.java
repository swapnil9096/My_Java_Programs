package Programs10;

public class FindMaxNoInArray {
public static void main(String[] args) {

	
	int [] arr = {23,42,44,131,2311,432};
	
	int max = arr[0];
	for(int i = 0 ; i <= arr.length-1 ;i++) 
	{
		if(arr[i]>max)
			max = arr[i];
	}
	System.out.println(max);
}
}
