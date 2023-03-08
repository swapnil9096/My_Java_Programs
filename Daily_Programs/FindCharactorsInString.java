package Daily_Programs;

public class FindCharactorsInString {
	public static void main(String[] args) 
	{
		String str = new String("Swapnil");
		int cnt = 0;
		String charactor = "";
		for (int i = 0; i < str.length(); i++)
		{
			charactor = charactor + str.charAt(i);
			cnt++;
		}
		System.out.println(cnt);
	}
}
