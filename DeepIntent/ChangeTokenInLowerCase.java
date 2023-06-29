package DeepIntent;

public class ChangeTokenInLowerCase {

	public static void main(String[] args) {
		
		String str = "Swapnil Bobade";
		
		String arr[] = str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].toLowerCase());
		}
		
	}
	
}
