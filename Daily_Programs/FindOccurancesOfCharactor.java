package Daily_Programs;

import java.util.HashMap;
import java.util.Map;
//WAP=> To find the occurrences of characters
public class FindOccurancesOfCharactor {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String s1 = "java is awesome";
		
		for (int i = 0; i < s1.length(); i++)
		{
			if (map.get(s1.charAt(i)) == null) 
		 	{
				map.put(s1.charAt(i), 1);
			} else
			{
				int cnt = map.get(s1.charAt(i));
				cnt++;
				map.put(s1.charAt(i), cnt);
			}
		}
		System.out.println(map);

	}
}