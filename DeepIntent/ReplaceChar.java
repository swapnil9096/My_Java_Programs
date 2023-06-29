package DeepIntent;

public class ReplaceChar {
	public static void main(String[] args) {

		String str = "Swapnil Bobade";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) 
		{
			if(i==0)
			{
				System.out.print(arr[i].replace('S', 's'));
				
			}else
			{
				System.out.println(arr[i].replace('S', 's'));
				
			}
	
		}
		
	}
}
