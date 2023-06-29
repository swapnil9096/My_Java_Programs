package Daily_Programs;

public class FindLengthWithoutUsingLengthFuction {

	public static void main(String[] args) {
		int cnt = 0;
		try {
			String str = "Hello";
			while (true) 
			{
				 str.charAt(cnt);
				cnt++;
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(cnt);
		}
	}

}
