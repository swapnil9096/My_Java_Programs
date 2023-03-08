package Daily_Programs;

import java.util.HashMap;
import java.util.Map;

public class FindOccurancesOfCharactor1 {

	public static void main(String[] args) {
		int cnt = 0;
		Map<Character, Integer> map = new HashMap<>();
		String str = "java is awesome";
		for (int i = 0; i <= str.length() - 1; i++)
			if (map.get(str.charAt(i)) == null)
				map.put(str.charAt(i), 1);
			else {
				cnt = map.get(str.charAt(i));
				cnt++;
				map.put(str.charAt(i), cnt);
			}
		System.out.println(map);
	}

}
