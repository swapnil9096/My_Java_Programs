package ExceptionHandling;

public class FindLengthWithoutUsingLengthFun {

	public static void main(String[] args) {
		String city ="Swapnil...";
		int cnt = 0;
		try {
			while (true)
			{
				char c = city.charAt(cnt);
				cnt++;
			}	
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(cnt);
		}
	}
}
