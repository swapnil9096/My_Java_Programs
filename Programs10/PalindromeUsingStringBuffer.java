package Programs10;

public class PalindromeUsingStringBuffer {

	public static void main(String[] args) {
		
		String org = "Madam";
		StringBuffer sb = new StringBuffer();
		
		sb.append(org);
		sb.reverse();
		String str = String.valueOf(sb);
		
		if(str.equalsIgnoreCase(org))
		{
			System.out.println("Given String is Palindrome");
		}else
			System.out.println("Given String is NOT palindrome");
		
	}

}
